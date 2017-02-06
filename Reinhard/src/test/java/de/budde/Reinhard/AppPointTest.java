package de.budde.Reinhard;

import org.junit.Test;

import de.budde.simplepoint.ColoredPoint;
import de.budde.simplepoint.NamedPoint;
import de.budde.simplepoint.Point;

public class AppPointTest {
    @Test
    public void testApp() {
        Point d = new Point(4, 4);

        Point p = new Point(4, 5);
        ColoredPoint cp = new ColoredPoint(5, 6, 111);
        NamedPoint np = new NamedPoint(5, 7, 222, "5;7");

        Point s;
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
