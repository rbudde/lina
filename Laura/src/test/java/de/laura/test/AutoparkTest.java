package de.laura.test;

import org.junit.Test;

import de.laura.mains.Autopark;

public class AutoparkTest {

    @Test

    public void testAuto() {

        Autopark meineAutos = new Autopark(1111, 2222, 1000, 0, 100, 30);
        System.out.println("Durschnittlicher Verbrauch vom Autopark:" + meineAutos.berechneLPK());
        System.out.println();// LPK vom Hippiebus und Stadtauto einzeln ausgeben?

    }

}
