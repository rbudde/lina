package de.budde.laura.shape;

import org.junit.Assert;
import org.junit.Test;

public class LineTest {
    @Test
    public void testLine() {
        Point a = new Point(3, 3);
        Point b = new Point(4, 4);
        Line g1 = new Line(a, b);

        Assert.assertEquals(1.0, g1.getM(), 0.0001);
        Assert.assertEquals(0, g1.getN());
        Assert.assertEquals(5, g1.calculateY(5));

        Line g2 = new Line(1.0, 0);
        Assert.assertEquals(1.0, g1.getM(), 0.0001);
        Assert.assertEquals(0.0, g1.getN(), 0.0001);
        Assert.assertEquals(5, g2.calculateY(5));

    }

    @Test
    public void testLine2() {
        Point a = new Point(2, 3);
        Point b = new Point(4, 4);
        Line g1 = new Line(a, b);

        Assert.assertEquals(0.5, g1.getM(), 0.0001);
        Assert.assertEquals(2, g1.getN());
        Assert.assertEquals(5, g1.calculateY(6));

    }

    @Test
    public void testCalculateX() {
        Point a = new Point(2, 3);
        Point b = new Point(4, 4);
        Line g1 = new Line(a, b);
        System.out.println(g1);

        Assert.assertEquals(-4, g1.calculateX(0));
        Line g2 = new Line(10, 3);
        System.out.println(g2);
        Assert.assertEquals(-(3 / 10), g2.calculateX(0));

        Line d = new Line(0.5, 400);
        System.out.println(d);
        System.out.println(d.calculateX(600));

    }

}
