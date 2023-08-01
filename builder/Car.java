package builder;

public class Car {
    private String cor;
    private String modelo;
    private String marca;

    public Car(String cor, String modelo, String marca) {
        this.cor = cor;
        this.modelo = modelo;
        this.marca = marca;
    }

    public static class Builder {
        private String cor;
        private String modelo;
        private String marca;

        public Builder comCor(String cor) {
            this.cor = cor;
            return this;
        }

        public Builder doModelo(String modelo) {
            this.modelo = modelo;
            return this;
        }

        public Builder daMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Car build() {
            return new Car(this.cor, this.modelo, this.marca);
        }

    }

    public static Builder builder() {
        return new Builder();
    }

    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

}
