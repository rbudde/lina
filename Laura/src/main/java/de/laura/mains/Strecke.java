package de.laura.mains;

public class Strecke {

    private Punkt start;
    private Punkt end;

    public Strecke(Punkt p1, Punkt p2) {
        start = p1;
        end = p2;

    }

    public Punkt getStart() {
        return start;
    }

    public Punkt getEnd() {
        return end;
    }

    public double getLaenge() {
        return Punkt.abstand(start, end);
    }

    @Override
    public String toString() {
        return "Strecke [start=" + start + ", end=" + end + "]";
    }

}
