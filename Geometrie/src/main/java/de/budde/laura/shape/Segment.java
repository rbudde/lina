package de.budde.laura.shape;

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
    public Segment(Point p1, Point p2) {
        start = p1;
        end = p2;

    }

    /**
     * Return the Point where the Segment starts.
     *
     * @return start Point
     */
    public Point getStart() {
        return start;
    }

    /**
     * Return the Point where the Segment ends.
     *
     * @return end Point
     */
    public Point getEnd() {
        return end;
    }

    /**
     * Get the Length of the Segment.
     *
     * @param Start Point of the Segment.
     * @param End Point of the Segment.
     * @return The distance.
     */
    public double getLength() {
        return Point.distance(start, end);
    }

    @Override
    public String toString() {
        return "Distance  [start=" + start + ", end=" + end + "]";
    }

    @Override
    public Painter getPainter(Graphics2D g2, int width, int height) {

        return new SegmentPainter(g2, this, width, height);
    }

    /**
     * Moves the Segment by adding the coordinates of a Point.
     */

    @Override
    public void move(int x, int y) {
        int a;
        int b;
        int c;
        int d;
        a = start.getX() + x;
        b = start.getY() + y;
        c = end.getX() + x;
        d = end.getY() + y;
        start = Point.of(a, b);
        end = Point.of(c, d);

    }

}
