package de.budde.simplepoint;

public class NamedPoint extends ColoredPoint {
    private String name;

    public NamedPoint(int x, int y, int color, String name) {
        super(x, y, color);
        this.name = name;
    }

    @Override
    public NamedPoint shift(Point p) {
        // Mindestens diese Code-Kopie möchte man nicht
        int shiftedColor;
        if ( p instanceof ColoredPoint ) {
            ColoredPoint cp = (ColoredPoint) p;
            shiftedColor = cp.getColor();
        } else {
            shiftedColor = this.getColor();
        }
        // das hier ist notwendig
        String shiftedName;
        if ( p instanceof NamedPoint ) {
            NamedPoint np = (NamedPoint) p;
            shiftedName = np.getName();
        } else {
            shiftedName = this.getName();
        }
        return new NamedPoint(this.getX() + p.getX(), this.getY() + p.getY(), shiftedColor, shiftedName);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "NamedPoint [x=" + this.getX() + ", y=" + this.getY() + ", color=" + this.getColor() + ", name=" + this.name + "]";
    }

}
