package de.budde.laura.painter;

import java.awt.Graphics2D;

import de.budde.laura.shape.Point;

public class PointPainter extends Painter {

    private Point p1;

    public PointPainter(Graphics2D g2, Point p1, int width, int height) {
        super(g2, width, height);

        this.p1 = p1;

    }

    @Override
    public void paint() {

        g2.setColor(p1.getColor());
        if ( isValid(p1) ) {

            g2.drawLine(p1.getX(), height - p1.getY(), p1.getX(), height - p1.getY());

        } else {
            System.out.println("Punkt ungültig:" + p1);

        }

    }

}
