package JavaPolymorphism4_01;

public class Cylinder extends Circle {
    private double height = 1;

    public Cylinder() {
    }
    public Cylinder(double height, double radius) {
        super(radius);
        this.height = height;
    }
    public double getHeight() {
        return this.height;
    }
    public double getVolume() {
        return super.getArea() * getHeight();
    }
    @Override
    public double getArea() {
        return 2 * Math.PI * getRadius() * getHeight();
    }
    @Override
    public String toString() {
        return "Cylinder[height=" + getHeight() + "," + super.toString() + "]";
    }
}
