package poos3.br.edu.ifsp.arq.SalariosProfessores.model;

public class Hora extends Professor{
    private double valAula;
    private double qntAulas;
    private double valAulaAtv;

    public Hora(String nome, String codigo, double valAula, double qntAulas, double valAulaAtv) {
        super(nome, codigo);
        this.valAula = valAula;
        this.qntAulas = qntAulas;
        this.valAulaAtv = valAulaAtv;
    }

    public double getValAula() {
        return valAula;
    }

    public void setValAula(double valAula) {
        this.valAula = valAula;
    }

    public double getQntAulas() {
        return qntAulas;
    }

    public void setQntAulas(double qntAulas) {
        this.qntAulas = qntAulas;
    }

    public double getValAulaAtv() {
        return valAulaAtv;
    }

    public void setValAulaAtv(double valAulaAtv) {
        this.valAulaAtv = valAulaAtv;
    }

    @Override
    public double calcularSalario() {
        return ((qntAulas * valAula) * 4.25) + (valAulaAtv * qntAulas);
    }
}
