package de.budde.laura.shape;

import java.awt.Color;

public class Shape {
    private static Color c = Color.BLACK;

    Shape() {

    }

    public void setColor(Color c) {
        Shape.c = c;
    }

    public Color getColor() {
        return c;
    }

}
