package com.ma.desgin.model.proxy;

/**
 * Created by binbin.ma on 2017/3/30.
 */

public class ProxyMode {
    /**
     * 代理模式
     *
     */
    public static void test() {
        // 不需要执行额外方法的
        Say say1 = new Person("张三", "扎心了，老铁！");
        say1.say("No ProXY Test");
        System.out.println("-----------------------------");
        // 需要执行额外方法的
        SayProxy sayProxy = new SayProxy(say1);
        sayProxy.say("张三", "好想和你一起吹吹风！");
    }
}
