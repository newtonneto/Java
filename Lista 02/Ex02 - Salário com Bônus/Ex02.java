//Ex02 - Salário com Bônus

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		String nomeVendedor;
		BigDecimal salarioFixo;
		BigDecimal totalVendas;

		nomeVendedor = read.nextLine();
		salarioFixo = read.nextBigDecimal();
		totalVendas = read.nextBigDecimal();

		totalVendas = totalVendas.divide(BigDecimal.valueOf(100));
		totalVendas = totalVendas.multiply(BigDecimal.valueOf(15));
		System.out.printf("TOTAL = R$ %.2f%n", salarioFixo.add(totalVendas));
	}
}