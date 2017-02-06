package de.budde.Reinhard;

import org.junit.Assert;
import org.junit.Test;

import de.budde.generic2.D;
import de.budde.generic2.E;

public class AppGeneric2Test {
    @Test
    public void testE() {
        E<?> e = new E<>();
        int r1 = e.add(4).decr().incr().getX();
        int r2 = e.incr().decr().add(4).getX();
        Assert.assertEquals(4, r1);
        Assert.assertEquals(8, r2);
    }

    @Test
    public void testD() {
        D<?> d = new D<>();
        int r1 = d.decr().incr().incr().getX();
        int r2 = d.incr().decr().incr().getX();
        Assert.assertEquals(1, r1);
        Assert.assertEquals(2, r2);
    }
}
