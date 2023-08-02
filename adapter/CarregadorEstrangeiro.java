package adapter;

public class CarregadorEstrangeiro implements TomadaTresPinos {

    @Override
    public void ligar() {
        System.out.println("Tomada de 3 pinos !");
    }
    
}
