package de.laura.mains;

class Auto {

    private double startKilometer;
    private double endeKilometer;
    private double literBenzin;
    private static int counter = 0;

    public Auto(double startTacho, double stopTacho, double liter) {
        startKilometer = startTacho;
        endeKilometer = stopTacho;
        literBenzin = liter;

    }

    public double berechneLPK() {
        return ((endeKilometer - startKilometer) / literBenzin);

    }

    public double berechneEntfernung() {
        return (endeKilometer - startKilometer);

    }
}