package com.ma.desgin.model.DecorativeMode;

public class Decorator implements Component {
	private Component component;

	public Decorator() {
	}

	public Decorator(Component component) {
		this.component = component;
	}

	public void operation() {
		component.operation();
	}
}
