package de.budde.overwrite;

public class E extends D {
    public E add(int a) {
        x += a;
        return this;
    }

    @Override
    public E incr() {
        return (E) super.incr();
    }

    @Override
    public E decr() {
        return (E) super.decr();
    }
}
