package com.ma.desgin.model.proxy;

/**
 * Created by binbin.ma on 2017/3/30.
 */

public class Person implements Say {
    private String personMsg ;
    private String personName ;

    public Person(String personMsg, String personName) {
        this.personMsg = personMsg;
        this.personName = personName;
    }

    public String getPersonMsg() {
        return personMsg;
    }

    public void setPersonMsg(String personMsg) {
        this.personMsg = personMsg;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    @Override
    public void say(String what) {
        System.out.print(personName+"say 了" +personMsg);
    }


}
