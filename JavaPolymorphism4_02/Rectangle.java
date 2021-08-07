package JavaPolymorphism4_02;

public class Rectangle extends Shape {
    private int length = 1, width = 1;

    public Rectangle() {
    }
    public Rectangle(String color) {
        super(color);
    }
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    public Rectangle(String color, int length, int width) {
        super(color);
        this.length = length;
        this.width = width;
    }
    public int getLength() {
        return length;
    }
    public int getWidth() {
        return width;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    @Override
    public String toString() {
        return "Rectangle[length=" + getLength() + ",width=" + getWidth() + "," + super.toString() + "]";
    }
    @Override
    public double getArea() {
        return getLength() * getWidth();
    }
}