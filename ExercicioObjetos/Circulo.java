public class Circulo {
	private double raio;
	private Ponto centro;

	public double area() {
		double area;
		area = 3.141592 * this.raio;

		return area;
	}

	public double diametro() {
		double diametro;
		diametro = 2 * raio;

		return diametro;
	}

	public void mudarCentro(Ponto centro) {
		this.centro = centro;
	}

	public void mudarRaio(double raio) {
		this.raio = raio;
	}
}