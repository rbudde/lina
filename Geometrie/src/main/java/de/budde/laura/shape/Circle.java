package de.budde.laura.shape;

import java.awt.Color;
import java.awt.Graphics2D;

import de.budde.laura.painter.CirclePainter;
import de.budde.laura.painter.Painter;

public class Circle extends Shape {
    private Point center;
    private int radius;

    private Circle(Point center, int radius, Color c) {
        super(c);
        this.center = center;
        this.radius = radius;

    }

    /**
     * Create a Circle by using the radius and the center coordinates.
     *
     * @param center
     * @param radius
     * @return
     */
    public static Circle of(Point center, int radius, Color c) {
        return new Circle(center, radius, c);

    }

    public static Circle of(Point center, int radius) {
        return new Circle(center, radius, Color.YELLOW);

    }

    @Override
    public Painter getPainter(Graphics2D g2, int width, int height) {

        return new CirclePainter(g2, this, width, height);
    }

    @Override
    public Shape move(int x, int y) {
        Point clonedCenter = (Point) this.center.move(x, y);

        return new Circle(clonedCenter, this.radius, this.getColor());
    }

    /**
     * Get the center.
     *
     * @return center
     */
    public Point getCenter() {
        return this.center;
    }

    /**
     * Get the radius-
     *
     * @return radius
     */
    public int getRadius() {
        return this.radius;
    }

}
