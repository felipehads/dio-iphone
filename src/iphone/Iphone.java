package iphone;

import iphone.interfaces.AparelhoCompleto;
import iphone.interfaces.AparelhoTelefonicoEReprodutorMusical;
import iphone.interfaces.NavegadorInternetEReprodutorMusical;
import iphone.interfaces.base.AparelhoTelefonico;
import iphone.interfaces.AparelhoTelefonicoENavegadorInternet;
import iphone.interfaces.base.NavegadorInternet;
import iphone.interfaces.base.ReprodutorMusical;

public class Iphone {
    private Iphone() {
    }

    public static class Builder {
        protected Iphone iphone;

        public Builder() {
            iphone = new Iphone();
        }

        public AparelhoTelefonico comoAparelhoTelefonico() {
            return new AparelhoTelefonicoBuilder(iphone);
        }

        public NavegadorInternet comoNavegadorInternet() {
            return new NavegadorInternetBuilder(iphone);
        }

        public ReprodutorMusical comoReprodutorMusical() {
            return new ReprodutorMusicalBuilder(iphone);
        }

        public AparelhoTelefonicoENavegadorInternet comoAparelhoTelefonicoENavegadorInternet() {
            return new AparelhoTelefonicoENavegadorInternetBuilder(iphone);
        }

        public AparelhoTelefonicoEReprodutorMusical comoAparelhoTelefonicoEReprodutorMusical() {
            return new AparelhoTelefonicoEReprodutorMusicalBuilder(iphone);
        }

        public NavegadorInternetEReprodutorMusical comoNavegadorInternetEReprodutorMusical() {
            return new NavegadorInternetEReprodutorMusicalBuilder(iphone);
        }

        public AparelhoCompleto comoAparelhoCompleto() {
            return new AparelhoCompletoBuilder(iphone);
        }

        private class AparelhoTelefonicoBuilder extends Builder implements AparelhoTelefonico {
            AparelhoTelefonicoBuilder(Iphone iphone) {
                this.iphone = iphone;
            }

            @Override
            public void ligar() {
                System.out.println("Ligando 🤙🤙🤙");
            }

            @Override
            public void atender() {
                System.out.println("Alô?! 📳📳📳");
            }

            @Override
            public void iniciarCorrerioVoz() {
                System.out.println("Iniciando correio de voz 🗣🗣🗣");
            }
        }

        private class NavegadorInternetBuilder extends Builder implements NavegadorInternet {
            NavegadorInternetBuilder(Iphone iphone) {
                this.iphone = iphone;
            }

            @Override
            public void exibirPagina() {
                System.out.println("Exibindo página 📄📄📄´´");
            }

            @Override
            public void adicionarNovaAba() {
                System.out.println("Abrindo nova aba 📂📂📂");
            }

            @Override
            public void atualizarPagina() {
                System.out.println("Atualizando página 🧵🧵🧵");
            }
        }

        private class ReprodutorMusicalBuilder extends Builder implements ReprodutorMusical {

            ReprodutorMusicalBuilder(Iphone iphone) {
                this.iphone = iphone;
            }

            @Override
            public void tocar() {
                System.out.println("Música tocando 🎵🎵🎵");
            }

            @Override
            public void pausar() {
                System.out.println("Música pausada ⏸⏸⏸");
            }

            @Override
            public void selecionarMusica() {
                System.out.println("Música selecionada ✔✔✔");
            }
        }

        private class AparelhoTelefonicoENavegadorInternetBuilder extends Builder implements AparelhoTelefonicoENavegadorInternet {

            private AparelhoTelefonico aparelhoTelefonico;
            private NavegadorInternet navegadorInternet;

            public AparelhoTelefonicoENavegadorInternetBuilder(Iphone iphone) {
                this.iphone = iphone;
                this.aparelhoTelefonico = new AparelhoTelefonicoBuilder(iphone);
                this.navegadorInternet = new NavegadorInternetBuilder(iphone);
            }

            @Override
            public void ligar() {
                this.aparelhoTelefonico.ligar();
            }

            @Override
            public void atender() {
                this.aparelhoTelefonico.atender();
            }

            @Override
            public void iniciarCorrerioVoz() {
                this.aparelhoTelefonico.iniciarCorrerioVoz();
            }

            @Override
            public void exibirPagina() {
                this.navegadorInternet.exibirPagina();
            }

            @Override
            public void adicionarNovaAba() {
                this.navegadorInternet.adicionarNovaAba();
            }

            @Override
            public void atualizarPagina() {
                this.navegadorInternet.atualizarPagina();
            }
        }

        private class AparelhoTelefonicoEReprodutorMusicalBuilder extends Builder implements AparelhoTelefonicoEReprodutorMusical {
            private AparelhoTelefonico aparelhoTelefonico;
            private ReprodutorMusical reprodutorMusical;

            AparelhoTelefonicoEReprodutorMusicalBuilder(Iphone iphone) {
                this.iphone = iphone;
                this.aparelhoTelefonico = new AparelhoTelefonicoBuilder(iphone);
                this.reprodutorMusical = new ReprodutorMusicalBuilder(iphone);
            }

            @Override
            public void ligar() {
                this.aparelhoTelefonico.ligar();
            }

            @Override
            public void atender() {
                this.aparelhoTelefonico.atender();
            }

            @Override
            public void iniciarCorrerioVoz() {
                this.aparelhoTelefonico.iniciarCorrerioVoz();
            }

            @Override
            public void tocar() {
                this.reprodutorMusical.tocar();
            }

            @Override
            public void pausar() {
                this.reprodutorMusical.pausar();
            }

            @Override
            public void selecionarMusica() {
                this.reprodutorMusical.selecionarMusica();
            }
        }

        private class NavegadorInternetEReprodutorMusicalBuilder extends Builder implements NavegadorInternetEReprodutorMusical {
            private NavegadorInternet navegadorInternet;
            private ReprodutorMusical reprodutorMusical;

            NavegadorInternetEReprodutorMusicalBuilder(Iphone iphone) {
                this.iphone = iphone;
                this.navegadorInternet = new NavegadorInternetBuilder(iphone);
                this.reprodutorMusical = new ReprodutorMusicalBuilder(iphone);
            }

            @Override
            public void exibirPagina() {
                this.navegadorInternet.exibirPagina();
            }

            @Override
            public void adicionarNovaAba() {
                this.navegadorInternet.adicionarNovaAba();
            }

            @Override
            public void atualizarPagina() {
                this.navegadorInternet.atualizarPagina();
            }

            @Override
            public void tocar() {
                this.reprodutorMusical.tocar();
            }

            @Override
            public void pausar() {
                this.reprodutorMusical.pausar();
            }

            @Override
            public void selecionarMusica() {
                this.reprodutorMusical.selecionarMusica();
            }
        }

        private class AparelhoCompletoBuilder extends Builder implements AparelhoCompleto {
            private AparelhoTelefonico aparelhoTelefonico;
            private NavegadorInternet navegadorInternet;
            private ReprodutorMusical reprodutorMusical;

            AparelhoCompletoBuilder(Iphone iphone) {
                this.iphone = iphone;
                this.aparelhoTelefonico = new AparelhoTelefonicoBuilder(iphone);
                this.navegadorInternet = new NavegadorInternetBuilder(iphone);
                this.reprodutorMusical = new ReprodutorMusicalBuilder(iphone);
            }

            @Override
            public void ligar() {
                this.aparelhoTelefonico.ligar();
            }

            @Override
            public void atender() {
                this.aparelhoTelefonico.atender();
            }

            @Override
            public void iniciarCorrerioVoz() {
                this.aparelhoTelefonico.iniciarCorrerioVoz();
            }

            @Override
            public void exibirPagina() {
                this.navegadorInternet.exibirPagina();
            }

            @Override
            public void adicionarNovaAba() {
                this.navegadorInternet.adicionarNovaAba();
            }

            @Override
            public void atualizarPagina() {
                this.navegadorInternet.atualizarPagina();
            }

            @Override
            public void tocar() {
                this.reprodutorMusical.tocar();
            }

            @Override
            public void pausar() {
                this.reprodutorMusical.pausar();
            }

            @Override
            public void selecionarMusica() {
                this.reprodutorMusical.selecionarMusica();
            }
        }
    }
}