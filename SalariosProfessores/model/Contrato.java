package poos3.br.edu.ifsp.arq.SalariosProfessores.model;

public class Contrato extends Professor{
    private double salBase;
    private double valAulaAtv;

    public Contrato(String nome, String codigo, double salBase, double valAulaAtv) {
        super(nome, codigo);
        this.salBase = salBase;
        this.valAulaAtv = valAulaAtv;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getValAulaAtv() {
        return valAulaAtv;
    }

    public void setValAulaAtv(double valAulaAtv) {
        this.valAulaAtv = valAulaAtv;
    }

    @Override
    public double calcularSalario() {
        return salBase + valAulaAtv * 30;
    }
}
