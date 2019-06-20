import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		String s1;
		String s2;
		StringBuilder s3 = new StringBuilder();

		System.out.printf("Digite a string s1: ");
		s1 = read.nextLine();
		System.out.printf("Digite a string s2: ");
		s2 = read.nextLine();

		s3.append(s1);
		s3.append(" ");
		s3.append(s2);

		System.out.printf("Nova string s3: %s\n", s3);
	}
}