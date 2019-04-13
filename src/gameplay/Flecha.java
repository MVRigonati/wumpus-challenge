package gameplay;

public class Flecha {

	public static void fluxoFlecha(Jogador jogador) {
		
		if (jogador.getPossuiFlecha()) {
			
			System.out.println("Choose the direction that you want to shoot the arrow:");
			System.out.println("8 - Up");
			System.out.println("4 - Left");
			System.out.println("6 - Right");
			System.out.println("2 - Down");
			
			int flechaDirecao = InputJogador.lerInt();
			DirecaoFlecha direcaoEnum = getEnumDeDirecao("direcao" + flechaDirecao);
			jogador.atirarFlecha(direcaoEnum);
			
		} else {
			System.out.println("You don't have any arrows left.");
		}

	}
	
	private static DirecaoFlecha getEnumDeDirecao(String direcao) {
		
		DirecaoFlecha result = DirecaoFlecha.direcaoInvalida;
		try {
			result = DirecaoFlecha.valueOf(direcao);
		} catch (IllegalArgumentException ex) {
			System.out.println("Invalid movement, insert a number that corresponds to one of the listed movements.");
		}
		
		return result;
			
	}
	
}
