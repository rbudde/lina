package de.budde.laura.shape;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    private static final double EPS = 0.000001;

    @Test

    public void testPoint() {
        Point a = Point.of(1, 2);

        Assert.assertEquals(1, a.getX());
        Assert.assertEquals(2, a.getY());
        a.move(1, 1);

        Assert.assertEquals(2, a.getX());
        Assert.assertEquals(3, a.getY());
        a.shift(Point.of(2, 2));

        Assert.assertEquals(4, a.getX());
        Assert.assertEquals(5, a.getY());
    }

    @Test
    public void testDistance() {
        Point a = Point.of(2, 2);
        Point b = Point.of(2, 4);

        Assert.assertEquals(2.0, Point.distance(a, b), EPS);
        Assert.assertEquals(2.0, Point.distance(b, a), EPS);
        Assert.assertEquals(0.0, Point.distance(a, a), EPS);
    }

    @Test
    public void testOrigin() {
        Point o = Point.getOrigin();
        Assert.assertEquals(0, o.getX());
        Assert.assertEquals(0, o.getY());
        Assert.assertEquals(0.0, Point.distance(o, o), EPS);
        o.move(1, 1);
        o.print();

    }

}
