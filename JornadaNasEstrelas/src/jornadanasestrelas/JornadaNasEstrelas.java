package jornadanasestrelas;

import java.util.Scanner;

public class JornadaNasEstrelas {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int qntSitios;
        int i;
        int maiorIndice = 0;
        int restaCarneiros = 0;
        
        /*System.out.printf("Quantidade de sítios: ");*/
        qntSitios = Integer.parseInt(read.nextLine());
        
        int[] estrelas = new int[qntSitios];
        
        for (i = 0; i < qntSitios; i++) {
            estrelas[i] = Integer.parseInt(read.nextLine());
        }
        
        for (i = 0; i < qntSitios; ) {
            if ((i + 1) <= qntSitios) {
                if (estrelas[i] % 2 == 0) {
                    if (i > maiorIndice) {
                        maiorIndice = i;
                    }
                    if (i != 0) {
                        estrelas[i] = estrelas[i] - 1;
                        i = i - 1;
                    }
                    else {
                        i = qntSitios;
                    }
                }
                else {
                    estrelas[i] = estrelas[i] - 1;
                    if (i > maiorIndice) {
                        maiorIndice = i;
                    }
                    i = i + 1;
                }
            }
        }
        
        for (i = 0; i < qntSitios; i++) {
            restaCarneiros = restaCarneiros + estrelas[i];
        }
        
        System.out.printf("%d %d\n", (maiorIndice + 1), restaCarneiros);
    }
}
