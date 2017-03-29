package com.ma.desgin.model.abstractFactory;

//定义不同的个体之间的一定具备的标准，用interface实现
//其中的say()方法可看作提取出不同产品的共性，如人都有说话的功能
interface PersonA {
	public void say();
}

interface PersonB {
	public void say();
}

class PersonA1 implements PersonA {
	public void say() {
		System.out.println("Hello A 001 !");
	}
}

class PersonA2 implements PersonA {
	public void say() {
		System.out.println("Hello A 002 !");
	}
}

class PersonB1 implements PersonB {
	public void say() {
		System.out.println("Hello B 001");
	}
}

class PersonB2 implements PersonB {
	public void say() {
		System.out.println("Hello B 002");
	}
}

abstract class Factory1 {
	abstract PersonA getPersonA1();

	abstract PersonB getPersonB1();
}

abstract class Factory2 {
	abstract PersonA getPersonA2();

	abstract PersonB getPersonB2();
}

class ConcreteFactory1 extends Factory1 {
	public PersonA getPersonA1() {
		return new PersonA1();
	}

	public PersonB getPersonB1() {
		return new PersonB1();
	}
}

class ConcreteFactoryB extends Factory2 {
	public PersonA getPersonA2() {
		return new PersonA2();
	}

	public PersonB getPersonB2() {
		return new PersonB2();
	}
}

public class AbstractFactoryModel {
	public static void test() {
		Factory1 factory1 = new ConcreteFactory1();
		PersonA pA1 = factory1.getPersonA1();
		PersonB pB1 = factory1.getPersonB1();

		pA1.say();
		pB1.say();

		Factory2 factory2 = new ConcreteFactoryB();
		PersonA pA2 = factory2.getPersonA2();
		PersonB pB2 = factory2.getPersonB2();

		pA2.say();
		pB2.say();
	}
}