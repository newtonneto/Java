import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//int[] num;
		//num = new int[5];
		Integer maior = null;
		Integer menor = null;
		Integer armazenaNum = null;

		//Recebe valores
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite o " + (i + 1) + "° número: ");
			//num[i] = read.nextInt();
			armazenaNum = read.nextInt();
			if (maior == null || armazenaNum > maior) {
				maior = armazenaNum;
			}
			if (menor == null || armazenaNum < menor) {
				menor = armazenaNum;
			}
		}
		/*for(int i = 0; i < 5; i++) {
			//Descobre o maior número			
			if (maior == null || num[i] > maior) {
				maior = num[i];
			}
			//Descobre o menor número
			if (menor == null || num[i] < menor) {
				menor = num[i];
			}
		}*/
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
	}
}
