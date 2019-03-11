package model;

import java.util.ArrayList;
import java.util.List;

public class Sala {

	private List<Interagivel> elementos;
	
	public Sala() {
		this.elementos = new ArrayList<>();
	}
	
	public void addElemento(Interagivel interagivel) {
		if (!contains(interagivel.getClass())) {
			this.elementos.add(interagivel);
		}
	}
	
	public boolean contains(Class<?> clazz) {
		return this.elementos.stream().anyMatch(element -> clazz.isInstance(element));
	}
	
	public List<Interagivel> getElementos() {
		return elementos;
	}

	public void removeWumpus() {
		
		this.elementos.removeIf( element -> Wumpus.class.isInstance(element) );
		
	}
	
}
