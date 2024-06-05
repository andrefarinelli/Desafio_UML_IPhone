public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("IPHONE");

        IPhone iphone = new IPhone();
        iphone.ligar("11995551234");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Rock");
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

    }
}
