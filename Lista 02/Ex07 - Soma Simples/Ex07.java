//Ex07 - Soma Simples

import java.io.IOException;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) throws IOException{
		Scanner read = new Scanner(System.in);
		int a;
		int b;
		int SOMA;

		a = read.nextInt();
		b = read.nextInt();

		SOMA = a + b;

		System.out.printf("SOMA = %d%n", SOMA);
	}
}
