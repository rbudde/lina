package de.budde.laura.shape;

import java.awt.Color;
import java.awt.Graphics2D;

import de.budde.laura.painter.Painter;

public abstract class Shape {
    private static int counter = 0;
    private final Color c;
    private final int identity;

    protected Shape(Color c) {
        this.identity = counter++;
        this.c = c;

    }

    public abstract Painter getPainter(Graphics2D g2, int width, int height);

    public int getIdentity() {
        return this.identity;
    }

    public Color getColor() {
        return this.c;
    }

    /**
     * Moves the object by X and Y.
     * A new Shape object is created.
     *
     * @param x
     * @param y
     * @return a shifted new Shape object
     */
    public abstract Shape move(int x, int y);

    /**
     * Moves the object by adding the coordinates of Point p.
     * A new Shape object is created.
     *
     * @param p
     * @return The new moved Point
     */
    public Shape move(Point p) {
        return this.move(p.getX(), p.getY());
    }

}
