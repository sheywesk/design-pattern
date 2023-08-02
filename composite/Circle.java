package composite;

public class Circle extends BaseShape {

    public Circle(int width, int height) {
        super(width, height);
    }

    @Override
    public void print() {
        System.out.println("I'm circle.");
    }

}
