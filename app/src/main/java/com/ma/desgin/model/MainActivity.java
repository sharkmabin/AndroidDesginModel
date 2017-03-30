package com.ma.desgin.model;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.ma.desgin.model.BridgeMode.BridgeMode;
import com.ma.desgin.model.ChainOfResponsibilityModel.ChainOfResponsibilityModel;
import com.ma.desgin.model.CombinationMode.CombinationMode;
import com.ma.desgin.model.CommandMode.CommandMode;
import com.ma.desgin.model.DecorativeMode.DecorativeMode;
import com.ma.desgin.model.FlyweightMode.FlyweightMode;
import com.ma.desgin.model.IntermediaryModel.IntermediaryModel;
import com.ma.desgin.model.IteratorModel.IteratorModel;
import com.ma.desgin.model.MemoMode.MemoMode;
import com.ma.desgin.model.ObserverMode.NameObserver;
import com.ma.desgin.model.ObserverMode.ObserverMode;
import com.ma.desgin.model.ParserMode.ParserMode;
import com.ma.desgin.model.StateModel.StateModel;
import com.ma.desgin.model.StrategyMode.StrategyMode;
import com.ma.desgin.model.VisitorMode.VisitorMode;
import com.ma.desgin.model.WindowMode.WindowMode;
import com.ma.desgin.model.abstractFactory.AbstractFactoryModel;
import com.ma.desgin.model.build.BuilderMode;
import com.ma.desgin.model.clone.CloneMode;
import com.ma.desgin.model.factory.FactoryModel;
import com.ma.desgin.model.factory.FactoryModel2;
import com.ma.desgin.model.factory.Person;
import com.ma.desgin.model.proxy.ProxyMode;
import com.ma.desgin.model.single.SingleMode;
import com.ma.desgin.model.template.TemplateModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcyList ;
    private RecyclerView.LayoutManager mLayoutManager ;

    String[] modelNames = new String[]{"单例","工厂方法","抽象工厂","模版方法","建造者","代理","原型","中介者","命令","责任链","装饰","策略","迭代器","组合","观察者","门面","备忘录","访问者","状态","解释器","享元","桥梁"};

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
//     "适配器 模式"
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
                    case 5:
                        ProxyMode.test();
                        break;
                    case 6:
                        CloneMode.test();
                        break;
                    case 7:
                        IntermediaryModel.test1();
                        IntermediaryModel.test2();
                        break;
                    case 8:
                        CommandMode.test();
                        break;
                    case 9:
                        ChainOfResponsibilityModel.test();
                        break;
                    case 10:
                        DecorativeMode.test();
                        break;
                    case 11:
                        StrategyMode.test();
                        break;
                    case 12:
                        IteratorModel.test();
                        break;
                    case 13:
                        CombinationMode.test();
                        break;
                    case 14:
                        ObserverMode.test();
                        break;
                    case 15:
                        WindowMode.test();
                        break;
                    case 16:
                        MemoMode.test();
                        break;
                    case 17:
                        VisitorMode.test();
                        break;
                    case 18:
                        StateModel.test();
                        break;
                    case 19:
                        ParserMode.test();
                        break;
                    case 20:
                        FlyweightMode.test();
                        break;
                    case 21:
                        BridgeMode.test();
                        break;






                }
            }
        }));



    }
}
