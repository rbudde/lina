package de.budde.laura.shape;

public class Line {
    // y=mx+n

    private double m;
    private int n;

    /**
     * Create a Line by using two Points.
     *
     * @param pk1
     * @param pk2
     */
    public Line(Point pk1, Point pk2) {
        m = (double) (pk1.getY() - pk2.getY()) / (double) (pk1.getX() - pk2.getX());
        n = (int) (pk1.getY() - (m * pk1.getX()));
    }

    /**
     * Create a Line by using the y-intercept and the gradient.
     *
     * @param m The gradient.
     * @param n The y-intercept.
     */
    public Line(double m, int n) {
        this.m = m;
        this.n = n;
    }

    /**
     * Calculate Y for argument X.
     *
     * @param x The argument.
     * @return The function value.
     */
    public int calculateY(int x) {
        return (int) (m * x + n);
    }

    /**
     * Get the gradient of a Line.
     *
     * @return The gradient.
     */
    public double getM() {
        return m;
    }

    /**
     * Get the y-intercept of a Line.
     *
     * @return The y-intercept.
     */
    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "Gerade [m=" + m + ", n=" + n + "]";
    }

}
