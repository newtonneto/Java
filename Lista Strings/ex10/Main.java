import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		String s1;
		StringBuilder s2 = new StringBuilder();

		System.out.printf("Digite a string s1: ");
		s1 = read.nextLine();
		System.out.printf("Digite a string s2: ");
		s2.append(read.nextLine());

		s2.insert(0, s1);
		s2.insert(s1.length(), " ");

		System.out.printf("Nova string s2: %s\n", s2);
	}
}