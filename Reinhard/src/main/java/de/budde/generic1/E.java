package de.budde.generic1;

public class E<T> extends D<T> {
    public T add(int a) {
        x += a;
        return (T) this;
    }
}
