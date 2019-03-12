package model;

import main.Main;

public class Buraco implements Interagivel {

	@Override
	public int executaChegada() {
		
		System.out.println("Você caiu em um buraco!");
		Main.setPlay(false);
		return -1000;
		
	}

}
