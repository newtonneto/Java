import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		String s;
		String sub1;
		String sub2;

		System.out.printf("Digite a string: ");
		s = read.nextLine();
		System.out.printf("Digite a substring sub1: ");
		sub1 = read.nextLine();
		System.out.printf("Digite a substring sub2: ");
		sub2 = read.nextLine();

		s = s.replace(sub1, sub2);

		System.out.printf("Número de ocorrências: %s \n", s);
	}
}