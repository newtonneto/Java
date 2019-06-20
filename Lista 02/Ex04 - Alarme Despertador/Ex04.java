/*Alarme Despertador*/

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		//String hora = "1.2.3.4"; 
		int control = 0;
		int h1 = 24;
		int h2 = 24;
		//int m1 = 60;
		//int m2 = 60;
		
		while (control != 4) {
			String hora = read.nextLine();
			String[] guardaHora = hora.split("[ ]");
			h1 = (Integer.valueOf(guardaHora[0]) * 60) + Integer.valueOf(guardaHora[1]);
			//m1 = Integer.valueOf(guardaHora[1]);
			h2 = (Integer.valueOf(guardaHora[2]) * 60) + Integer.valueOf(guardaHora[3]);
			//m2 = Integer.valueOf(guardaHora[3]);

			//h1 = (h1 * 60) + m1;
			//h2 = (h2 * 60) + m2;
			if (h1 < h2) {
				h1 = h2 - h1;
				System.out.println(h1);
			}
			else if (h1 > h2){
				h1 = 1440 - h1;
				h1 = h1 + h2;
				System.out.println(h1);
			}
			else if (h1 == h2 && h1 != 0) {
				h1 = h1 - h2;
				System.out.println(h1);
			}
			else {
				control = 4;
			}

			/*for (int i = 0; i < 4; i++) {
				h1 = Integer.valueOf(guardaHora[i]);
				if (h1 == 0) {
					control = control + 1;
				}
			}
			System.out.println(" ");

			if (control != 4) {
				control = 0;
			}*/
		}
		//System.out.println("Fim");
	}
}
