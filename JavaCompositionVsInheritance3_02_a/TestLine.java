package JavaCompositionVsInheritance3_02_a;

import java.util.Arrays;

public class TestLine {
    public static void main(String[] args) {

        // creating point p1 with no argument
        Point p1 = new Point();
        System.out.println("p1 = " + p1); // tostring
        p1.setX(5);
        p1.setY(7);
        System.out.println("x (p1) = " + p1.getX());
        System.out.println("y (p1) = " + p1.getY());
        System.out.println("p1 distance to (0, 0) = " + p1.distance());

        // creating point p2 with arguments
        Point p2 = new Point(2, 2);
        System.out.println("p2 = " + p2); // tostring
        p2.setXY(4, 4);
        System.out.println("x (p2), y (p2) =   " + Arrays.toString(p2.getXY()));
        System.out.println("p2 distance to (3, 6) = " + p2.distance(3, 6));

        // creating a line from p1 to p2
        Line l1 = new Line(p1, p2);
        System.out.println("l1 = " + l1);
        System.out.println("l1 length = " + l1.getLength());
        System.out.println("l1 gradient = " + l1.getGradient());

        // creating another line
        Line l2 = new Line(4, 5, 8, 7);
        System.out.println("l2 = " + l2);

        // testing setters and getters
        l2.setBegin(new Point(8, 6));
        l2.setEnd(new Point(3, 1));
        System.out.println("1st coordinate = " + l2.getBegin());
        System.out.println("2nd coordinate = " + l2.getEnd());
        l2.setBeginX(2);
        l2.setBeginY(5);
        System.out.println("1st coordinate's x = " + l2.getBeginX());
        System.out.println("1st coordinate's y = " + l2.getBeginY());
        l2.setEndX(9);
        l2.setEndY(4);
        System.out.println("2nd coordinate's x = " + l2.getEndX());
        System.out.println("2nd coordinate's y = " + l2.getEndY());
        l2.setBeginXY(1, 1);
        l2.setEndXY(3, 8);
        System.out.println("First coordinate = " + Arrays.toString(l1.getBeginXY()));
        System.out.println("Second coordinate = " + Arrays.toString(l1.getEndXY()));
    }
}
