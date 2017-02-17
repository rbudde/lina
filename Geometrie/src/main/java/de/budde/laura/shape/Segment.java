package de.budde.laura.shape;

import java.awt.Color;
import java.awt.Graphics2D;

import de.budde.laura.painter.Painter;
import de.budde.laura.painter.SegmentPainter;

public class Segment extends Shape {

    private Point start;
    private Point end;

    /**
     * Create a segment by using two Points(start and end
     * of the Segment)
     *
     * @param p1 The Point where the Segment starts.
     * @param p2 The Point where the Segment ends.
     */
    private Segment(Point p1, Point p2, Color c) {
        super(c);
        this.start = p1;
        this.end = p2;

    }

    public static Segment of(Point p1, Point p2, Color c) {

        return new Segment(p1, p2, c);
    }

    public static Segment of(Point p1, Point p2) {

        return new Segment(p1, p2, Color.BLUE);
    }

    /**
     * Return the Point where the Segment starts.
     *
     * @return start Point
     */
    public Point getStart() {
        return this.start;
    }

    /**
     * Return the Point where the Segment ends.
     *
     * @return end Point
     */
    public Point getEnd() {
        return this.end;
    }

    /**
     * Get the Length of the Segment.
     *
     * @param Start Point of the Segment.
     * @param End Point of the Segment.
     * @return The distance.
     */
    public double getLength() {
        return Point.distance(this.start, this.end);
    }

    @Override
    public String toString() {
        return "Distance  [start=" + this.start + ", end=" + this.end + "]";
    }

    @Override
    public Painter getPainter(Graphics2D g2, int width, int height) {

        return new SegmentPainter(g2, this, width, height);
    }

    @Override
    public Shape move(int x, int y) {

        int a = this.start.getX() + x;
        int b = this.start.getY() + y;
        int c = this.end.getX() + x;
        int d = this.end.getY() + y;
        Point newstart = Point.of(a, b);
        Point newend = Point.of(c, d);

        return new Segment(newstart, newend, this.getColor());
    }

}
