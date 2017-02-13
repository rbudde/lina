package de.budde.laura.shape;

import java.awt.Color;

public class Shape {
    private static int counter = 0;
    private Color c = Color.BLACK;
    private int identity;

    protected Shape() {
        identity = counter++;

    }

    public int getIdentity() {
        return identity;
    }

    public void setColor(Color c) {
        this.c = c;
    }

    public Color getColor() {
        return c;
    }

}
