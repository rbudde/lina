package de.budde.Reinhard;

import org.junit.Assert;
import org.junit.Test;

import de.budde.generic1.E;

public class AppGeneric1Test {
    @Test
    public void testApp() {
        E<E<E<E<?>>>> e = new E<>();
        int r1 = e.add(4).decr().incr().getX();
        int r2 = e.incr().decr().add(4).getX();
        Assert.assertEquals(4, r1);
        Assert.assertEquals(8, r2);
    }
}
