package de.felix.mathe;

import org.junit.Assert;
import org.junit.Test;

import de.felix.mathe.Mathe;

public class MatheTest {

    @Test
    public void testMax() {
        Assert.assertEquals(5, Mathe.max(5, 4));
        Assert.assertEquals(5
        	, Mathe.max(5, 5));
        Assert.assertEquals(5, Mathe.max(5, -3));
        Assert.assertEquals(6, Mathe.max(5, 6));
    }

    @Test
    public void testFac() {
        Assert.assertEquals(1, Mathe.fac(-1));
        Assert.assertEquals(1, Mathe.fac(0));
        Assert.assertEquals(1, Mathe.fac(1));
        Assert.assertEquals(24, Mathe.fac(4));
    }

}
