package gameplay;

import main.Main;
import model.Interagivel;
import model.Sala;
import model.Tabuleiro;

public class Jogador {

	private Tabuleiro tabuleiro;
	private int posicaoX;
	private int posicaoY;
	
	public Jogador(Tabuleiro tabuleiro) {
		
		this.tabuleiro = tabuleiro;
		this.posicaoX = 0;
		this.posicaoY = 0;
		
		this.tabuleiro.podeMoverPara(0, 0);
		this.executaSalaAtualElementos(this.tabuleiro.getSalaAtual());
		
	}
	
	public Sala mover(Movimento movimento) {
		
		this.posicaoX += movimento.getxMovimento();
		this.posicaoY += movimento.getyMovimento();
		
		Sala salaDestino = null;
		if (this.tabuleiro.podeMoverPara(this.posicaoY, this.posicaoX)) {
			salaDestino = this.tabuleiro.getSalaAtual();
			
			executaSalaAtualElementos(salaDestino);
			
		} else {
			this.posicaoX -= movimento.getxMovimento();
			this.posicaoY -= movimento.getyMovimento();
		}
		
		return salaDestino;
		
	}

	private void executaSalaAtualElementos(Sala salaAtual) {
		for (Interagivel elemento : salaAtual.getElementos()) {
			
			if (!elemento.executaChegada()) {
				Main.setPlay(false);
			}
			
		}
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}
	
	public int getPosicaoY() {
		return posicaoY;
	}
	
}
