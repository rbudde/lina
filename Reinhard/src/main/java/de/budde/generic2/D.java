package de.budde.generic2;

public class D<T extends D<T>> extends C<T> {
    public T decr() {
        x--;
        return (T) this;
    }
}
