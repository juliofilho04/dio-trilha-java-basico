import funcionalidades.internet.Internet;
import funcionalidades.internet.NavegadorInternet;
import funcionalidades.musica.Musica;
import funcionalidades.musica.ReprodutorMusical;
import funcionalidades.telefone.AparelhoTelefonico;
import funcionalidades.telefone.Telefone;

public class Outros {
    public static void main(String[] args) {
        Musica ipod = new ReprodutorMusical();
        Internet mac = new NavegadorInternet();
        Telefone telefone = new AparelhoTelefonico();

        ipod.iniciarIpod();
        ipod.tocar();
        ipod.pausar();
        ipod.selecionarMusica();

        mac.iniciarMac();
        mac.exibirPagina();
        mac.adicionarNovaAba();
        mac.atualizarPagina();

        telefone.iniciarTelefone();
        telefone.ligar();
        telefone.atender();
        telefone.iniciarCorreioVoz();
    }
    
}
