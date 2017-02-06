package de.budde.point;

public class NamedPoint<T extends NamedPoint<T>> extends ColoredPoint<T> {
    private String name;

    public NamedPoint(int x, int y, int color, String name) {
        super(x, y, color);
        this.name = name;
    }

    @Override
    public T shift(Point p) {
        return (T) new NamedPoint(this.getX() + p.getX(), this.getY() + p.getY(), this.getColor(), this.getName());
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "NamedPoint [x=" + this.getX() + ", y=" + this.getY() + ", color=" + this.getColor() + ", name=" + this.name + "]";
    }

}
