package de.laura.java2d.shape;

import java.awt.Graphics2D;

import de.laura.java2d.geo.Punkt;

public class GStrecke implements IShape<GStrecke> {
    private final Punkt a;
    private final Punkt e;

    private GStrecke(Punkt a, Punkt e) {
        this.a = a;
        this.e = e;
    }

    public static GStrecke mk(Punkt a, Punkt e) {
        return new GStrecke(a, e);
    }

    public static GStrecke mk(int x1, int y1, int x2, int y2) {
        return new GStrecke(Punkt.mk(x1, y1), Punkt.mk(x2, y2));
    }

    public static GStrecke mk(GPunkt p1, GPunkt p2) {
        return GStrecke.mk(p1.getPunkt(), p2.getPunkt());
    }

    @Override
    public GStrecke translate(Punkt p) {
        return GStrecke.mk(a.translate(p), e.translate(p));
    }

    public Punkt getAnfang() {
        return a;
    }

    public Punkt getEnde() {
        return e;
    }

    @Override
    public void paint(Graphics2D g2) {
        g2.drawLine(a.getX(), a.getY(), e.getX(), e.getY());
    }

    @Override
    public String toString() {
        return "Strecke [" + a + " - " + e + "]";
    }
}
