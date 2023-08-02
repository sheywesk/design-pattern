package bridge;

public class Square implements Shape {
    private Color color;

    public Square(Color color) {
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("I'm a square | " + color.paint());
    }

}
