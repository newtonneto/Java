import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		String palavra;
		StringBuilder palavraInversa = new StringBuilder();
		Scanner read = new Scanner(System.in);
		int i;

		System.out.printf("Digite uma palavra: ");
		palavra = read.next();

		for (i = (palavra.length() - 1); i >= 0; i--) {
			palavraInversa.append(palavra.charAt(i));
		}

		if (palavraInversa.toString().equals(palavra)) {
			System.out.printf("%s é um palíndromo\n", palavraInversa);
		}
		else {
			System.out.printf("%s não é um palíndromo\n", palavraInversa);
		}
	}
}