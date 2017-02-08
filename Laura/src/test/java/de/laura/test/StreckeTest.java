package de.laura.test;

import org.junit.Assert;
import org.junit.Test;

import de.laura.mains.Punkt;
import de.laura.mains.Strecke;

public class StreckeTest {

    @Test

    public void testAbstand() {

        Punkt a = new Punkt(2, 2);
        Punkt b = new Punkt(2, 4);
        Strecke st = new Strecke(a, b);

        Assert.assertEquals(2.0, st.getLaenge(), 0.000001);

    }

}
