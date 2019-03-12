package main;

import static gameplay.Flecha.fluxoFlecha;
import static gameplay.Movimento.movimentaJogador;

import ambiente.Construtor;
import gameplay.InputJogador;
import gameplay.Jogador;

public class Main {

	private static boolean play = true;
	
	public static void main(String[] args) {
		
		System.out.println("Atenção bravo guerreiro! Você encontrou uma caverna, e a explorou em busca de tesouro. Encontro o ouro e você receberá fama e glória eterna!"
				+ "\nMas tome cuidado, uma criatura terrível vive nesta caverna e você só possui uma flecha para mata-la.");
		
		Construtor construtor = new Construtor();
		construtor.inicia(8, 8);
		
		System.out.println("Sua dangeon está pronta! Você está na estrada, para qual direção deseja se mover?");
		Jogador jogador = new Jogador(construtor.build());
		
		while (play) {
			
			System.out.println("==================");
			System.out.println("8 - Cima");
			System.out.println("6 - Direita");
			System.out.println("5 - Atirar Flecha");
			System.out.println("4 - Esquerda");
			System.out.println("2 - Baixo");
			
			int movimentoNum = InputJogador.lerInt();
			if (movimentoNum == 5) {
				fluxoFlecha(jogador);
			} else {
				movimentaJogador(jogador, movimentoNum);
			}
			
		}
		
		InputJogador.close();
		System.out.println("Fim de jogo! Sua pontuação foi: " + jogador.getPontos());
		
	}

	public static void setPlay(boolean play) {
		Main.play = play;
	}
	
}
