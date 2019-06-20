//Ex12 - Número Primo

import java.io.IOException;
import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		int control = read.nextInt();
		int indArray = control;
		int[] num = new int[indArray];
		int aux = 0;

		while (control > 0) {
			num[aux] = read.nextInt();
			control = control - 1;
			aux = aux + 1;
		}

		verificaPrimo(num, indArray);
	}

	public static void verificaPrimo(int[] num, int indArray) {
		int teste = 0;
		int numConv;
		for (int i = 0; i < indArray; i++) {
			if (num[i] == 0) {
				System.out.printf("%s nao eh primo%n", num[i]);
			}
			else if (num[i] < 0) {
				numConv = num[i] * -1;
				for (int z = 1; z <= numConv; z++) {
					if (Integer.valueOf(num[i]) <= 1) {
						System.out.printf("%s nao eh primo%n", num[i]);
					}
					else if (num[i] % z == 0) {
						teste = teste + 1;
						if (teste > 2) {
							System.out.printf("%s nao eh primo%n", num[i]);
							break;
						}
					}	
				}
				if (teste == 2) {
					System.out.printf("%s eh primo%n", num[i]);
				}
				teste = 0;
			}
			else {
				for (int z = 1; z <= num[i]; z++) {
					if (Integer.valueOf(num[i]) <= 1) {
						System.out.printf("%s nao eh primo%n", num[i]);
					}
					else if (num[i] % z == 0) {
						teste = teste + 1;
						if (teste > 2) {
							System.out.printf("%s nao eh primo%n", num[i]);
							break;
						}
					}	
				}
				if (teste == 2) {
					System.out.printf("%s eh primo%n", num[i]);
				}
				teste = 0;
			}
		}
	}
}