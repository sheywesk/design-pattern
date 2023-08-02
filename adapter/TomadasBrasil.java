package adapter;

public class TomadasBrasil {
    private TomadaDoisPinos tomadaDoisPinos;

    public TomadasBrasil(TomadaDoisPinos tomadaDoisPinos) {
        this.tomadaDoisPinos = tomadaDoisPinos;
    }

    void ligar() {
        tomadaDoisPinos.tomada2Pinos();
    }

}
