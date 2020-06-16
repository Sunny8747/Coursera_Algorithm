package Merge_Sort;

import java.util.Comparator;
import java.util.Arrays; // Arrays.sort()
import edu.princeton.cs.algs4.StdIn;

public class Point implements Comparable<Point> {
    private int posX, posY;

    // constructs the point (x, y)
    public Point(int x, int y) {
        posX = x;
        posY = y;
    }

    // draws this point
    public void draw() {

    }

    // draws the line segment from this point to that point
    public void drawTo(Point that) {

    }

    // string representation
    public String toString() {
        String result = "";
        return result;
    }

    // compare two points by y-coordinates, breaking ties by x-coordinates
    public int compareTo(Point that) {
        int result = 0;
        return result;
    }

    // the slope between this point and that point
    public double slopeTo(Point that) {
        double result = 0;
        return result;
    }

    // compare two points by slopes they make with this point
    public Comparator<Point> slopeOrder() {
        Comparator<Point> result = null;
        return result;
    }
}