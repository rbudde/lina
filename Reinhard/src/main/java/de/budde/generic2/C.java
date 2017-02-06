package de.budde.generic2;

public class C<T extends C<T>> {
    protected int x = 0;

    public int getX() {
        return x;
    }

    public T incr() {
        x++;
        return (T) this;
    }
}
