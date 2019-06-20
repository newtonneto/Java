public class Triangulo {
	private Ponto a;
	private Ponto b;
	private Ponto c;
	private double hipo1;
	private double hipo2;
	private double hipo3;
	private double p;

	public double perimetro() {
		return 0;
	}

	public double perimetro(Ponto a, Ponto b, Ponto c) {
		this.a = a;
		this.b = b;
		this.c = c;

		p = hipo1 + hipo2 + hipo3;

		return p;
	}

	public double area(Ponto a, Ponto b, Ponto c) {
		this.a = a;
		this.b = b;
		this.c = c;

		hipo1 = a.distanciaOutroPonto(b);
		hipo2 = a.distanciaOutroPonto(c);
		hipo3 = b.distanciaOutroPonto(c);

		p = (hipo1 + hipo2 + hipo3) / 2;
		p = p * (p - hipo1) * (p - hipo2) * (p - hipo3);
		p = Math.sqrt(p);

		return p;
	}
}
