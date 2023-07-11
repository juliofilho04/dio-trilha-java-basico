package funcionalidades.telefone;

public class AparelhoTelefonico implements Telefone{
    public void iniciarTelefone() {
        System.out.println("Iniciando o telefone");
    }
    public void ligar() {
        System.out.println("Ligando para o número/contato desejado");
    }
    public void atender() {
        System.out.println("Atendendo a chamada encaminhada");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Acessando o correio de voz");
    }
}
