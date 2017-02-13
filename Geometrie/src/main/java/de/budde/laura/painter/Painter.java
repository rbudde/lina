package de.budde.laura.painter;

import java.awt.Graphics2D;

import de.budde.laura.shape.Point;

public abstract class Painter {
    protected Graphics2D g2;

    protected int height;
    protected int width;

    public Painter(Graphics2D g2, int width, int height) {
        this.g2 = g2;
        this.height = height;
        this.width = width;
    }

    public abstract void paint();

    public boolean isValid(Point pk) {
        return pk.getX() <= width && pk.getY() <= height && pk.getX() >= 0 && pk.getY() >= 0;
    }

}
