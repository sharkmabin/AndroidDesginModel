package com.ma.desgin.model.clone;

/**
 * Created by binbin.ma on 2017/3/30.
 */

public abstract class AliceComputer implements Cloneable {
    //生化危机中人工智能呢个克隆出了很多Alice克隆体
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return o;
    }

    public abstract void dothing();
}
