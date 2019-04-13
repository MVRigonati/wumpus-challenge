package gameplay;

import model.Sala;

public class Movimento {
	
	public static void movimentaJogador(Jogador jogador, int movimentoNum) {
		
		DirecaoMovimento movimentoClass = getEnumDeMovimento("movimento" + movimentoNum);
		Sala conclusaoMovimento = jogador.mover(movimentoClass);
		
		if (conclusaoMovimento == null) {
			System.out.println("You hit a wall, try going in another direction.");
		}

	}
	
	private static DirecaoMovimento getEnumDeMovimento(String movimento) {
		
		DirecaoMovimento result = DirecaoMovimento.movimentoInvalido;
		try {
			result = DirecaoMovimento.valueOf(movimento);
		} catch (IllegalArgumentException ex) {
			System.out.println("Invalid movement, insert a number that corresponds to one of the listed movements.");
		}
		
		return result;
			
	}

}
