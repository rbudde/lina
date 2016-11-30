package de.laura.java2d.geo;

public class Punkt {
    private final int x;
    private final int y;

    private Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Punkt mk(int x, int y) {
        return new Punkt(x, y);
    }

    public Punkt translate(Punkt other) {
        return Punkt.mk(x + other.x, y + other.y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "Punkt [x=" + x + ", y=" + y + "]";
    }
}
