package de.budde.point;

public class Point<T extends Point<T>> {
    private int x = 0;
    private int y = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public T shift(Point p) {
        return (T) new Point(this.getX() + p.getX(), this.getY() + p.getY());
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    @Override
    public String toString() {
        return "Point [x=" + this.x + ", y=" + this.y + "]";
    }
}
