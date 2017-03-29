package com.ma.desgin.model.build;

/**
 * Created by binbin.ma on 2017/3/29.
 */

public class Lisi implements LateHome {
    @Override
    public void openDoor() {
         System.out.print("李四开门");
    }

    @Override
    public void haveDinner() {
        System.out.print("李四吃晚餐");
    }

    @Override
    public void sleep() {
        System.out.print("李四和老婆一起睡觉");
    }
}
