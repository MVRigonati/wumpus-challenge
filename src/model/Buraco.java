package model;

import main.Main;

public class Buraco implements Interagivel {

	@Override
	public int executaChegada() {
		
		System.out.println("You fell in a HOLE!");
		Main.setPlay(false);
		return -1000;
		
	}

}
