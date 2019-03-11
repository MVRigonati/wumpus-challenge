package gameplay;

public class Flecha {

	public static void fluxoFlecha(Jogador jogador) {
		
		if (jogador.getPossuiFlecha()) {
			
			System.out.println("Escolha a direção que deseja atirar a flecha:");
			System.out.println("8 - Para cima");
			System.out.println("4 - Para a esquerda");
			System.out.println("6 - Para a direita");
			System.out.println("2 - Para baixo");
			
			int flechaDirecao = InputJogador.lerInt();
			DirecaoFlecha direcaoEnum = getEnumDeDirecao("direcao" + flechaDirecao);
			jogador.atirarFlecha(direcaoEnum);
			
		} else {
			System.out.println("Você não possui mais flechas.");
		}

	}
	
	private static DirecaoFlecha getEnumDeDirecao(String direcao) {
		
		DirecaoFlecha result = DirecaoFlecha.direcaoInvalida;
		try {
			result = DirecaoFlecha.valueOf(direcao);
		} catch (IllegalArgumentException ex) {
			System.out.println("Direção inválida, digite um número que corresponda a uma das direções listadas.");
		}
		
		return result;
			
	}
	
}
