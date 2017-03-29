package com.ma.desgin.model.factory;

/**
 * Created by binbin.ma on 2017/3/29.
 */

public class FactoryModel implements Person{
    @Override
    public void say() {
        System.out.print("Hello factory 001 !");
    }
}
