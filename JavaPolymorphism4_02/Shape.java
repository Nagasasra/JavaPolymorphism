package JavaPolymorphism4_02;

public class Shape {
    private String color = "red";

    public Shape() {
    }
    public Shape (String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return "Shape[color=" + color + "]";
    }
    public double getArea() {
        // We have a problem here!
        // We need to return some value to compile the program.
        System.err.println("Shape unknown! Cannot compute area!");
        return 0;
    }
}

