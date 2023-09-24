import iphone.interfaces.AparelhoCompleto;
import iphone.interfaces.AparelhoTelefonicoENavegadorInternet;
import iphone.interfaces.AparelhoTelefonicoEReprodutorMusical;
import iphone.interfaces.NavegadorInternetEReprodutorMusical;
import iphone.interfaces.base.AparelhoTelefonico;
import iphone.Iphone;
import iphone.interfaces.base.NavegadorInternet;
import iphone.interfaces.base.ReprodutorMusical;

public class Main {
    public static void main(String[] args) {

        // Instanciar um builder de iphone, responsável por construir um aparelho customizado
        Iphone.Builder iphoneBuilder = new Iphone.Builder();


        // Combinações de funcionalidades

        System.out.println("Iphone como Aparelho Telefônico\n");
        AparelhoTelefonico aparelhoTelefonico = iphoneBuilder.comoAparelhoTelefonico();
        aparelhoTelefonico.atender();
        aparelhoTelefonico.ligar();
        aparelhoTelefonico.iniciarCorrerioVoz();


        System.out.println("\nIphone como Navegador Internet\n");
        NavegadorInternet navegadorInternet = iphoneBuilder.comoNavegadorInternet();
        navegadorInternet.exibirPagina();
        navegadorInternet.adicionarNovaAba();
        navegadorInternet.atualizarPagina();


        System.out.println("\nIphone como Reprodutor Musical\n");
        ReprodutorMusical reprodutorMusical = iphoneBuilder.comoReprodutorMusical();
        reprodutorMusical.tocar();
        reprodutorMusical.pausar();
        reprodutorMusical.selecionarMusica();


        System.out.println("\nIphone como Aparelho Telefônico e Reprodutor Musical\n");
        AparelhoTelefonicoEReprodutorMusical aparelhoTelefonicoEReprodutorMusical = iphoneBuilder.comoAparelhoTelefonicoEReprodutorMusical();
        aparelhoTelefonicoEReprodutorMusical.atender();
        aparelhoTelefonicoEReprodutorMusical.ligar();
        aparelhoTelefonicoEReprodutorMusical.iniciarCorrerioVoz();

        aparelhoTelefonicoEReprodutorMusical.pausar();
        aparelhoTelefonicoEReprodutorMusical.tocar();
        aparelhoTelefonicoEReprodutorMusical.selecionarMusica();



        System.out.println("\nIphone como Aparelho Telefônico e Navegador Internet\n");
        AparelhoTelefonicoENavegadorInternet aparelhoTelefonicoENavegadorInternet = iphoneBuilder.comoAparelhoTelefonicoENavegadorInternet();
        aparelhoTelefonicoENavegadorInternet.atender();
        aparelhoTelefonicoENavegadorInternet.ligar();
        aparelhoTelefonicoENavegadorInternet.iniciarCorrerioVoz();

        aparelhoTelefonicoENavegadorInternet.exibirPagina();
        aparelhoTelefonicoENavegadorInternet.adicionarNovaAba();
        aparelhoTelefonicoENavegadorInternet.atualizarPagina();


        System.out.println("\nIphone como Navegador Internet e Reprodutor Musical\n");
        NavegadorInternetEReprodutorMusical navegadorInternetEReprodutorMusical = iphoneBuilder.comoNavegadorInternetEReprodutorMusical();
        navegadorInternetEReprodutorMusical.adicionarNovaAba();
        navegadorInternetEReprodutorMusical.atualizarPagina();
        navegadorInternetEReprodutorMusical.exibirPagina();

        navegadorInternetEReprodutorMusical.selecionarMusica();
        navegadorInternetEReprodutorMusical.tocar();
        navegadorInternetEReprodutorMusical.pausar();


        System.out.println("\nIphone como Aparelho Completo\n");
        AparelhoCompleto aparelhoCompleto = iphoneBuilder.comoAparelhoCompleto();
        aparelhoCompleto.exibirPagina();
        aparelhoCompleto.atualizarPagina();
        aparelhoCompleto.adicionarNovaAba();

        aparelhoCompleto.selecionarMusica();
        aparelhoCompleto.tocar();
        aparelhoCompleto.pausar();

        aparelhoCompleto.ligar();
        aparelhoCompleto.atender();
        aparelhoCompleto.iniciarCorrerioVoz();
    }
}