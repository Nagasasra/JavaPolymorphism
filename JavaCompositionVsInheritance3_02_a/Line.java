package JavaCompositionVsInheritance3_02_a;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }
    public Line(int x1, int y1, int x2, int y2) {
        this.begin = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }
    public Point getBegin() {
        return begin;
    }
    public Point getEnd() {
        return end;
    }
    public int getBeginX() {
        return getBegin().getX();
    }
    public int getBeginY() {
        return getBegin().getY();
    }
    public int getEndX() {
        return getEnd().getX();
    }
    public int getEndY() {
        return getEnd().getY();
    }
    public int[] getBeginXY() {
        return new int[]{getBeginX(),getBeginY()};
    }
    public int[] getEndXY() {
        return new int[]{getEndX(),getEndY()};
    }
    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public void setEnd(Point end) {
        this.end = end;
    }
    public void setBeginX(int beginX) {
        getBegin().setX(beginX);
    }
    public void setBeginY(int beginY) {
        getBegin().setY(beginY);
    }
    public void setEndX(int endX) {
        getEnd().setX(endX);
    }
    public void setEndY(int endY) {
        getEnd().setY(endY);
    }
    public void setBeginXY(int beginX, int beginY) {
        getBegin().setX(beginX);
        getBegin().setY(beginY);
    }
    public void setEndXY(int endX, int endY) {
        getEnd().setX(endX);
        getEnd().setY(endY);
    }
    public double getLength() {
        return getBegin().distance(getEnd());
    }
    public double getGradient() {
        return Math.atan2(getBeginY() - getEndY(), getBeginX() - getEndX());
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + getBegin() +
                ", end=" + getEnd() +
                '}';
    }
}
