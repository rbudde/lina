package de.budde.laura.shape;

import java.awt.Color;
import java.awt.Graphics2D;

import de.budde.laura.painter.Painter;

public abstract class Shape {
    private static int counter = 0;
    private Color c = Color.BLACK;
    private int identity;

    protected Shape() {
        identity = counter++;

    }

    public abstract Painter getPainter(Graphics2D g2, int width, int height);

    public int getIdentity() {
        return identity;
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public Color getColor() {
        return c;
    }

    public abstract void move(int x, int y);

    /**
     * Shift this Point by adding the coordinates
     * of another Point.
     *
     * @param p The Point to be added.
     */
    public void move(Point p) {
        move(p.getX(), p.getY());
    }

}
