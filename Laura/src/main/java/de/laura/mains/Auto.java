package de.laura.mains;

class Auto {

    private double startKilometer;
    private double endeKilometer;
    private double literBenzin;
    private static int counter = 0;

    public Auto(double startTacho, double stopTacho, double liter) {
        this.startKilometer = startTacho;

        this.endeKilometer = stopTacho;

        this.literBenzin = liter;

    }

    public double berechneLPK() {
        return ((this.endeKilometer - this.startKilometer) / this.literBenzin);

    }

    public double berechneEntfernung() {
        return (this.endeKilometer - this.startKilometer);

    }
}