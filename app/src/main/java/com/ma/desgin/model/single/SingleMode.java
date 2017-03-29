package com.ma.desgin.model.single;

/**
 * Created by binbin.ma on 2017/3/29.
 */

public class SingleMode {
    private static SingleMode instance ;

    /**
     * 懒汉式单例
     * @return
     */
    public static SingleMode getInstance(){
        if (instance == null){

            instance = new SingleMode() ;
        }
        return instance ;
    }

    private SingleMode(){}

    /**
     * 静态内部类的单例模式，最安全，推荐使用
     * @return
     */
    public static SingleMode getIInstance(){
        return SingletonHolder.sInstance;
    }

    private static class SingletonHolder{
        private static final SingleMode sInstance = new SingleMode();
    }
}
