package com.ma.desgin.model.proxy;

/**
 * Created by binbin.ma on 2017/3/30.
 */

public class SayProxy implements Say {
    Say say;

    public SayProxy(Say sayer) {
        // super();
        this.say = sayer;
    }

    @Override
    public void say(String what) {
        say.say(what);
    }

    public void say(String msg, String singname) {
        say.say(msg);
        sing(singname);
    }

    private void sing(String singname) {
        System.out.println("唱歌啊，老铁:" + singname);
    }
}
