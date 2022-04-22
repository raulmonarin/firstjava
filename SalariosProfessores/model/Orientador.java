package poos3.br.edu.ifsp.arq.SalariosProfessores.model;

public class Orientador extends Contrato {
    private double valAulaOri;

    public Orientador(String nome, String codigo, double salBase, double valAulaAtv, double valAulaOri) {
        super(nome, codigo, salBase, valAulaAtv);
        this.valAulaOri = valAulaOri;
    }

    public double getValAulaOri() {
        return valAulaOri;
    }

    public void setValAulaOri(double valAulaOri) {
        this.valAulaOri = valAulaOri;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario();
    }
}
