package com.ma.desgin.model.build;

/**
 * Created by binbin.ma on 2017/3/29.
 */

public class BuilderMode {
    public static void test(){
        LateHome mlateHome = new ZhangSan();
        Director director = new Director(mlateHome) ;
        director.lateHome();
    }
}
