package de.laura.test;

import org.junit.Assert;
import org.junit.Test;

import de.laura.mains.Punkt;

public class PunktTest {

    @Test

    public void testPunkt() {

        Punkt a = new Punkt(1, 2);

        Assert.assertEquals(1, a.getx());
        Assert.assertEquals(2, a.gety());
        a.move(1, 1);
        Assert.assertEquals(2, a.getx());
        Assert.assertEquals(3, a.gety());
        a.move(new Punkt(2, 2));

        Assert.assertEquals(4, a.getx());
        Assert.assertEquals(5, a.gety());

        a.ausgeben();

    }

    @Test

    public void testAbstand() {

        Punkt a = new Punkt(2, 2);
        Punkt b = new Punkt(2, 4);

        Assert.assertEquals(2.0, Punkt.abstand(a, b), 0.000001);

    }

}
