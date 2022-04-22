package poos3.br.edu.ifsp.arq.SalariosProfessores.model;

public abstract class Professor {
    private String nome;
    private String codigo;

    public Professor(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
