package main;

import ambiente.Construtor;
import gameplay.InputJogador;
import gameplay.Jogador;
import gameplay.Movimento;
import model.Sala;

public class Main {

	private static boolean play = true;
	
	public static void main(String[] args) {
		
		Construtor construtor = new Construtor();
		construtor.inicia(8, 8);
		
		System.out.println("Sua dangeon est� pronta! Voc� est� na estrada, para qual dire��o deseja se mover?");
		Jogador jogador = new Jogador(construtor.build());
		
		while (play) {
			
			System.out.println("==================");
			System.out.println("8 - Cima");
			System.out.println("6 - Direita");
			System.out.println("4 - Esquerda");
			System.out.println("2 - Baixo");
			
			int movimentoNum = InputJogador.lerInt();
			String movimento = "movimento" + movimentoNum;
			
			Movimento movimentoClass = getEnumDeMovimento(movimento);
			Sala conclusaoMovimento = jogador.mover(movimentoClass);
			
			if (conclusaoMovimento == null) {
				System.out.println("Voc� bateu em uma parede, tente ir em outra dire��o.");
			}
			
		}
		
		InputJogador.close();
		System.out.println("Fim de jogo!");
		
	}

	private static Movimento getEnumDeMovimento(String movimento) {
		
		Movimento result = Movimento.movimentoInvalido;
		try {
			result = Movimento.valueOf(movimento);
		} catch (IllegalArgumentException ex) {
			System.out.println("Movimento inv�lido, digite um n�mero que corresponda a um dos movimentos listados.");
		}
		
		return result;
			
	}

	public static void setPlay(boolean play) {
		Main.play = play;
	}
	
}
