package de.budde.laura.shape;

import org.junit.Assert;
import org.junit.Test;

public class SegmentTest {

    @Test
    public void testSegments() {
        Point a = Point.of(2, 2);
        Point b = Point.of(2, 4);
        Segment se = Segment.of(a, b);
        Assert.assertEquals(a, se.getStart());
        Assert.assertEquals(b, se.getEnd());
    }

    @Test
    public void testDistance() {
        Point a = Point.of(2, 2);
        Point b = Point.of(2, 4);
        Segment st = Segment.of(a, b);

        Assert.assertEquals(2.0, st.getLength(), 0.000001);

        Point c = Point.of(0, 0);
        Point d = Point.of(0, 0);
        Segment se = Segment.of(c, d);
        Assert.assertEquals(0.0, se.getLength(), 0.000001);
    }

    @Test
    public void testMoveMethod() {
        Point a = Point.of(2, 2);
        Point b = Point.of(2, 4);
        Segment st = Segment.of(a, b);
        System.out.println(st);
        st = (Segment) st.move(2, 5);
        System.out.println(st);

    }

    @Test
    public void testCloning() {
        Segment s2;
        Point a = Point.of(2, 2);
        Point b = Point.of(2, 4);
        Segment s1 = Segment.of(a, b);
        System.out.println(s1);
        s2 = (Segment) s1.move(3, 3);
        System.out.println(s2);

    }
}
