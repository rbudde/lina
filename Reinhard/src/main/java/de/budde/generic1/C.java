package de.budde.generic1;

public class C<T> {
    protected int x = 0;

    public int getX() {
        return x;
    }

    public T incr() {
        x++;
        return (T) this;
    }
}
