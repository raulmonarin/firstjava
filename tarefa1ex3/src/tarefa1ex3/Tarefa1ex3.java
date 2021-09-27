package tarefa1ex3;

import java.util.Scanner;

public class Tarefa1ex3 {

    public static void main(String[] args) {
        
        int i, j, k, l, m, n, o, p, aju;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite o valor a ser sacado: ");
        
        i = in.nextInt();

        System.out.println("Serão retiradas: ");
        
        j = i / 100;
        aju = i % 100;

        if(j >= 1){
            System.out.println(j+" nota(s) de R$100");
        }
        
        j = aju / 50;
        aju = aju % 50;
        
        if(j >= 1){
            System.out.println(j+" nota(s) de R$50");
        }
         
        j = aju / 20;
        aju = aju % 20;
        
        if(j >= 1){
            System.out.println(j+" nota(s) de R$20");
        }
         
        j = aju / 10;
        aju = aju % 10;
        
        if(j >= 1){
            System.out.println(j+" nota(s) de R$10");
        }
         
        j = aju / 5;
        aju = aju % 5;
        
        if(j >= 1){
            System.out.println(j+" nota(s) de R$5");
        }
         
        j = aju / 2;
        aju = aju % 2;
        
        if(j >= 1){
            System.out.println(j+" nota(s) de R$2");
        }
        
        j = aju / 1;
        aju = aju % 1;
        
        if(j >= 1){
            System.out.println(j+" moeda(s) de R$1");
        }
    }  
}
