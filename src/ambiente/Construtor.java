package ambiente;

import java.util.Random;

import model.Ouro;
import model.Sala;
import model.Tabuleiro;
import model.Wumpus;

public class Construtor {

	private Tabuleiro tabuleiro;
	private int[] preencher;
	
	public void inicia(int alturaSala, int larguraSala) {
		
		this.tabuleiro = new Tabuleiro(new Sala[alturaSala][larguraSala]);
		this.preencher = new int[] { 0, 1 };
		colocaWumpus();
		colocaOuro();
		
		while (this.preencher[0] < alturaSala) {
			
			while (this.preencher[1] < larguraSala) {
				
				if (!isSalaWumpus(this.preencher[1], this.preencher[0]) && !isSalaOuro(this.preencher[1], this.preencher[0])) {
					
					double temBurado = new Random().nextDouble();
					if (temBurado <= 0.2) {
						this.tabuleiro.addBuraco(this.preencher[1], this.preencher[0]);
					}
					
				}
				this.preencher[1]++;
			}
			
			this.preencher[0]++;
			this.preencher[1] = 0;
		}

	}

	private void colocaWumpus() {
		
		Random rand = new Random();
		int yWumpus = rand.nextInt(this.tabuleiro.getAltura());
		int xWumpus = rand.nextInt(this.tabuleiro.getLargura());
		
		while (isSalaOuro(yWumpus, xWumpus) || (yWumpus == 0 && xWumpus == 0)) {
			yWumpus = rand.nextInt(this.tabuleiro.getAltura());
			xWumpus = rand.nextInt(this.tabuleiro.getLargura());
		}
		
		this.tabuleiro.addWumpus(yWumpus, xWumpus);
		
	}

	private void colocaOuro() {
		
		Random rand = new Random();
		int yOuro = rand.nextInt(this.tabuleiro.getAltura());
		int xOuro = rand.nextInt(this.tabuleiro.getLargura());
		
		while (isSalaWumpus(yOuro, xOuro) || (yOuro == 0 && xOuro == 0)) {
			yOuro = rand.nextInt(this.tabuleiro.getAltura());
			xOuro = rand.nextInt(this.tabuleiro.getLargura());
		}
		
		this.tabuleiro.addNaSala(new int[] {yOuro, xOuro}, new Ouro());
		
	}

	private boolean isSalaWumpus(int yWumpus, int xWumpus) {
		return this.tabuleiro.getSalaEm(yWumpus, xWumpus).contains(Wumpus.class);
	}
	
	private boolean isSalaOuro(int yOuro, int xOuro) {
		return this.tabuleiro.getSalaEm(yOuro, xOuro).contains(Ouro.class);
	}
	
	public Tabuleiro build() {
		return this.tabuleiro;
	}

}
