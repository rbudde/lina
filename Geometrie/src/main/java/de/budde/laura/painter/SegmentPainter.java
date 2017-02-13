package de.budde.laura.painter;

import java.awt.Graphics2D;

import de.budde.laura.shape.Point;
import de.budde.laura.shape.Segment;

public class SegmentPainter extends Painter {

    private Segment s1;

    public SegmentPainter(Graphics2D g2, Segment s1, int width, int height) {
        super(g2, width, height);

        this.s1 = s1;

    }

    @Override
    public void paint() {

        g2.setColor(s1.getColor());
        Point start = s1.getStart();
        Point end = s1.getEnd();
        if ( isValid(start) && isValid(end) ) {
            g2.drawLine(start.getX(), height - start.getY(), end.getX(), height - end.getY());

        } else {
            System.out.println("Segment ungültig:" + s1);

        }
    }

}
