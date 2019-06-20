import java.util.Scanner;

public class Main {
	public static void main (String[] args) {
		Scanner read = new Scanner(System.in);
		String s1;
		String s2;
		StringBuilder s3 = new StringBuilder();
		int i;
		int iS1 = 0;
		int iS2 = 0;

		System.out.printf("Digite a string s1: ");
		s1 = read.nextLine();
		System.out.printf("Digite a string s2: ");
		s2 = read.nextLine();

		for	(i = 0; i < (s1.length() + s2.length()); i++) {
			if (i % 2 == 0 && iS1 < s1.length()) {
				s3.append(s1.charAt(iS1));
				iS1++;
			}
			else if (i % 2 != 0 && iS2 < s2.length()) {
				s3.append(s2.charAt(iS2));
				iS2++;
			}
			else if (iS1 == s1.length()) {
				s3.append(s2.charAt(iS2));
				iS2++;
			}
			else if (iS2 == s2.length()) {
				s3.append(s1.charAt(iS1));
				iS1++;
			}
		}

		System.out.printf("Nova string s3: %s\n", s3);	
	}
}