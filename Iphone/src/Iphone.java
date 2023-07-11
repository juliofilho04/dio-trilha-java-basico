import funcionalidades.Sistema;

public class Iphone {
    public static void main(String[] args) {
        Sistema sistema = new Sistema();

        sistema.iniciandoIphone();

        sistema.iniciarMac();
        sistema.exibirPagina();
        sistema.adicionarNovaAba();
        sistema.atualizarPagina();
        
        sistema.iniciarIpod();
        sistema.tocar();
        sistema.pausar();
        sistema.selecionarMusica();

        sistema.iniciarTelefone();
        sistema.ligar();
        sistema.atender();
        sistema.iniciarCorreioVoz();


    }
}
