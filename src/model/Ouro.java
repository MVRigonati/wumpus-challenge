package model;

import gameplay.InputJogador;

public class Ouro implements Interagivel {

	@Override
	public boolean executaChegada() {
		
		System.out.println("Est� sala est� BRILHANDO!");
		System.out.println("Deseja pegar o ouro?");
		
		String pegarOuro = InputJogador.ler();
		
		boolean result = true;
		pegarOuro = pegarOuro.toUpperCase();
		if (pegarOuro.startsWith("S")) {
			System.out.println("Voc� pegou o ouro em seguran�a, parab�ns!");
			result = false;
		} else {
			System.out.println("Marque bem este lugar e tome cuidado!");
		}
		
		return result;
		
	}

}
