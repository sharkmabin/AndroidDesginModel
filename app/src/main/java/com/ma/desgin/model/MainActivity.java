package com.ma.desgin.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.ma.desgin.model.abstractFactory.AbstractFactoryModel;
import com.ma.desgin.model.build.BuilderMode;
import com.ma.desgin.model.factory.FactoryModel;
import com.ma.desgin.model.factory.FactoryModel2;
import com.ma.desgin.model.factory.Person;
import com.ma.desgin.model.single.SingleMode;
import com.ma.desgin.model.template.TemplateModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcyList ;
    private RecyclerView.LayoutManager mLayoutManager ;

    String[] modelNames = new String[]{"单例","工厂方法","抽象工厂","模版方法","建造者","代理","原型","中介者","命令","责任链","装饰","策略","适配器","迭代器","组合","观察者","门面","备忘录","访问者","状态","解释器","享元","桥梁"};

    public void onToast(String modelName){
        Toast.makeText(this,"你点击了："+modelName+"模式",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcyList = (RecyclerView) findViewById(R.id.rcyList);

        mLayoutManager = new LinearLayoutManager(this);
        rcyList.setLayoutManager(mLayoutManager);
        rcyList.setHasFixedSize(true);

        rcyList.setAdapter(new RcyModelAdater(modelNames, new RcyModelAdater.MItemClickListener() {
            @Override
            public void onItemmClickListener(View view, int postion) {
                onToast(modelNames[postion]);
                switch (postion){
                    case 0:
                        SingleMode.getIInstance();
                        break;
                    case 1:
                        Person mPerson = new FactoryModel();
                        mPerson.say();
                        mPerson = new FactoryModel2();
                        mPerson.say();
                        break;
                    case 2:
                        AbstractFactoryModel.test();
                        break;
                    case 3:
                        TemplateModel.test();
                        break;
                    case 4:
                        BuilderMode.test();
                        break;




                }
            }
        }));



    }
}
