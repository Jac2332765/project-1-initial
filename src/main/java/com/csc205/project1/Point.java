package com.csc205.project1;
/*
in java. write a class that represents a point on  a cartesian plane
Used Chat Gpt for this assignment
 */

public class Point {
    private double x;
    private double y;

    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public void shiftX(double n) {
        x += n;
    }

    public void shiftY(double n) {
        y += n;
    }

    public double distance(Point other) {
        double dx = this.x - other.x;
        double dy = this.y - other.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public void rotate(double angle) {

        double cos = Math.cos(angle);
        double sin = Math.sin(angle);

        double newX = cos * this.x - sin * this.y;
        double newY = sin * this.x + cos * this.y;

        this.x = newX;
        this.y = newY;

    }




    @Override
    public String toString() {
        return "{x=" + x + ",y=" + y + "}";
    }

    public static void main(String[] args) {
        Point point1 = new Point(2.0, 3.0);
        Point point2 = new Point(4.0, 5.0);

        System.out.println("Point 1: " + point1);
        System.out.println("Point 2: " + point2);

        // Example of setting new coordinates for a point
        point1.setX(5.0);
        point1.setY(6.0);

        System.out.println("Updated Point 1: " + point1);
    }
}
