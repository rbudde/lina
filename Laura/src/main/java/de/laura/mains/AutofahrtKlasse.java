package de.laura.mains;

public class AutofahrtKlasse {
	// Instanzvariablen
	private double startKilometer;
	private double endeKilometer;
	private double literBenzin;

	// Konstruktoren
	public AutofahrtKlasse(double startTacho, double stopTacho, double liter) {
		startKilometer = startTacho;
		endeKilometer = stopTacho;
		literBenzin = liter;

	}

	// Methoden
	public double berechneLPK() {
		return ((endeKilometer - startKilometer) / literBenzin);

	}

	public double berechneEntfernung() {
		return (endeKilometer - startKilometer);
	}

}
