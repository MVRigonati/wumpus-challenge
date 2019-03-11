package gameplay;

public enum DirecaoFlecha {
	
	direcao8(0, 1),
	direcao4(-1, 0),
	direcao6(1, 0),
	direcao2(0, -1),
	direcaoInvalida(0, 0);
	
	private int xMovimento;
	private int yMovimento;

	private DirecaoFlecha(int xMovimento, int yMovimento) {
		this.xMovimento = xMovimento;
		this.yMovimento = yMovimento;
	}
	
	public int getXMovimento() {
		return xMovimento;
	}
	
	public int getYMovimento() {
		return yMovimento;
	}

}
