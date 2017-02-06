package de.budde.overwrite;

public class C {
    protected int x = 0;

    public int getX() {
        return x;
    }

    public C incr() {
        x++;
        return this;
    }
}
