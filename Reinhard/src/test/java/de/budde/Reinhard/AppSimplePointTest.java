package de.budde.Reinhard;

import org.junit.Test;

import de.budde.point.ColoredPoint;
import de.budde.point.NamedPoint;
import de.budde.point.Point;

public class AppSimplePointTest {
    @Test
    public void testApp() {
        Point<?> d = new Point<>(4, 4);

        Point<?> p = new Point<>(4, 5);
        ColoredPoint<?> cp = new ColoredPoint<>(5, 6, 111);
        NamedPoint<?> np = new NamedPoint<>(5, 7, 222, "5;7");

        Point<?> s;
        s = p.shift(d);
        s = p.shift(cp);
        s = p.shift(np);

        s = cp.shift(d);
        s = cp.shift(cp);
        s = cp.shift(np);

        s = np.shift(d);
        s = np.shift(cp);
        s = np.shift(np);

        System.out.println(s);
    }
}
