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

        this.g2.setColor(this.l1.getColor());
        if ( this.l1.getM() == 0 && this.l1.getN() <= this.height && this.l1.getN() >= 0 ) {
            this.g2.drawLine(0, this.height - this.l1.calculateY(0), this.width, this.height - this.l1.calculateY(this.width));

        } else {
            if ( this.l1.calculateY(0) <= this.height && this.l1.calculateY(0) >= 0 ) {
                if ( this.l1.calculateY(this.width) >= this.height ) {

                    this.g2.drawLine(0, this.height - this.l1.calculateY(0), this.l1.calculateX(this.height), this.height - this.height);
                } else {
                    if ( this.l1.calculateY(this.width) <= 0 ) {
                        this.g2.drawLine(0, this.height - this.l1.calculateY(0), this.l1.calculateX(0), this.height - 0);
                    } else {
                        this.g2.drawLine(0, this.height - this.l1.calculateY(0), this.width, this.height - this.l1.calculateY(this.width));
                    }

                }
            } else {
                if ( this.l1.calculateY(0) >= this.height ) {
                    if ( this.l1.calculateY(this.width) <= 0 ) {
                        this.g2.drawLine(this.l1.calculateX(this.height), this.height - this.height, this.l1.calculateX(0), this.height - 0);
                    } else {
                        this.g2.drawLine(this.l1.calculateX(this.height), this.height - this.height, this.width, this.height - this.l1.calculateY(this.width));
                    }

                } else {
                    if ( this.l1.calculateY(0) <= this.height ) {
                        if ( this.l1.calculateY(this.width) >= this.height ) {
                            this.g2.drawLine(this.l1.calculateX(0), this.height - 0, this.l1.calculateX(this.height), this.height - this.height);
                        } else {
                            this.g2.drawLine(this.l1.calculateX(0), this.height - 0, this.width, this.height - this.l1.calculateY(this.width));

                        }
                    }
                }
            }
        }

    }

}
