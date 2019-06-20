import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Ponto p1 = new Ponto(1, 3);
		Ponto p2 = new Ponto(3, 5);
		Ponto p3 = new Ponto(7, 1);
		Triangulo t1 = new Triangulo();
		Circulo c1 = new Circulo();
		double distance;
		double areaT;

		distance = p1.distanciaOrigem();

		System.out.printf("Distancia origem: %f %n", distance);

		distance = p1.distanciaOutroPonto(p2);

		System.out.printf("Distancia outro ponto: %f %n", distance);

		areaT = t1.area(p1, p2, p3);

		System.out.printf("Área do triângulo: %f %n", areaT);

		c1.mudarRaio(4);

		double teste = c1.diametro();

		System.out.printf("Diametro do circulo: %f %n", teste);
		System.out.printf("Area do circulo: %f %n", c1.area());
	}
}

