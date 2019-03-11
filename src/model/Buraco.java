package model;

public class Buraco implements Interagivel {

	@Override
	public boolean executaChegada() {
		
		System.out.println("Você caiu em um buraco!");
		return false;
		
	}

}
