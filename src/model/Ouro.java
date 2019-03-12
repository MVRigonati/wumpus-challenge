package model;

import gameplay.InputJogador;
import main.Main;

public class Ouro implements Interagivel {

	@Override
	public int executaChegada() {
		
		System.out.println("Est� sala est� BRILHANDO!");
		System.out.println("Deseja pegar o ouro?");
		
		String pegarOuro = InputJogador.ler();
		
		int result = 0;
		pegarOuro = pegarOuro.toUpperCase();
		if (pegarOuro.startsWith("S")) {
			System.out.println("Voc� pegou o ouro em seguran�a, parab�ns!");
			result = 1000;
			Main.setPlay(false);
		} else {
			System.out.println("Marque bem este lugar e tome cuidado!");
		}
		
		return result;
		
	}

}
