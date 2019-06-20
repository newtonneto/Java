import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		String s1;
		String s2;
		int quantidadeOcorrencias = 0;
		int i;
		int y;
		int confirmaIgualdade = 0;
		int iVariavel;

		System.out.printf("Digite a string: ");
		s1 = read.nextLine();
		System.out.printf("Digite a substring: ");
		s2 = read.nextLine();

		//Percorre os caracteres de s1
		for (i = 0; i < s1.length(); i++) {
			//Zera a variavel que controla a quantidade de caracteres iguais
			confirmaIgualdade = 0;
			//Verifica se o caractere atual de s1 é igual a primeira letra de s2
			if (s1.charAt(i) == s2.charAt(0)) {
				//Se for incrementa em +1 a var que controla a quantidade de caracteres iguais
				confirmaIgualdade++;
				//Salva o indice atual de i
				iVariavel = i;
				//Executa um novo laço, para comparar os caracteres restantes de s2 com os proximos
				//caracteres de s1, o laço começa a partir do 2° caractere de s2, e vai até o tamanho
				//maximo de s2
				for (y = 1; y < s2.length(); y++) {
					//Verifica se o valor de i e iVariavel atual é menor que o tamanho de s1 - 1, essa verificação
					//é necessária para o programa não tentar verificar indices que não existem em s1
					if (i < (s1.length() - 1) && iVariavel < (s1.length() - 1)) {
						//Incrementa em +1 o indice variavel
						iVariavel++;
						//Condicional que verifica se os proximos indices de s1 vão ser iguais as letras
						//restantes de s2
						if (s1.charAt(iVariavel) == (s2.charAt(y))) {
							//Caso passe na verificação a variavel confirmaIgualdade será incrementada em +1
							confirmaIgualdade++;
						}
					}
				}
				//Ao final do for será verificada se todos os caracteres comparados são iguais, comparado a
				//variavel incrementada com o tamanho de s2
				if (confirmaIgualdade == s2.length()) {
					//Se passar a quantidadeOcorrencias será incrementada em +1
					quantidadeOcorrencias++;
					//Modifica o indice i para pular para a proxima verificação de substring
					i = i + (s2.length() - 1);
				}
			}
		}

		System.out.printf("Número de ocorrências: %d \n", quantidadeOcorrencias);
	}
}