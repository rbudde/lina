package de.budde.laura.shape;

import java.awt.Color;
import java.awt.Graphics2D;

import de.budde.laura.painter.Painter;
import de.budde.laura.painter.PointPainter;

public class Point extends Shape {

    private int x;
    private int y;

    /**
     * Create a Point by using coordinates.
     *
     * @param x
     * @param y
     */
    private Point(int x, int y, Color c) {
        super(c);
        this.x = x;
        this.y = y;
    }

    public static Point of(int x, int y, Color c) {
        return new Point(x, y, c);
    }

    public static Point of(int x, int y) {
        return new Point(x, y, Color.BLACK);
    }

    /**
     * Create a Point at the origin.
     */
    public static Point getOrigin() {
        return new Point(0, 0, Color.BLACK);
    }

    /**
     * Calculate the distance to the origin.
     *
     * @param Point
     */
    public int length(Point p) {
        int length;
        return length = (int) Math.sqrt((p.getX()) * (p.getX()) + p.getY() * p.getY());
    }

    /**
     * Return the x-coordinate.
     *
     * @return x
     */
    public int getX() {
        return this.x;
    }

    /**
     * Return the y coordinate.
     *
     * @return y
     */
    public int getY() {
        return this.y;
    }

    @Override
    public Shape move(int x, int y) {
        int a = this.x + x;
        int b = this.y + y;
        return Point.of(a, b, this.getColor());
    }

    @Override
    public Painter getPainter(Graphics2D g2, int width, int height) {
        return new PointPainter(g2, this, width, height);
    }

    @Override
    public String toString() {
        return "Point [x=" + this.x + ", y=" + this.y + "]";
    }

    /**
     * Return the distance between two Points.
     *
     * @param p1
     * @param p2
     * @return The distance.
     */
    public static double distance(Point p1, Point p2) {
        int x = p1.getX() - p2.getX();
        int y = p1.getY() - p2.getY();
        double dist = Math.sqrt(x * x + y * y);
        return dist;
    }

}
