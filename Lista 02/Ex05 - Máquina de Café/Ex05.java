//Ex05 - Máquina de Café

import java.io.IOException;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		int andarMaquinaCafe = 0;
		int menorTempo = 0;
		int[] a = new int[3];
		int[] ta = new int[3];

		//recebe a quantidade de funcionario por andar
		for (int i = 0; i < 3; i++) {
			a[i] = read.nextInt();
		}

		//Calcula o tempo gasto em cada andar
		ta[0] = (a[1] * 2) + (a[2] * 4);
		ta[1] = (a[0] * 2) + (a[2] * 2);
		ta[2] = (a[0] * 4) + (a[1] * 2);

		//Procura o menor tempo
		for (int i = 0; i < 3; i++) {
			if (ta[i] < menorTempo || menorTempo == 0) {
				menorTempo = ta[i];
			}
		}
		System.out.println(menorTempo);
	}
}