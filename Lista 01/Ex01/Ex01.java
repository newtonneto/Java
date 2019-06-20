import java.util.Scanner;

public class Ex01{
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		int varX = read.nextInt();
		System.out.print("Digite o segundo número: ");
		int varY = read.nextInt();
		if (varX == varY) {
			System.out.println(varX + " é igual a " + varY);
		}
		else {
			System.out.println(varX + " é diferente de " + varY);
		}
	}
}
