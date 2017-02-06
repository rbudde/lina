package de.laura.mains;

public class Punkt {

    private int x;
    private int y;

    public Punkt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punkt() {
        x = 0;
        y = 0;
    }

    public int getx() {
        return x;
    }

    public int gety() {
        return y;
    }

    public void move(int x, int y) {
        this.x = this.x + x;
        this.y = this.y + y;

    }

    public void move(Punkt p) {
        move(p.getx(), p.gety());
    }

    public void ausgeben() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Punkt [x=" + x + ", y=" + y + "]";
    }

}
