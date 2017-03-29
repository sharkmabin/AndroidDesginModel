package com.ma.desgin.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcyList ;
    private RecyclerView.LayoutManager mLayoutManager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcyList = (RecyclerView) findViewById(R.id.rcyList);

        mLayoutManager = new LinearLayoutManager(this);
        rcyList.setLayoutManager(mLayoutManager);
        rcyList.setHasFixedSize(true);



    }
}
