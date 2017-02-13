package de.budde.laura.main;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics2D;
import java.util.HashSet;
import java.util.Set;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import de.budde.laura.shape.Line;
import de.budde.laura.shape.Point;
import de.budde.laura.shape.Segment;

public class Java2d {
    Graphics2D g2;

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 700;

    public Java2d() {
        final JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT);

        final JPanel panel = new JPanel();
        panel.setSize(WIDTH, HEIGHT - 100);

        JButton button = new JButton("paint");
        button.setEnabled(true);
        button.addActionListener(e -> this.paint(panel));

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(panel);
        contentPane.add(button);

        frame.setVisible(true);
    }

    private void paint(JPanel panel) {
        g2 = (Graphics2D) panel.getGraphics();
        g2.clearRect(0, 0, panel.getWidth(), panel.getHeight());
        BasicStroke stroke = new BasicStroke(4);
        g2.setStroke(stroke);
        this.paintImpl();
    }

    private void paintImpl() {
        Line c = new Line(0.0, 400);
        c.setColor(Color.BLUE);
        paint(c);
        Point p1 = Point.of(0, 400);
        Point p2 = Point.of(800, HEIGHT);
        Line d = new Line(p1, p2);
        d.setColor(Color.ORANGE);
        paint(d);
        Point p3 = Point.of(0, 400);
        Point p4 = Point.of(800, 0);
        Line e = new Line(p3, p4);
        e.setColor(Color.RED);
        paint(e);
        Point p5 = Point.of(0, 400);
        Point p6 = Point.of(WIDTH, 600);
        Line f = new Line(p5, p6);
        f.setColor(Color.GREEN);
        paint(f);
        Point p7 = Point.of(200, HEIGHT);
        Point p8 = Point.of(800, 0);
        Line g = new Line(p7, p8);
        g.setColor(Color.YELLOW);
        paint(g);
        Point p9 = Point.of(200, HEIGHT);
        Point p10 = Point.of(WIDTH, 400);
        Line h = new Line(p9, p10);
        h.setColor(Color.PINK);
        paint(h);
        Point p11 = Point.of(200, 0);
        Point p12 = Point.of(800, HEIGHT);
        Line i = new Line(p11, p12);
        i.setColor(Color.MAGENTA);
        paint(i);
        Point p13 = Point.of(200, 0);
        Point p14 = Point.of(WIDTH, 400);
        Line j = new Line(p13, p14);
        j.setColor(Color.GRAY);
        paint(j);

        Point p15 = Point.of(200, 350);
        p15.setColor(Color.BLUE);
        paint(p15);

        Point p16 = Point.of(500, 300);
        Point p17 = Point.of(250, 350);
        Segment se1 = new Segment(p16, p17);
        se1.setColor(Color.GREEN);
        paint(se1);

        Point a = Point.of(200, 200);
        a.setColor(Color.black);
        Point b = Point.of(200, 100);
        b.setColor(Color.red);
        Point c1 = Point.of(300, 130);
        c.setColor(Color.green);
        Point d1 = Point.of(300, 150);
        d.setColor(Color.red);
        Point e1 = Point.of(21, 0);
        e.setColor(Color.yellow);

        Set<Point> seP = new HashSet<>();
        seP.add(a);
        seP.add(b);
        seP.add(c1);
        seP.add(d1);
        seP.add(e1);

        seP.stream().filter(x -> x.getColor().equals(Color.green)).forEach(x -> paint(x));

    }

    private void paint(Line l1) {
        g2.setColor(l1.getColor());
        if ( l1.getM() == 0 && l1.getN() <= HEIGHT && l1.getN() >= 0 ) {
            g2.drawLine(0, HEIGHT - l1.calculateY(0), WIDTH, HEIGHT - l1.calculateY(WIDTH));

        } else {
            if ( l1.calculateY(0) <= HEIGHT && l1.calculateY(0) >= 0 ) {
                if ( l1.calculateY(WIDTH) >= HEIGHT ) {

                    g2.drawLine(0, HEIGHT - l1.calculateY(0), l1.calculateX(HEIGHT), HEIGHT - HEIGHT);
                } else {
                    if ( l1.calculateY(WIDTH) <= 0 ) {
                        g2.drawLine(0, HEIGHT - l1.calculateY(0), l1.calculateX(0), HEIGHT - 0);
                    } else {
                        g2.drawLine(0, HEIGHT - l1.calculateY(0), WIDTH, HEIGHT - l1.calculateY(WIDTH));
                    }

                }
            } else {
                if ( l1.calculateY(0) >= HEIGHT ) {
                    if ( l1.calculateY(WIDTH) <= 0 ) {
                        g2.drawLine(l1.calculateX(HEIGHT), HEIGHT - HEIGHT, l1.calculateX(0), HEIGHT - 0);
                    } else {
                        g2.drawLine(l1.calculateX(HEIGHT), HEIGHT - HEIGHT, WIDTH, HEIGHT - l1.calculateY(WIDTH));
                    }

                } else {
                    if ( l1.calculateY(0) <= HEIGHT ) {
                        if ( l1.calculateY(WIDTH) >= HEIGHT ) {
                            g2.drawLine(l1.calculateX(0), HEIGHT - 0, l1.calculateY(HEIGHT), HEIGHT - HEIGHT);
                        } else {
                            g2.drawLine(l1.calculateX(0), HEIGHT - 0, WIDTH, HEIGHT - l1.calculateY(WIDTH));

                        }
                    }
                }
            }
        }

    }

    private void paint(Point p1) {
        g2.setColor(p1.getColor());
        if ( isValid2DPoint(p1) ) {

            g2.drawLine(p1.getX(), HEIGHT - p1.getY(), p1.getX(), HEIGHT - p1.getY());

        } else {
            System.out.println("Punkt ungültig:" + p1);
        }
    }

    private void paint(Segment st) {
        g2.setColor(st.getColor());
        Point start = st.getStart();
        Point end = st.getEnd();
        if ( isValid2DPoint(start) && isValid2DPoint(end) ) {
            g2.drawLine(start.getX(), HEIGHT - start.getY(), end.getX(), HEIGHT - end.getY());

        } else {
            System.out.println("Punkte ungültig:" + st);
        }
    }

    private static boolean isValid2DPoint(Point pk) {
        return pk.getX() <= WIDTH && pk.getY() <= HEIGHT && pk.getX() >= 0 && pk.getY() >= 0;
    }

    public static void main(String[] args) {
        new Java2d();
    }
}