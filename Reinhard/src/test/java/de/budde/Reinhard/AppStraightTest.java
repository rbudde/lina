package de.budde.Reinhard;

import org.junit.Assert;
import org.junit.Test;

import de.budde.straightAndWrong.E;

public class AppStraightTest {
	@Test
    public void testApp()
    {
        E e = new E<>();
        int r1 = e.add1(4).decr1().incr1().getX();
//        int r1 = e.incr1().decr2().add(4).getX();
        int r2 = ((E) ((E) ((E) e.add2(4)).decr2()).incr2()).getX();
        Assert.assertEquals(4, r1);
        Assert.assertEquals(8, r2);
    }
}
