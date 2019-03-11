package model;

public class Tabuleiro {

	private Sala[][] salas;
	private Sala salaAtual;
	
	public Tabuleiro(Sala[][] salas) {
		
		this.salas = salas;
		for (int i = 0; i < this.salas.length; i++) {
			for (int j = 0; j < this.salas[i].length; j++) {
				this.salas[i][j] = new Sala();
			}
		}
		
	}

	public boolean addNaSala(int[] posicao, Interagivel interagivel) {
		boolean result = true;
		try {
			this.salas[posicao[0]][posicao[1]].addElemento(interagivel);
			
		} catch (IndexOutOfBoundsException ex) {
			//System.out.println("[WARN] Tentou adicionar fora do tabuleiro");
			result = false;
			
		}
		
		return result;
	}
	
	public int getAltura() {
		return this.salas.length;
	}
	
	public int getLargura() {
		return this.salas[0].length;
	}
	
	public Sala getSalaEm(int y, int x) {
		return this.salas[y][x];
	}

	public void addBuraco(int y, int x) {
		
		this.addNaSala(new int[] {y, x}, new Buraco());
		this.addNaSala(new int[] {y + 1, x}, new Brisa());
		this.addNaSala(new int[] {y - 1, x}, new Brisa());
		this.addNaSala(new int[] {y, x + 1}, new Brisa());
		this.addNaSala(new int[] {y, x - 1}, new Brisa());
		
	}
	
	public void addWumpus(int y, int x) {
		
		this.addNaSala(new int[] {y, x}, new Wumpus());
		this.addNaSala(new int[] {y + 1, x}, new Fedor());
		this.addNaSala(new int[] {y - 1, x}, new Fedor());
		this.addNaSala(new int[] {y, x + 1}, new Fedor());
		this.addNaSala(new int[] {y, x - 1}, new Fedor());
		
	}

	public boolean podeMoverPara(int posicaoY, int posicaoX) {
		
		boolean result = true;
		try {
			this.salaAtual = this.salas[posicaoY][posicaoX];
		} catch (IndexOutOfBoundsException ex) {
			result = false;
		}
		
		return result;
		
	}

	public Sala getSalaAtual() {
		return this.salaAtual;
	}
	
}
