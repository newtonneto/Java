import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String frase;
		String fraseMod;
		StringBuilder fraseInvertida = new StringBuilder();
		int i;

		System.out.printf("Digite uma frase: ");
		frase = read.nextLine();

		fraseMod = frase.replace("-", "").replace(" ", "");

		for (i = (fraseMod.length() - 1); i >= 0; i--) {
			fraseInvertida.append(fraseMod.charAt(i));
		}

		if(fraseInvertida.toString().toLowerCase().equals(fraseMod.toLowerCase())) {
			System.out.printf("%s é palíndromo\n", frase);
		}
		else {
			System.out.printf("%s não é palíndromo\n", frase);
		}
	}
}