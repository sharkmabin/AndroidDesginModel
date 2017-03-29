package com.ma.desgin.model.build;

public class Director {
	LateHome mlateHome;

	public Director(LateHome mlateHome) {
		this.mlateHome = mlateHome;
	}

	public void lateHome() {
		mlateHome.openDoor();
		mlateHome.haveDinner();
		mlateHome.sleep();
	}
}
