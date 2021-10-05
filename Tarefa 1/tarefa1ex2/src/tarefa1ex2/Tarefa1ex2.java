package tarefa1ex2;

import java.util.Scanner;


public class Tarefa1ex2 {

    public static void main(String[] args) {
        int i, j, k, l;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite 3 valores: ");
        
        i = in.nextInt();
        j = in.nextInt();
        k = in.nextInt();
                
        if(i < j + k & j < k + i & k < i + j){
            if(i == j & i == k){
                System.out.println("Os valores dados formam um triângulo Equilátero.");
            }
            if(i == j & i != k){
                System.out.println("Os valores dados formam um triângulo Isóceles.");
            }
            if(i != j & j != k & i != k){
                System.out.println("Os valores dados formam um triângulo Escaleno.");
            }
        }else{
            System.out.println("Os valores digitados não formam um triângulo");
        }
    }
}
