package gameplay;

import java.util.Scanner;

public class InputJogador {

	private static Scanner scan;
	
	public static String ler() {
		
		if (InputJogador.scan == null) {
			InputJogador.scan = new Scanner(System.in);
		}
		
		return InputJogador.scan.nextLine();
		
	}
	
	public static int lerInt() {
		
		if (InputJogador.scan == null) {
			InputJogador.scan = new Scanner(System.in);
		}
		
		int result = InputJogador.scan.nextInt();
		InputJogador.scan.nextLine();
		
		return result;
		
	}

	public static void close() {
		InputJogador.scan.close();
	}
	
}
