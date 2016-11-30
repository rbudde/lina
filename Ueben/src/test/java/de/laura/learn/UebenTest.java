package de.laura.learn;

import org.junit.Test;

import de.laura.java2d.geo.Punkt;

public class UebenTest {

    @Test
    public void testPrimitiv() {
        int i = 4 + 6;
        i = i + 1;
        i += 1;
        if ( i > 0 ) {
            i = -5;
            i = i * 1;
            System.out.println("i ist größer als 0: " + i);
        } else {
            System.out.println("i ist nicht größer als 0");
        }
        int j = 4 + i;
        long k = j;
        System.out.println("k ist : " + k);
    }

    @Test
    public void testString() {
        String laura = "Laura Budde";
        String laura2 = laura;
        laura = laura + " - " + laura;
        System.out.println(laura);
        System.out.println(laura2.endsWith("udde"));
        laura.charAt(3);
    }

    @Test
    public void testPunkt() {
        Punkt p1 = Punkt.mk(3, 4);
        System.out.println(p1);
        Punkt p2 = Punkt.mk(13, 4);
        System.out.println(p2);
        Punkt p3 = p1.translate(Punkt.mk(1, 1));
        System.out.println(p3);
    }
}
