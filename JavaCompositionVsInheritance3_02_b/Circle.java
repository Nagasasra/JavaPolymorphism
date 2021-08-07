package JavaCompositionVsInheritance3_02_b;

public class Circle {
    private double radius = 1;
    private String color = "red";

    public Circle() {
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }
    @Override
    public String toString() {
        return "Circle[" + "radius=" + getRadius() + ", color='" + getColor() + '\'' +
                ']';
    }
}
