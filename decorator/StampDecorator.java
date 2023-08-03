package decorator;

public class StampDecorator extends ProductDecorator {

    public StampDecorator(Product product) {
        super(product);
    }

    @Override
    public int price() {
        return getProduct().price() + 5;
    }

}
