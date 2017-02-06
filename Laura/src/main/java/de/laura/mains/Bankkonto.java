package de.laura.mains;

public class Bankkonto {

    private String kontonummer;
    private String kontoinhaber;
    private int kontostand;

    public String getKontonummer() {
        return kontonummer;
    }

    public String getKontoinhaber() {
        return kontoinhaber;
    }

    public int getKontostand() {
        return kontostand;
    }

    public Bankkonto(String ktonr, String ktoinh, int ktost) {
        kontonummer = ktonr;
        kontoinhaber = ktoinh;
        kontostand = ktost;

    }

    public void einzahlung(int betrag) {
        kontostand = kontostand + betrag;
    }

    /**
     * Auszahlung vornehmen, wenn Konto gedeckt
     *
     * @param betrag was man Auszahlen möchte
     * @return true wenn Auszahlung erfolgreich sonst false
     */
    public boolean auszahlung(int betrag) {

        int kontostandNeu = kontostand - betrag;

        if ( kontostandNeu < 0 ) {
            return false;
        } else {
            kontostand = kontostandNeu;
            return true;
        }
    }

}
