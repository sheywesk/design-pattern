package decorator;

public class Client {
    public static void main(String[] args) {
        TShirt tshirt = new TShirt();
        System.out.println("price: " + tshirt.price());

        StampDecorator stamp = new StampDecorator(tshirt);
        System.out.println("price: " + stamp.price());

        StampDecorator stampBack = new StampDecorator(stamp);
        System.out.println("price: " + stampBack.price());
    }
}
