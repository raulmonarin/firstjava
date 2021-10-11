package tarefa3;

public class Empregado {
    private String nome; 
    private String sobrenome;
    private double salario;
    
    Empregado(){
        nome = "";
        sobrenome = "";
        salario = 0;
    }
    
    Empregado(String nome, String sobrenome, float salario){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setSobrenome (String sobrenome){
        this.sobrenome = sobrenome;
    }
    
    public String getSobrenome(){
        return sobrenome;
    }

    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    

    
    public double getAumento(){
        int a;
        for(a = 0; a < 6; a++){
            salario = salario * 1.02;
        }
        
        return salario;
    }
    
    public int testNome(){
        if(nome != null && !nome.equals("")){
            return 0;   
        }
        return 1;
    }
    
    public int testSobrenome(){
        if(sobrenome != null && !sobrenome.equals("")){
            return 0;
        }
        return 1;
    }
    
    public int testNS2(){
        if(nome.equals(sobrenome)){
            return 1;
        }   
        return 0;
    }
    
    public int testSal(){
        if(salario < 0){
            return 1;
        }
        return 0;
    }
    
    @Override
    public String toString() {
        return "\n" + "Dados do Empregado:\n" + "Nome= " + nome + "\nSobrenome= " + sobrenome + "\nSalario com aumento= " + salario ;
    }
    
}
