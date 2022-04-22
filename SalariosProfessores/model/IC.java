package poos3.br.edu.ifsp.arq.SalariosProfessores.model;

public class IC extends Orientador{
    private double qntTrabOriIC;

    public IC(String nome, String codigo, double salBase, double valAulaAtv, double valAulaOri, double qntTrabOriIC) {
        super(nome, codigo, salBase, valAulaAtv, valAulaOri);
        this.qntTrabOriIC = qntTrabOriIC;
    }

    public double getQntTrabOriIC() {
        return qntTrabOriIC;
    }

    public void setQntTrabOriIC(double qntTrabOriIC) {
        this.qntTrabOriIC = qntTrabOriIC;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + ((getValAulaOri() * 4) * qntTrabOriIC);
    }
}
