package composite;

class Rectangle extends BaseShape {

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void print() {
        System.out.println("I'm rectangle.");
    }
}
