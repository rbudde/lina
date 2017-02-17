package de.budde.laura.shape;

import java.awt.Graphics2D;

import de.budde.laura.painter.CirclePainter;
import de.budde.laura.painter.Painter;

public class Circle extends Shape {
    private Point center;
    private int radius;

    private Circle(Point center, int radius) {
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
    public static Circle of(Point center, int radius) {
        return new Circle(center, radius);

    }

    @Override
    public Painter getPainter(Graphics2D g2, int width, int height) {

        return new CirclePainter(g2, this, width, height);
    }

    /**
     * Move the Circle by adding coordinates the center Point.
     * 
     * @param X and Y coordinates.
     */
    @Override
    public void move(int x, int y) {
        this.center.move(x, y);
    }

    /**
     * Clone the circle.
     * There'll be the old and the new Circle, which is moved by adding the
     * X and Y coordinates.
     */
    @Override
    public Shape clone(int x, int y) {
        Point clonedCenter = (Point) this.center.clone(x, y);

        return new Circle(clonedCenter, this.radius);
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
