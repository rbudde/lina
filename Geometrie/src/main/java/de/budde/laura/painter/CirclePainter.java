package de.budde.laura.painter;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import de.budde.laura.shape.Circle;
import de.budde.laura.shape.Point;

public class CirclePainter extends Painter {
    private Circle c1;

    public CirclePainter(Graphics2D g2, Circle circle, int width, int height) {
        super(g2, width, height);
        this.c1 = circle;
    }

    /**
     * Paint a Circle!
     */
    @Override
    public void paint() {
        float x, y, w, h;
        Point center = this.c1.getCenter();
        int radius = this.c1.getRadius();
        w = 2 * radius;
        h = 2 * radius;

        int ax = center.getX() - radius;
        int ay = this.height - center.getY() - radius;
        this.g2.setColor(this.c1.getColor());
        Shape circle = new Ellipse2D.Float(ax, ay, w, h);
        this.g2.draw(circle);

    }

}
