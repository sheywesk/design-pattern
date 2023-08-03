package decorator;

public abstract class ProductDecorator implements Product {
    private Product product;

    public ProductDecorator(Product product) {
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }
}
