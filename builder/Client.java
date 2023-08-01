package builder;

public class Client {
    public static void main(String[] args) {
        Car car = Car.builder()
                .comCor("branca")
                .doModelo("jetta")
                .build();
    }
}
