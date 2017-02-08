package de.laura.test;

import org.junit.Assert;
import org.junit.Test;

import de.laura.mains.Gerade;
import de.laura.mains.Punkt;

public class GeradeTest {
    @Test

    public void testGerade() {

        Punkt a = new Punkt(3, 3);
        Punkt b = new Punkt(4, 4);
        Gerade g1 = new Gerade(a, b);

        Assert.assertEquals(1.0, g1.getM(), 0.0001);
        Assert.assertEquals(0, g1.getN());
        Assert.assertEquals(5, g1.berechneY(5));

        System.out.println(g1.toString());

    }

    @Test

    public void testGerade2() {

        Punkt a = new Punkt(2, 3);
        Punkt b = new Punkt(4, 4);
        Gerade g1 = new Gerade(a, b);
        System.out.println(g1.toString());

        Assert.assertEquals(0.5, g1.getM(), 0.0001);
        Assert.assertEquals(2, g1.getN());
        Assert.assertEquals(5, g1.berechneY(6));

        System.out.println(g1.toString());

    }

}
