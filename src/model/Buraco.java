package model;

public class Buraco implements Interagivel {

	@Override
	public boolean executaChegada() {
		
		System.out.println("Voc� caiu em um buraco!");
		return false;
		
	}

}
