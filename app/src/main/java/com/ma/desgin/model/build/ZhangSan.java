package com.ma.desgin.model.build;

/**
 * Created by binbin.ma on 2017/3/29.
 */

public class ZhangSan implements LateHome {
    @Override
    public void openDoor() {
        System.out.print("张三打开门");
    }

    @Override
    public void haveDinner() {
        System.out.print("张三吃晚餐");
    }

    @Override
    public void sleep() {
        System.out.print("张三自己一个人睡觉");
    }
}
