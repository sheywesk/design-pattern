package composite;

public class Client {
    public static void main(String[] args) {

        var compoundShape = new CompoundShape(
                new Circle(10, 10),
                new Circle(10, 10),
                new Rectangle(10, 10));

        compoundShape.print();
        var compoundShape2 = new CompoundShape(
                new Circle(10, 10),
                new Circle(10, 10),
                compoundShape);
                
        compoundShape2.print();
    }
}
