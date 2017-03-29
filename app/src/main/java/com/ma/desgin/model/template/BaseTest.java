package com.ma.desgin.model.template;

public abstract class BaseTest {

	public void ask() {
		System.out.println("家里家庭地位最高的是？" + answer());
	}

	public abstract String answer();
}
