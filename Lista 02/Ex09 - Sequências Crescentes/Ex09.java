//Ex09 - Sequências Crescentes

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) throws Exception {
		Scanner read = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList();
		int aux;
		int count = 1;

		do {
			aux = read.nextInt();
			num.add(aux);
		} while (aux > 0);

		for (int i = 0; i < (num.size() - 1); i++) {
			for (int z = 1; z <= num.get(i); z++) {
				if (z < num.get(i)) {
					System.out.printf("%d ", z);
				}
				else {
					System.out.printf("%d", z);
				}	
			}
			System.out.printf("%n");
		}
	}
}