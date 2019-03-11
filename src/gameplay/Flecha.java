package gameplay;

public class Flecha {

	public static void fluxoFlecha(Jogador jogador) {
		
		if (jogador.getPossuiFlecha()) {
			
			System.out.println("Escolha a dire��o que deseja atirar a flecha:");
			System.out.println("8 - Para cima");
			System.out.println("4 - Para a esquerda");
			System.out.println("6 - Para a direita");
			System.out.println("2 - Para baixo");
			
			int flechaDirecao = InputJogador.lerInt();
			DirecaoFlecha direcaoEnum = getEnumDeDirecao("direcao" + flechaDirecao);
			jogador.atirarFlecha(direcaoEnum);
			
		} else {
			System.out.println("Voc� n�o possui mais flechas.");
		}

	}
	
	private static DirecaoFlecha getEnumDeDirecao(String direcao) {
		
		DirecaoFlecha result = DirecaoFlecha.direcaoInvalida;
		try {
			result = DirecaoFlecha.valueOf(direcao);
		} catch (IllegalArgumentException ex) {
			System.out.println("Dire��o inv�lida, digite um n�mero que corresponda a uma das dire��es listadas.");
		}
		
		return result;
			
	}
	
}
