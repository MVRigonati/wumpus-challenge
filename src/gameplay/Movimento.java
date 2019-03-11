package gameplay;

import model.Sala;

public class Movimento {
	
	public static void movimentaJogador(Jogador jogador, int movimentoNum) {
		
		DirecaoMovimento movimentoClass = getEnumDeMovimento("movimento" + movimentoNum);
		Sala conclusaoMovimento = jogador.mover(movimentoClass);
		
		if (conclusaoMovimento == null) {
			System.out.println("Você bateu em uma parede, tente ir em outra direção.");
		}

	}
	
	private static DirecaoMovimento getEnumDeMovimento(String movimento) {
		
		DirecaoMovimento result = DirecaoMovimento.movimentoInvalido;
		try {
			result = DirecaoMovimento.valueOf(movimento);
		} catch (IllegalArgumentException ex) {
			System.out.println("Movimento inválido, digite um número que corresponda a um dos movimentos listados.");
		}
		
		return result;
			
	}

}
