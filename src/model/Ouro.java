package model;

import gameplay.InputJogador;
import main.Main;

public class Ouro implements Interagivel {

	@Override
	public int executaChegada() {
		
		System.out.println("Está sala está BRILHANDO!");
		System.out.println("Deseja pegar o ouro?");
		
		String pegarOuro = InputJogador.ler();
		
		int result = 0;
		pegarOuro = pegarOuro.toUpperCase();
		if (pegarOuro.startsWith("S")) {
			System.out.println("Você pegou o ouro em segurança, parabéns!");
			result = 1000;
			Main.setPlay(false);
		} else {
			System.out.println("Marque bem este lugar e tome cuidado!");
		}
		
		return result;
		
	}

}
