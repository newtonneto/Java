import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		char caractere;
		char charTeste;
		String frase;
		int i;
		int quantidadeCaractere = 0;

		System.out.printf("Digite uma frase: ");
		frase = read.nextLine();
		System.out.printf("Digite o caractere a ser buscado: ");
		caractere = read.next().charAt(0);

		for (i = 0; i < frase.length(); i++) {
			charTeste = frase.charAt(i);
			if (charTeste == caractere) {
				quantidadeCaractere++;
			}
		}

		System.out.printf("Quantidade de ocorrencias do caractere %s: %d\n", caractere, quantidadeCaractere);
	}
}