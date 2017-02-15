package de.budde.laura.shape;

import org.junit.Assert;
import org.junit.Test;

public class SegmentTest {

    @Test
    public void testSegments() {
        Point a = Point.of(2, 2);
        Point b = Point.of(2, 4);
        Segment se = new Segment(a, b);
        Assert.assertEquals(a, se.getStart());
        Assert.assertEquals(b, se.getEnd());
    }

    @Test
    public void testDistance() {
        Point a = Point.of(2, 2);
        Point b = Point.of(2, 4);
        Segment st = new Segment(a, b);

        Assert.assertEquals(2.0, st.getLength(), 0.000001);

        Point c = Point.of(0, 0);
        Point d = Point.of(0, 0);
        Segment se = new Segment(c, d);
        Assert.assertEquals(0.0, se.getLength(), 0.000001);
    }

    @Test
    public void testMoveMethod() {
        Point a = Point.of(2, 2);
        Point b = Point.of(2, 4);
        Segment st = new Segment(a, b);
        System.out.println(st);
        st.move(2, 5);
        System.out.println(st);

    }

}
