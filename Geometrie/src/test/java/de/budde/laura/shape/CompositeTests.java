package de.budde.laura.shape;

import org.junit.Test;

public class CompositeTests {
    @Test
    public void test1() {
        Point a = Point.of(1, 1);
        Point b = Point.of(2, 2);
        Segment s1 = Segment.of(a, b);
        Line l1 = Line.of(a, b);
        Circle c1 = Circle.of(a, 10);

        Composite c = new Composite();
        c.addShape(a);
        c.addShape(b);
        c.addShape(l1);
        c.addShape(c1);
        System.out.println(c);
        c = (Composite) c.move(2, 3);
        System.out.println(c);
    }
}
