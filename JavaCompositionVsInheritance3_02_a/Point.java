package JavaCompositionVsInheritance3_02_a;

public class Point {
    private int x = 0;
    private int y = 0;

    public Point() {
        // no arguments
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY() {
        return new int[]{getX(),getY()};
    }
    public void setXY(int x, int y) {
        setX(x);
        setY(y);
    }
    @Override
    public String toString() {
        return "(" + getX() + ", " + getY() + ")";
    }
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(getX()-x, 2)+Math.pow(getY()-y, 2));
    }
    public double distance(Point point) {
        return Math.sqrt(Math.pow(getX()-point.getX(), 2)+Math.pow(getY()-point.getY(), 2));
    }
    public double distance() {
        return Math.sqrt(Math.pow(getX(), 2)+Math.pow(getY(), 2));
    }
}
