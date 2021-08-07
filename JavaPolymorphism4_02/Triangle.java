package JavaPolymorphism4_02;

public class Triangle extends Shape {
    private int base = 1, height = 1;

    public Triangle() {
    }
    public Triangle(String color) {
        super(color);
    }
    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }
    public Triangle(String color, int base, int height) {
        super(color);
        this.base = base;
        this.height = height;
    }
    public int getBase() {
        return base;
    }
    public int getHeight() {
        return height;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Triangle[base=" + getBase() + ",height=" + getHeight() + "," + super.toString() + "]";
    }

    @Override
    public double getArea() {
        return 0.5 * getBase() * getHeight();
    }
}