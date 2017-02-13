package de.budde.laura.painter;

import java.awt.Graphics2D;

import de.budde.laura.shape.Line;

public class LinePainter extends Painter {

    private Line l1;

    public LinePainter(Graphics2D g2, Line l1, int width, int height) {
        super(g2, width, height);

        this.l1 = l1;

    }

    @Override
    public void paint() {

        g2.setColor(l1.getColor());
        if ( l1.getM() == 0 && l1.getN() <= height && l1.getN() >= 0 ) {
            g2.drawLine(0, height - l1.calculateY(0), width, height - l1.calculateY(width));

        } else {
            if ( l1.calculateY(0) <= height && l1.calculateY(0) >= 0 ) {
                if ( l1.calculateY(width) >= height ) {

                    g2.drawLine(0, height - l1.calculateY(0), l1.calculateX(height), height - height);
                } else {
                    if ( l1.calculateY(width) <= 0 ) {
                        g2.drawLine(0, height - l1.calculateY(0), l1.calculateX(0), height - 0);
                    } else {
                        g2.drawLine(0, height - l1.calculateY(0), width, height - l1.calculateY(width));
                    }

                }
            } else {
                if ( l1.calculateY(0) >= height ) {
                    if ( l1.calculateY(width) <= 0 ) {
                        g2.drawLine(l1.calculateX(height), height - height, l1.calculateX(0), height - 0);
                    } else {
                        g2.drawLine(l1.calculateX(height), height - height, width, height - l1.calculateY(width));
                    }

                } else {
                    if ( l1.calculateY(0) <= height ) {
                        if ( l1.calculateY(width) >= height ) {
                            g2.drawLine(l1.calculateX(0), height - 0, l1.calculateY(height), height - height);
                        } else {
                            g2.drawLine(l1.calculateX(0), height - 0, width, height - l1.calculateY(width));

                        }
                    }
                }
            }
        }

    }

}
