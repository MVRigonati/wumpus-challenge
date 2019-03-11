package gameplay;

import main.Main;
import model.Interagivel;
import model.Sala;
import model.Tabuleiro;
import model.Wumpus;

public class Jogador {

	private Tabuleiro tabuleiro;
	private int posicaoX;
	private int posicaoY;
	private boolean possuiFlecha;
	
	public Jogador(Tabuleiro tabuleiro) {
		
		this.tabuleiro = tabuleiro;
		this.posicaoX = 0;
		this.posicaoY = 0;
		this.possuiFlecha = true;
		
		this.tabuleiro.podeMoverPara(0, 0);
		this.executaSalaAtualElementos(this.tabuleiro.getSalaAtual());
		
	}
	
	public Sala mover(DirecaoMovimento movimento) {
		
		this.posicaoX += movimento.getXMovimento();
		this.posicaoY += movimento.getYMovimento();
		
		Sala salaDestino = null;
		if (this.tabuleiro.podeMoverPara(this.posicaoY, this.posicaoX)) {
			
			salaDestino = this.tabuleiro.getSalaAtual();
			executaSalaAtualElementos(salaDestino);
			
		} else {
			this.posicaoX -= movimento.getXMovimento();
			this.posicaoY -= movimento.getYMovimento();
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
	
	public void atirarFlecha(DirecaoFlecha flechaDirecao) {
		
		if (flechaDirecao != DirecaoFlecha.direcaoInvalida) {
			
			int posicaoFlechaY = this.posicaoY + flechaDirecao.getYMovimento();
			int posicaoFlechaX = this.posicaoX + flechaDirecao.getXMovimento();
			
			boolean existeSala = true;
			while (existeSala) {
				
				existeSala = this.tabuleiro.podeMoverPara(posicaoFlechaY, posicaoFlechaX);
				Sala salaAtual = this.tabuleiro.getSalaAtual();
				if (salaAtual.contains(Wumpus.class)) {
					salaAtual.removeWumpus();
					System.out.println("Um grito assustador veio de algum lugar!");
					existeSala = false;
				}
				
				posicaoFlechaY += flechaDirecao.getYMovimento();
				posicaoFlechaX += flechaDirecao.getXMovimento();
				
			}
			
			this.tabuleiro.podeMoverPara(this.posicaoY, this.posicaoX);
			
			possuiFlecha = false;
			
		}
		
	}
	
	public int getPosicaoX() {
		return posicaoX;
	}
	
	public int getPosicaoY() {
		return posicaoY;
	}
	
	public boolean getPossuiFlecha() {
		return this.possuiFlecha;
	}
	
}
