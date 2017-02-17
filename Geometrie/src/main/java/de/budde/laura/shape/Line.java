package de.budde.laura.shape;

import java.awt.Color;
import java.awt.Graphics2D;

import de.budde.laura.painter.LinePainter;
import de.budde.laura.painter.Painter;

public class Line extends Shape {
    // y=mx+n
    private final double m;
    private final int n;

    /**
     * Create a Line by using two Points.
     *
     * @param pk1
     * @param pk2
     */
    private Line(Point pk1, Point pk2, Color c) {
        super(c);
        this.m = (double) (pk1.getY() - pk2.getY()) / (double) (pk1.getX() - pk2.getX());
        this.n = (int) (pk1.getY() - (this.m * pk1.getX()));
    }

    /**
     * Create a Line by using a Point and the gradient.
     */

    private Line(Point pk1, int m, Color c) {
        super(c);
        this.m = m;
        this.n = pk1.getY() - (m * pk1.getX());
    }

    /**
     * Create a Line by using the y-intercept and the gradient.
     *
     * @param m The gradient.
     * @param n The y-intercept.
     */
    private Line(double m, int n, Color c) {
        super(c);
        this.m = m;
        this.n = n;
    }

    public static Line of(Point pk1, Point pk2, Color c) {
        return new Line(pk1, pk2, c);
    }

    public static Line of(Point pk1, Point pk2) {
        return new Line(pk1, pk2, Color.DARK_GRAY);
    }

    public static Line of(Point pk1, int m, Color c) {
        return new Line(pk1, m, c);
    }

    public static Line of(Point pk1, int m) {
        return new Line(pk1, m, Color.DARK_GRAY);
    }

    public static Line of(double m, int n, Color c) {
        return new Line(m, n, c);
    }

    public static Line of(double m, int n) {
        return new Line(m, n, Color.DARK_GRAY);
    }

    /**
     * Calculate Y for argument X.
     *
     * @param x The argument.
     * @return The function value.
     */
    public int calculateY(int x) {
        return (int) (this.m * x + this.n);
    }

    /**
     * Calculate X for argument Y.
     *
     * @param y The argument.
     * @return X.
     */
    public int calculateX(int y) {
        return (int) ((y - this.n) / this.m);
    }

    /**
     * Get the gradient of a Line.
     *
     * @return The gradient.
     */
    public double getM() {
        return this.m;
    }

    /**
     * Get the y-intercept of a Line.
     *
     * @return The y-intercept.
     */
    public int getN() {
        return this.n;
    }

    @Override
    public Shape move(int x, int y) {
        int n = (int) (y + this.n - (this.m * x));
        Line newLine = new Line(this.m, n, this.getColor());
        return newLine;
    }

    @Override
    public Painter getPainter(Graphics2D g2, int width, int height) {

        return new LinePainter(g2, this, width, height);
    }

    @Override
    public String toString() {
        return "Line [m=" + this.m + ", n=" + this.n + "]";
    }
}
