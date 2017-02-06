package de.laura.test;

import org.junit.Test;

import de.laura.mains.Bankkonto;

public class BankkontoTest {
    @Test
    public void testKonto() {

        Bankkonto konto1 = new Bankkonto("11", "Inte", 1000000);
        System.out.println(konto1.getKontonummer() + " " + konto1.getKontoinhaber() + " " + konto1.getKontostand());

        Bankkonto konto2 = new Bankkonto("11dcg", "Reinhard", 10);
        boolean erfolgreich = konto2.auszahlung(5);
        System.out.println("erfolgreich?:" + erfolgreich);
        int stand = konto2.getKontostand();
        System.out.println(stand);

    }

}
