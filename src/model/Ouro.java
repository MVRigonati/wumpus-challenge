package model;

import gameplay.InputJogador;
import main.Main;

public class Ouro implements Interagivel {

	@Override
	public int executaChegada() {
		
		System.out.println("This room is SHINING!");
		System.out.println("Do you want to take the gold? (Y/N)");
		
		String pegarOuro = InputJogador.ler();
		
		int result = 0;
		pegarOuro = pegarOuro.toUpperCase();
		if (pegarOuro.startsWith("Y")) {
			System.out.println("You took the gold safely, congratulations you won the game!");
			result = 1000;
			Main.setPlay(false);
		} else {
			System.out.println("Take care of your self, and come back here later!");
		}
		
		return result;
		
	}

}
