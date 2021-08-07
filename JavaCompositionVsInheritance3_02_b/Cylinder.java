package JavaCompositionVsInheritance3_02_b;

public class Cylinder {
    private double height = 1;
    private Circle base;

    public Cylinder() {
        this.base = new Circle();
    }
    public Cylinder(double height) {
        this.base = new Circle();
        this.height = height;
    }
    public Cylinder(double radius, double height) {
        this.base = new Circle(radius);
        this.height = height;
    }
    public Cylinder(double radius, String color, double height) {
        this.base = new Circle(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getHeight() * getBase().getArea();
    }
    public Circle getBase() {
        return base;
    }

    @Override
    public String toString() {
        return "Cylinder{" + "height=" + getHeight() + '}';
    }
    public double getArea() {
        return 2 * Math.PI * getBase().getRadius() * getHeight() + 2 * getBase().getArea();
    }
}
