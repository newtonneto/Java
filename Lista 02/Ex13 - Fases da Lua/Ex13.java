//Ex13 - Fases da Lua

import java.io.IOException;
import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) throws IOException {
		Scanner read = new Scanner(System.in);
		String dias;
		String[] divDias;
		
		dias = read.nextLine();
		divDias = dias.split(" ");

		fasesDaLua(Integer.valueOf(divDias[0]), Integer.valueOf(divDias[1]));
	}

	public static void fasesDaLua(int dia1, int dia2) {
		if (dia2 >= 0 && dia2 <=2) { //0 e 2%
			System.out.printf("nova%n");
		}
		else if (dia1 < dia2 && dia2 >= 3 && dia2 <= 96) { //3 e 96%
			System.out.printf("crescente%n");
		}
		else if (dia2 >= 97 && dia2 <= 100) { //97 e 100%
			System.out.printf("cheia%n");
		}
		else if (dia1 > dia2 && dia2 <= 96 && dia2 >= 3) { //96 e 3%
			System.out.printf("minguante%n");
		}
	}
}