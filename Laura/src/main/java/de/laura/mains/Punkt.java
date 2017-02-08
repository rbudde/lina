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

    public Punkt(double a, double b) {
        x = x;
        y = y;
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

    public static double abstand(Punkt p1, Punkt p2) {

        int x = p1.getx() - p2.getx();
        int y = p1.gety() - p2.gety();
        double abstand = Math.sqrt(x * x + y * y);

        return abstand;

    }

    @Override
    public String toString() {
        return "Punkt [x=" + x + ", y=" + y + "]";
    }

}
