package model;

import main.Main;

public class Wumpus implements Interagivel {

	@Override
	public int executaChegada() {
		
		System.out.println("Wumpus si here... oh my god, I'm sorry!");
		Main.setPlay(false);
		return -1000;
		
	}

}
