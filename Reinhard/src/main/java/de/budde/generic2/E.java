package de.budde.generic2;

public class E<T extends E<T>> extends D<T> {
    public T add(int a) {
        x += a;
        return (T) this;
    }
}
