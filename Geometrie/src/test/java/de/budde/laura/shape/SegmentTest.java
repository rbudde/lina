package de.budde.laura.shape;

import org.junit.Assert;
import org.junit.Test;

public class SegmentTest {

    @Test
    public void testSegments() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 4);
        Segment se = new Segment(a, b);
        Assert.assertEquals(a, se.getStart());
        Assert.assertEquals(b, se.getEnd());
    }

    @Test
    public void testDistance() {
        Point a = new Point(2, 2);
        Point b = new Point(2, 4);
        Segment st = new Segment(a, b);

        Assert.assertEquals(2.0, st.getLength(), 0.000001);

        Point c = new Point(0, 0);
        Point d = new Point(0, 0);
        Segment se = new Segment(c, d);
        Assert.assertEquals(0.0, se.getLength(), 0.000001);
    }

}
