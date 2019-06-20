//Ex06 - Cachorros-Quentes

import java.io.IOException;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) throws IOException {

		Scanner read = new Scanner(System.in);
		String entrada;
		String[] textoSeparado;
		float media;

		entrada = read.nextLine();
		textoSeparado = entrada.split(" ");
		media = Float.valueOf(textoSeparado[0]) / Float.valueOf(textoSeparado[1]);

		System.out.printf("%.2f%n", media);
	}
}