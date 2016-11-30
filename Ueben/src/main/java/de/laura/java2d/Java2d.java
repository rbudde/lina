package de.laura.java2d;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.util.Random;

public class Java2d {
    private final Graphics2D g2;

    private Random random;

    public Java2d(Graphics2D g2) {
        this.g2 = g2;
    }

    public void maleText() {
        random = new Random();
        g2.setBackground(Color.YELLOW);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        g2.setStroke(stroke);

        g2.setFont(new Font("TimesRoman", Font.BOLD, 36));
        char[] text = "Hallo, Laura +++ Felix!".toCharArray();
        g2.drawChars(text, 0, text.length, 200, 300);
    }

    public void maleSchoenesBild() {
        random = new Random();
        g2.setBackground(Color.white);
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(1);
        g2.setStroke(stroke);

        int min = 10;
        int max = 700;
        int step = 4;

        for ( int i = min; i <= max; i = i + step ) {
            Point2D.Double p1 = new Point2D.Double(i, min);
            Point2D.Double p2 = new Point2D.Double(max - min, i);
            Point2D.Double p3 = new Point2D.Double(max - i, max);
            Point2D.Double p4 = new Point2D.Double(10, max - i);

            drawWithRandomColor(new Line2D.Double(p1, p2));
            drawWithRandomColor(new Line2D.Double(p2, p3));
            drawWithRandomColor(new Line2D.Double(p3, p4));
            drawWithRandomColor(new Line2D.Double(p4, p1));
        }
    }

    private void drawWithRandomColor(Line2D line) {
        switch ( random.nextInt(4) ) {
            case 0:
                g2.setColor(Color.RED);
                break;
            case 1:
                g2.setColor(Color.RED);
                break;
            case 2:
                g2.setColor(Color.RED);
                break;
            case 3:
                g2.setColor(Color.YELLOW);
                break;
            default:
                break;
        }
        g2.draw(line);
    }
}