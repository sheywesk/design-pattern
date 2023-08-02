package composite;

public abstract class BaseShape {
    private int width;
    private int heigh;
    public BaseShape(int width, int heigh) {
        this.width = width;
        this.heigh = heigh;
    }
    public BaseShape() {
    }
    public abstract void print();
}
