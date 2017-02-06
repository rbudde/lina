package de.laura.test;

import org.junit.Test;

import de.laura.mains.AutofahrtKlasse;

public class AutoTest {
    @Test
    public void testLiter() {
        AutofahrtKlasse fahrt1 = new AutofahrtKlasse(100, 500, 300);
        System.out.println("Liter pro Kilometer:" + fahrt1.berechneLPK());
    }

    @Test
    public void testStrecke() {
        AutofahrtKlasse fahrt1 = new AutofahrtKlasse(100, 500, 300);
        System.out.println("Strecke:" + fahrt1.berechneEntfernung());
    }
}