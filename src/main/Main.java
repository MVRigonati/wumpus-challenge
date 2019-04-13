package main;

import static gameplay.Flecha.fluxoFlecha;
import static gameplay.Movimento.movimentaJogador;

import ambiente.Construtor;
import gameplay.InputJogador;
import gameplay.Jogador;

public class Main {

	private static boolean play = true;
	
	public static void main(String[] args) {
		
		System.out.println("Attention brave warrior! You found a dungeon and went in it. Find the gold and you will receive eternal fame and glory!"
				+ "\nHere are the rules:\n"
				+ "If you find a WINDY room, you are close to a HOLE!\n"
				+ "if you find a SMELLY room, you are close the the monster WUMPUS!\n"
				+ "You have just one arrow, so use it wisely.\n"
				+ "Good luck, brave warrior!");
		
		Construtor construtor = new Construtor();
		construtor.inicia(8, 8);
		
		System.out.println("You are in the dungeon entrance, choose the direction you want to move.");
		Jogador jogador = new Jogador(construtor.build());
		
		while (play) {
			
			System.out.println("==================");
			System.out.println("8 - Up");
			System.out.println("6 - Right");
			System.out.println("5 - Fire Arrow");
			System.out.println("4 - Left");
			System.out.println("2 - Down");
			
			int movimentoNum = InputJogador.lerInt();
			if (movimentoNum == 5) {
				fluxoFlecha(jogador);
			} else {
				movimentaJogador(jogador, movimentoNum);
			}
			
		}
		
		InputJogador.close();
		System.out.println("End game! Your score was: " + jogador.getPontos());
		
	}

	public static void setPlay(boolean play) {
		Main.play = play;
	}
	
}
