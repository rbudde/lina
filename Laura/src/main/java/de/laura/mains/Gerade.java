package de.laura.mains;

public class Gerade {
    // y=mx+n

    private double m;
    private int n;

    public Gerade(Punkt pk1, Punkt pk2) {

        this.m = (double) (pk1.gety() - pk2.gety()) / (double) (pk1.getx() - pk2.getx());

        this.n = (int) (pk1.gety() - (this.m * pk1.getx()));

    }

    public Gerade(double m, int n) {
        this.m = m;
        this.n = n;

    }

    public int berechneY(int x) {
        return (int) (this.m * x + this.n);
    }

    public double getM() {
        return this.m;
    }

    public int getN() {
        return this.n;
    }

    @Override
    public String toString() {
        return "Gerade [m=" + this.m + ", n=" + this.n + "]";
    }

}
