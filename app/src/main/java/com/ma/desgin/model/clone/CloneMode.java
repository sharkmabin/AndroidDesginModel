package com.ma.desgin.model.clone;

/**
 * Created by binbin.ma on 2017/3/30.
 */

public class CloneMode {
    public static void test() {
        AliceComputer a1 = new RealAlice();
        AliceComputer a2 = (AliceComputer) a1.clone();
        AliceComputer a3 = (AliceComputer) a1.clone();
        // AliceComputer a3 = (AliceComputer) a2.clone();
        // 这里通过 a2 克隆自己也行，说明 a2 已经是一个真实在内
        // 存中的对象了
        a1.dothing();
        a2.dothing();
        a3.dothing();
    }
}
