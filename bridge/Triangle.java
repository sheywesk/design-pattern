package bridge;

public class Triangle implements Shape{
    private Color color;

    public Triangle(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("I'm a triangle | " + color.paint());
    }
}
