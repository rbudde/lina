package de.budde.laura.shape;

import org.junit.Assert;
import org.junit.Test;

public class LineTest {
    @Test
    public void testLine() {
        Point a = Point.of(3, 3);
        Point b = Point.of(4, 4);
        Line g1 = Line.of(a, b);

        Assert.assertEquals(1.0, g1.getM(), 0.0001);
        Assert.assertEquals(0, g1.getN());
        Assert.assertEquals(5, g1.calculateY(5));

        Line g2 = Line.of(1.0, 0);
        Assert.assertEquals(1.0, g1.getM(), 0.0001);
        Assert.assertEquals(0.0, g1.getN(), 0.0001);
        Assert.assertEquals(5, g2.calculateY(5));

    }

    @Test
    public void testLine2() {
        Point a = Point.of(2, 3);
        Point b = Point.of(4, 4);
        Line g1 = Line.of(a, b);

        Assert.assertEquals(0.5, g1.getM(), 0.0001);
        Assert.assertEquals(2, g1.getN());
        Assert.assertEquals(5, g1.calculateY(6));
    }

    @Test
    public void testCalculateX() {
        Point a = Point.of(2, 3);
        Point b = Point.of(4, 4);
        Line g1 = Line.of(a, b);
        System.out.println(g1);

        Assert.assertEquals(-4, g1.calculateX(0));
        Line g2 = Line.of(10, 3);
        System.out.println(g2);
        Assert.assertEquals(-(3 / 10), g2.calculateX(0));

        Line d = Line.of(0.5, 400);
        System.out.println(d);
        System.out.println(d.calculateX(600));
    }

    @Test
    public void moveMethod() {
        Line g1 = Line.of(0, 2);
        System.out.println(g1);
        g1 = (Line) g1.move(3, 3);
        System.out.println(g1);

        Point a = Point.of(2, 3);
        Point b = Point.of(4, 4);
        Line k1 = Line.of(a, b);
        System.out.println(k1);
        k1 = (Line) k1.move(10, 10);
        System.out.println(k1);
    }

    @Test
    public void constructorTest() {
        int m;
        Point a = Point.of(2, 2);
        m = 0;
        Line l1 = Line.of(a, 0);
        Assert.assertEquals(2, l1.getN());
    }

    @Test
    public void testCloning() {
        Point p11 = Point.of(200, 0);
        Point p12 = Point.of(800, 600);
        Line i = Line.of(p11, p12);
        Line j1 = (Line) i.move(300, 200);
        Line j2 = (Line) i.move(40, 100);
        Assert.assertEquals(i.getM(), j1.getM(), 0.0001);
        Assert.assertEquals(i.getM(), j2.getM(), 0.0001);
        System.out.println("" + i + j1);
    }
}
