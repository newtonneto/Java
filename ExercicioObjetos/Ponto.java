public class Ponto {
	private int x;
	private int y;
	private double distancia;

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY() {
		this.y = y;
	}

	public double distanciaOrigem() {
		//d²=(xa-ya)²+(xb-yb)²
		distancia = (x * x) + (y * y);
		distancia = Math.sqrt(distancia);
		return distancia;
	}

	public double distanciaOutroPonto(Ponto outroPonto) {
		Ponto p = outroPonto;
		double ac = (p.getX() - x);
		double bc = (p.getY() - y);

		ac = ac * ac;
		bc = bc * bc;
		distancia = Math.sqrt(ac + bc);
		
		return distancia;
	}
}
