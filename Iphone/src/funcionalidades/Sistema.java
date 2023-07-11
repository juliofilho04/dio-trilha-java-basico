package funcionalidades;
import funcionalidades.internet.Internet;
import funcionalidades.musica.Musica;
import funcionalidades.telefone.Telefone;

public class Sistema implements Internet, Musica, Telefone{
    public static void main(String[] args) throws Exception {
    }
    public void iniciandoIphone() {
        System.out.println("Bem-vindo. Iniciando o sistema do Iphone");
    }
    public void iniciarMac() {
        System.out.println("Iniciando o Mac pelo Iphone");
    }
    public void exibirPagina() {
        System.out.println("Exibindo a página inicial do navegador pelo Iphone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba pelo Iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando a página pelo Iphone");
    }
    public void iniciarIpod() {
        System.out.println("Iniciando o Ipod pelo Iphone");
    }
    public void tocar() {
        System.out.println("Tocando música pelo Iphone");
    }
    public void pausar() {
        System.out.println("Pausando música pelo Iphone");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando música pelo Iphone");
    }
    public void iniciarTelefone() {
        System.out.println("iniciando o telefone pelo Iphone");
    }
    public void ligar() {
        System.out.println("Ligando para o número/contato desejado pelo Iphone");
    }
    public void atender() {
        System.out.println("Atendendo a chamada encaminhada pelo Iphone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Acessando o correio de voz pelo Iphone");
    }
}
