package funcionalidades.internet;

public class NavegadorInternet implements Internet{
    public void iniciarMac() {
        System.out.println("Iniciando o Mac");
    }
    public void exibirPagina() {
        System.out.println("Exibindo a página inicial do navegador");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }
}
