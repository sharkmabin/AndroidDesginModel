package com.ma.desgin.model.template;

public class TemplateModel {
	public static void test() { // 多态
		BaseTest sina = new Mam();
		BaseTest tencent = new Dad();
		sina.ask();
		tencent.ask();
	}
}
