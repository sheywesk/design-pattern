package bridge;

public class Client{
    public static void main(String[] args) {
        Square squareBlue = new Square(new Red());
        squareBlue.draw();
        Square squareRed = new Square(new Blue());
        squareRed.draw();

        Triangle triangleBlue = new Triangle(new Blue());
        triangleBlue.draw();
        Triangle triangleRed = new Triangle(new Red());
        triangleRed.draw();
    }
}