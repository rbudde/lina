package de.budde.overwrite;

public class D extends C {
    public D decr() {
        x--;
        return this;
    }

    @Override
    public D incr() {
        return (D) super.incr();
    }
}
