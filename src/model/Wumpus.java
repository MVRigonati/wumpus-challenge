package model;

import main.Main;

public class Wumpus implements Interagivel {

	@Override
	public int executaChegada() {
		
		System.out.println("Cuidado o Wumpus está nessa sala... Sinto muito!");
		Main.setPlay(false);
		return -1000;
		
	}

}
