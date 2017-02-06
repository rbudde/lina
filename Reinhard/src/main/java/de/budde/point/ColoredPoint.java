package de.budde.point;

public class ColoredPoint<T extends ColoredPoint<T>> extends Point<T> {
    private int color;

    public ColoredPoint(int x, int y, int color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public T shift(Point p) {
        return (T) new ColoredPoint<>(this.getX() + p.getX(), this.getY() + p.getY(), this.getColor());
    }

    public int getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "ColoredPoint [x=" + this.getX() + ", y=" + this.getY() + ", color=" + this.color + "]";
    }
}
