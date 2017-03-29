package com.ma.desgin.model;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by binbin.ma on 2017/3/29.
 */

public class RcyModelAdater extends RecyclerView.Adapter<RcyModelAdater.ViewHolder>{

    public String[] list ;
    public MItemClickListener itemClickListener ;

    public RcyModelAdater(String[] list,MItemClickListener itemClickListener){
        this.list = list ;
        this.itemClickListener = itemClickListener ;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rcy,parent,false) ;
        return new ViewHolder(view,itemClickListener);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(list[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    public interface MItemClickListener{
        void onItemmClickListener(View view,int postion);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView textView ;
        private MItemClickListener  mListener ;
        public ViewHolder(View itemView, MItemClickListener  listener) {
            super(itemView);
            mListener = listener ;
            textView = (TextView) itemView.findViewById(R.id.tvModelName);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if(mListener != null){
                mListener.onItemmClickListener(v,getPosition());
            }
        }

    }
}
