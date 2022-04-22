package poos3.br.edu.ifsp.arq.SalariosProfessores.model;

public class TCC extends Orientador{
    private double qntTrabOriTCC;

    public TCC(String nome, String codigo, double salBase, double valAulaAtv, double valAulaOri, double qntTrabOriTCC) {
        super(nome, codigo, salBase, valAulaAtv, valAulaOri);
        this.qntTrabOriTCC = qntTrabOriTCC;
    }

    public double getQntTrabOriTCC() {
        return qntTrabOriTCC;
    }

    public void setQntTrabOriTCC(double qntTrabOriTCC) {
        this.qntTrabOriTCC = qntTrabOriTCC;
    }

    @Override
    public double calcularSalario() {
        double i = qntTrabOriTCC/2;

        return super.calcularSalario() + ((getValAulaOri() * 3) * i);
    }
}
