package tarefa2ex1;

import java.util.Scanner;

public class Tarefa2ex1 {

    public static void main(String[] args) {
        int i, j = 0, m, n;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite valores para M e N:");
        System.out.println("O valor de M deve ser menor que N!!");

        m = in.nextInt();
        n = in.nextInt();

        if (m > n || m == n) {
            System.out.println("Eu avisei parça!");
        } else {
            for (i = m; i <= n; i++) {

                if (i % 2 != 0) {
                    System.out.println(i);
                    j = j + i;
                }  
            }
            System.out.println("A soma dos números ímpares entre " + m + " e " + n + " é de: " + j);
        }

    }

}
