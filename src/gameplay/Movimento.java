package gameplay;

public enum Movimento {

	movimento8(0, 1),
	movimento4(-1, 0),
	movimento6(1, 0),
	movimento2(0, -1),
	movimentoInvalido(0, 0);
	
	private int xMovimento;
	private int yMovimento;
	
	Movimento (int x, int y) {
		this.xMovimento = x;
		this.yMovimento = y;
	}

	public int getxMovimento() {
		return xMovimento;
	}
	
	public int getyMovimento() {
		return yMovimento;
	}
	
}
