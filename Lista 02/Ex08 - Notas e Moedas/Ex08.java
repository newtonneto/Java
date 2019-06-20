//Ex08 - Notas e Moedas;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		BigDecimal valor = new BigDecimal(0);
		BigDecimal[] armNotas = {new BigDecimal("100"), new BigDecimal("50"), new BigDecimal("20"), new BigDecimal("10"), new BigDecimal("5"), new BigDecimal("2")};
		BigDecimal[] armMoedas = {new BigDecimal("1"), new BigDecimal("0.5"), new BigDecimal("0.25"), new BigDecimal("0.1"), new BigDecimal("0.05"), new BigDecimal("0.01")};
		int[] notas = new int[6];
		int[] moedas = new int[6];
		int aux = 0;

		//valor = read.nextDouble();
		valor = read.nextBigDecimal();

		//Inicializar arrays;
		for (int i = 0; i < 6; i++) {
			notas[i] = 0;
			moedas[i] = 0;
		}

		//Subtrai a váriavel 'valor' pelo valor das notas
		while (aux < 6) {
			if (valor.floatValue() >= armNotas[aux].floatValue()) {
				valor = valor.subtract(armNotas[aux]);
				notas[aux] = notas[aux] + 1;
			}
			else {
				aux = aux + 1;
			}
		}
		aux = 0;

		while (aux < 6) {
			if (valor.floatValue() >= armMoedas[aux].floatValue()) {
				valor = valor.subtract(armMoedas[aux]);
				moedas[aux] = moedas[aux] + 1;
			}
			else {
				aux = aux + 1;
			}
		}
		//Exibe a quantidade de notas
		System.out.printf("NOTAS:%n");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d nota(s) de R$ %.2f%n", notas[i], armNotas[i]);
		}
		//Exibe a quantidade de moedas
		System.out.printf("MOEDAS:%n");
		for (int i = 0; i < 6; i++) {
			System.out.printf("%d moeda(s) de R$ %.2f%n", moedas[i], armMoedas[i]);
		}
	}
}