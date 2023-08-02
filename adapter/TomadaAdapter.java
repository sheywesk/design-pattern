package adapter;

public class TomadaAdapter implements TomadaDoisPinos {
    private TomadaTresPinos tomada3pinos;

    public TomadaAdapter(TomadaTresPinos tomada3pinos) {
        this.tomada3pinos = tomada3pinos;
    }

    @Override
    public void tomada2Pinos() {
       tomada3pinos.ligar();
    }

}
