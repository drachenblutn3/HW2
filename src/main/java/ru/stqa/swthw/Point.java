package ru.stqa.swthw;

public class Point {

    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void DistanceToOtherPoint(Point p2) {
        double dist = Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2));
        System.out.println("Distance between two points (" + this.x + "," + this.y + ") " +
                "and (" + p2.x + "," + p2.y + ") is " + dist);
    }
}

