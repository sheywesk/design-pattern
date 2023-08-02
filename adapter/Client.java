package adapter;

public class Client {
    public static void main(String[] args) {
        var carregador = new CarregadorEstrangeiro();
        var tomadaBrasil = new TomadasBrasil(new TomadaAdapter(carregador));
        tomadaBrasil.ligar();
    }
}
