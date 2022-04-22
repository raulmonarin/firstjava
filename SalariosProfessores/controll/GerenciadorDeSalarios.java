package poos3.br.edu.ifsp.arq.SalariosProfessores.controll;

import poos3.br.edu.ifsp.arq.SalariosProfessores.model.Contrato;
import poos3.br.edu.ifsp.arq.SalariosProfessores.model.Professor;

import java.util.ArrayList;

public class GerenciadorDeSalarios {

    private static GerenciadorDeSalarios instance;

    private ArrayList<Professor> professores;

    private GerenciadorDeSalarios(){ professores = new ArrayList<>(); }

    public static synchronized GerenciadorDeSalarios getInstance(){
        if (instance == null){
            instance = new GerenciadorDeSalarios();
        }
        return instance;
    }

    public boolean cadastra(Professor professors){
        if (professors != null){
            professores.add(professors);
            return true;
        }
        return false;
    }

    public String gerarFolhaDePagamento() {
        String folhaDepagamento = "";

        for (Professor func : professores) {

            folhaDepagamento += func + String.format(" - Rendimentos: R$ %.2f \n",
                    func.calcularSalario());

            if (func instanceof Contrato) {
                Contrato contratado =
                        (Contrato) func;
                ((Contrato) func).getSalBase();
            }
        }
        return folhaDepagamento;
    }
}
