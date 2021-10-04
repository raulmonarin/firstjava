package tarefa1ex1;

import java.util.*;

public class Tarefa1ex1 {

    public static void main(String[] args) {
        int i, j, k;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite 2 valores: ");

        i = in.nextInt();
        j = in.nextInt();

        System.out.println("Digite:\n1.Adição\n2.Subtração\n3.Multiplicação\n4.Divisão\n");

        k = in.nextInt();

        switch (k) {
            case 1:
                System.out.println(i + "+" + j + "=" + (i + j));
                break;
            case 2:
                System.out.println(i + "-" + j + "=" + (i - j));
                break;
            case 3:
                System.out.println(i + "*" + j + "=" + (i * j));
                break;
            case 4:
                if (j == 0) {
                    System.out.println("Não existe divisão por 0");
                    break;
                }

                System.out.println(i + "/" + j + "=" + (i / j));
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}
