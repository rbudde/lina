package de.budde.simplepoint;

public class ColoredPoint extends Point {
    private int color;

    public ColoredPoint(int x, int y, int color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public ColoredPoint shift(Point p) {
        // das hier ist notwendig
        int shiftedColor;
        if ( p instanceof ColoredPoint ) {
            ColoredPoint cp = (ColoredPoint) p;
            shiftedColor = cp.getColor();
        } else {
            shiftedColor = this.getColor();
        }
        return new ColoredPoint(this.getX() + p.getX(), this.getY() + p.getY(), shiftedColor);
    }

    public int getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "ColoredPoint [x=" + this.getX() + ", y=" + this.getY() + ", color=" + this.color + "]";
    }
}
