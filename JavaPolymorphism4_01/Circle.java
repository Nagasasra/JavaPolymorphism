package JavaPolymorphism4_01;

public class Circle {
    private double radius = 1;

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
    public String toString() {
        return "Circle[radius=" + getRadius() + "]";
    }
}
