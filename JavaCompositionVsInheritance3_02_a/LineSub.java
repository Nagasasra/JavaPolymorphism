package JavaCompositionVsInheritance3_02_a;

public class LineSub extends Point {
    private Point end;

    public LineSub(int x1, int y1, int x2, int y2) {
        super(x1, y1);
        this.end = new Point(x2, y2);
    }
    public LineSub(Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }
    public Point getBegin() {
        //return super(getX(), getY());
        return this;
    }
    public void setBegin(Point begin) {
        super.setXY(begin.getX(), begin.getY());
    }
    public Point getEnd() {
        return end;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public int getBeginX() {
        return super.getX();
    }
    public void setBeginX(int x) {
        super.setX(x);
    }
    public int getBeginY() {
        return super.getY();
    }
    public void setBeginY(int y) {
        super.setY(y);
    }
    public int[] getBeginXY() {
        return super.getXY();
    }
    public void setBeginXY(int x, int y) {
        super.setXY(x, y);
    }
    public int getEndX() {
        return getEnd().getX();
    }
    public void setEndX(int x) {
        getEnd().setX(x);
    }
    public int getEndY() {
        return getEnd().getY();
    }
    public void setEndY(int y) {
        getEnd().setY(y);
    }
    public int[] getEndXY() {
        return getEnd().getXY();
    }
    public void setEndXY(int x, int y) {
        getEnd().setXY(x, y);
    }
    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ",end=" + getEnd() + ']';
    }
    public double getLength() {
        return super.distance(getEnd());
    }
}
