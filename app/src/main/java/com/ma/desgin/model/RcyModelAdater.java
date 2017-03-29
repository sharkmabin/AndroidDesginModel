package com.ma.desgin.model;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by binbin.ma on 2017/3/29.
 */

public class RcyModelAdater {

    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView textView ;
        public ViewHolder(View itemView) {
            super(itemView);

        }
    }
}
