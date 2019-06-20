import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		int i;
		int indV = 0;
		char ch1;
		String s;

		System.out.printf("Digite uma string: ");
		s = read.nextLine();
		System.out.printf("Digite o caractere: ");
		ch1 = read.next().charAt(0);

		int[] v = new int[s.length()];

		for (i = 0; i < s.length(); i ++) {
			if (s.charAt(i) == ch1) {
				v[indV] = i;
				indV++;
			}
		}

		System.out.printf("Índices onde ocorrem o caractere %c: ", ch1);
		for (i = 0; i < indV; i++) {
			System.out.printf("%d ", v[i]);
		}
		System.out.printf("\n");
	}
}