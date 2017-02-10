package de.budde.laura.shape;

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

}
