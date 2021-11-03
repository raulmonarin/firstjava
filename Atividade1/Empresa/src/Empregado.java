/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raulm
 */
public class Empregado {
    private String nome; 
    private double salario;
    private double salariof;
    private double aumento;
    
    
    Empregado(){
        nome = "";
        salario = 0;
    }
    
    Empregado(String nome, float salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
  

    public void setSalario (double salario){
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario * aumento;
    }
    
    public void setAumento(double aumento){
        this.aumento = aumento;
    }
    
    public double getAumento(){
        return aumento;
    }
    
    
    @Override
    public String toString() {
        return "\n" + "Dados do Empregado:\n" + "Nome= " + nome + "\nSalario com aumento= " + salario ;
    }
    
}
