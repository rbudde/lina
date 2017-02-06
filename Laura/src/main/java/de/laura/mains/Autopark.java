package de.laura.mains;

public class Autopark {

    private Auto hippieBus;
    private Auto stadtwagen;

    public Autopark(int start1, int end1, double liter1, int start2, int end2, double liter2) {
        hippieBus = new Auto(start1, end1, liter1);
        stadtwagen = new Auto(start2, end2, liter2);

    }

    public double berechneLPK() {
        double summeLPK;
        double einzelLPK;
        summeLPK = hippieBus.berechneLPK() + stadtwagen.berechneLPK();
        einzelLPK = hippieBus.berechneLPK(); //LPK von einzelnen Autos?
        return summeLPK / 2;

    }
}