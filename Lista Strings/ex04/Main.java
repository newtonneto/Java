import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		StringBuilder s = new StringBuilder();
		char ch1;
		char ch2;
		int i;
		String d;

		System.out.printf("Digite uma frase: ");
		s.append(read.nextLine());
		System.out.printf("Escolha o caractere 1: ");
		ch1 = read.next().charAt(0);
		System.out.printf("Escolha o caractere 2: ");
		ch2 = read.next().charAt(0);

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch1) {
				s.setCharAt(i, ch2);
			}
		}

		System.out.printf("Frase modificada: %s\n", s);
	}
}