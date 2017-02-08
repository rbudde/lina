package de.laura.mains;

public class Gerade {
    // y=mx+n

    private double m;
    private int n;

    public Gerade(Punkt pk1, Punkt pk2) {

        m = (double) (pk1.gety() - pk2.gety()) / (double) (pk1.getx() - pk2.getx());
        n = (int) (pk1.gety() - (m * pk1.getx()));

    }

    public Gerade(double m, int n) {
        this.m = m;
        this.n = n;

    }

    public int berechneY(int x) {
        return (int) (m * x + n);
    }

    public double getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    @Override
    public String toString() {
        return "Gerade [m=" + m + ", n=" + n + "]";
    }

}
