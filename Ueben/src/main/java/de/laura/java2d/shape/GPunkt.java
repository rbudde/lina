package de.laura.java2d.shape;

import java.awt.Graphics2D;

import de.laura.java2d.geo.Punkt;

public class GPunkt implements IShape<GPunkt> {
    private final Punkt p;

    private GPunkt(Punkt p) {
        this.p = p;
    }

    public static GPunkt mk(int x, int y) {
        return new GPunkt(Punkt.mk(x, y));
    }

    public static GPunkt mk(Punkt p) {
        return new GPunkt(p);
    }

    @Override
    public GPunkt translate(Punkt other) {
        return GPunkt.mk(p.translate(other));
    }

    public Punkt getPunkt() {
        return p;
    }

    @Override
    public String toString() {
        return "GPunkt [x=" + p.getX() + ",y=" + p.getY() + "]";
    }

    @Override
    public void paint(Graphics2D g2) {
        g2.drawLine(p.getX(), p.getY(), p.getX(), p.getY());
    }

}
