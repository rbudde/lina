package de.budde.generic1;

public class D<T> extends C<T> {
    public T decr() {
        x--;
        return (T) this;
    }
}
