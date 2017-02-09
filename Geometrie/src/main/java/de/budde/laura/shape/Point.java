package de.budde.laura.shape;

public class Point {

    private int x;
    private int y;

    /**
     * Create a Point by using coordinates.
     *
     * @param x
     * @param y
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Create a Point at the origin.
     */
    public Point() {
        x = 0;
        y = 0;
    }

    /**
     * Return the x-coordinate.
     * 
     * @return x
     */
    public int getX() {
        return x;
    }

    /**
     * Return the y coordinate.
     * 
     * @return y
     */
    public int getY() {
        return y;
    }

    /**
     * Shift this Point by adding coordinates.
     *
     * @param x
     * @param y
     */
    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;

    }

    /**
     * Shift this Point by adding the coordinates
     * of another Point.
     *
     * @param p The Point to be added.
     */
    public void shift(Point p) {
        move(p.getX(), p.getY());
    }

    public void print() {
        System.out.println(this.toString());
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

    @Override
    public String toString() {
        return "Point [x=" + x + ", y=" + y + "]";
    }

}
