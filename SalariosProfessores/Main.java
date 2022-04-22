package poos3.br.edu.ifsp.arq.SalariosProfessores;

import poos3.br.edu.ifsp.arq.SalariosProfessores.controll.GerenciadorDeSalarios;
import poos3.br.edu.ifsp.arq.SalariosProfessores.model.Contrato;
import poos3.br.edu.ifsp.arq.SalariosProfessores.model.Hora;
import poos3.br.edu.ifsp.arq.SalariosProfessores.model.IC;
import poos3.br.edu.ifsp.arq.SalariosProfessores.model.TCC;

public class Main {

    public static void main(String[] args) {
        GerenciadorDeSalarios gerenciador = GerenciadorDeSalarios.getInstance();

        Hora horista = new Hora("Jorginho da Massa", "AQ1234567", 150, 16, 100);
        gerenciador.cadastra(horista);

        Contrato contratado = new Contrato("Zacarias", "AQ7654321", 15000, 20);
        gerenciador.cadastra(contratado);

        IC orientadoric = new IC("Jandrei", "AQ3214567", 12000, 20, 100, 5);
        gerenciador.cadastra(orientadoric);

        TCC orientadortcc = new TCC("Carlinhos", "AQ1732456", 13000, 20, 80, 6);
        gerenciador.cadastra(orientadortcc);

        System.out.println(gerenciador.gerarFolhaDePagamento());
    }
}
