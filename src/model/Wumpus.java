package model;

public class Wumpus implements Interagivel {

	@Override
	public boolean executaChegada() {
		
		System.out.println("Cuidado o Wumpus está nessa sala... Sinto muito!");
		return false;
		
	}

}
