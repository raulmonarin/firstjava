package tarefa2ex2;

import java.util.Scanner;

public class Tarefa2ex2 {

    public static void main(String[] args) {
        int i, j = 0, m, n, o;

        Scanner in = new Scanner(System.in);

        System.out.println("Informe valores para a tabuada. Aviso o valor final deve ser maior que o inicial!");
        System.out.println("Informe o valor inicial da tabuada:");
        m = in.nextInt();
        System.out.println("informe o valor final da tabuada:");
        n = in.nextInt();
        System.out.println("Informe a tabuada:");
        o = in.nextInt();

        if (m > n || m == n) {
            System.out.println("O valor final não é maior que o inicial");
        } else {
            for (i = m; i <= n; i++) {

                j = j + (o * i);

                System.out.println(o + " * " + i + " = " + (o * i));
            }
            System.out.println("A soma dos resultados é: " + j);
        }
    }

}
