import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) throws Exception {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(2100);
        
        selecaoCandidatos();

        imprimirSelecionados();

        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }
    static void entrandoEmContato(String candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true, atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = ! atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            }
            else {
                System.out.println("Contato realizado com sucesso!");
            }
        } while (continuarTentando && tentativasRealizadas <= 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa.");
        }
        else {
            System.out.println("Não conseguimos contato com " + candidato + ", número máximo de tentativas " + (tentativasRealizadas - 1) + " realizadas.");
        }
    }
    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }
    static void imprimirSelecionados() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto"};

        System.out.println("Imprimindo a lista de candidatos selecionados informando o índice do elemento:");
        
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O(A) candidato(a) de n° " + (i + 1) + " é o(a) " + candidatos[i]);
        }
    }
    static void selecaoCandidatos() {
        String [] candidatos = {"Felipe", "Marcia", "Julia", "Paulo", "Augusto", "Mônica", "Fabrício", "Mirela", "Daniela", "Jorge"};
        int candidatosSelecionados = 0, candidatoAtual = 0;
        double salarioBase = 2000.0;

        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O(A) candidato(a) " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if (salarioPretendido <= salarioBase) {
                System.out.println("O(A) canditado(a) " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }
    }
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato (double salarioPretendido ) {
        double salarioBase = 2000.0;
        if (salarioPretendido < salarioBase) {
            System.out.println("Ligar para candidato.");
        }
        else if (salarioPretendido == salarioBase) {
            System.out.println("Ligar para candidato com contra proposta.");
        }
        else {
            System.out.println("Aguardando o resultado dos demais candidatos.");
        }
    }
}
