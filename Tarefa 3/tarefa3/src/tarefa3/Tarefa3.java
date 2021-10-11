package tarefa3;

import java.util.Scanner;

public class Tarefa3 {

    public static void main(String[] args) {
        int i = 0, j = 0, k = 0, l = 0;
        
        Empregado emp1 = new Empregado();
        
        emp1.setNome("Raul");
        emp1.setSobrenome("Monarin");
        emp1.setSalario(10000);
        emp1.getAumento();
        
        j = emp1.testNome();
        if(j == 1){
            System.out.println("Nome nulo!");
            System.exit(0);
        }
        
        l = emp1.testSobrenome();
        if(l == 1){
            System.out.println("Sobrenome nulo!");
            System.exit(0);
        }
        
        i = emp1.testNS2();
        if(i == 1){
            System.out.println("Nome igual ao sobrenome!");
            System.exit(0);
        }
        
        k = emp1.testSal();
        if(k == 1){
            System.out.println("Salário negativo!");
            System.exit(0);
        }
        
        
        System.out.println(emp1.toString());
        
        
    }
    
}
