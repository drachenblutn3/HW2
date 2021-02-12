package ru.stqa.swthw;

public class GeometryCalc {
    public static void main(String[] args) {
        Point p1 = new Point(1.0, 1.0);
        Point p2 = new Point(3.25, 8.25);
        DistanceCalc(p1, p2);
        p1.DistanceToOtherPoint(p2);
    }

    public static void DistanceCalc(Point p1, Point p2) {
        double dist = Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
        System.out.println("Distance between two points (" + p1.x + "," + p1.y + ") " +
                "and (" + p2.x + "," + p2.y + ") is " + dist);
    }
}
