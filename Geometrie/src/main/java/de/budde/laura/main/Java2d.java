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

import de.budde.laura.shape.Circle;
import de.budde.laura.shape.Composite;
import de.budde.laura.shape.Line;
import de.budde.laura.shape.Point;
import de.budde.laura.shape.Segment;

public class Java2d {
    Graphics2D g2;

    private static final int WIDTH = 1000;
    private static final int HEIGHT = 600;

    public Java2d() {
        final JFrame frame = new JFrame();
        frame.setSize(WIDTH, HEIGHT + 100);

        final JPanel panel = new JPanel();
        panel.setSize(WIDTH, HEIGHT);

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
        this.g2 = (Graphics2D) panel.getGraphics();
        this.g2.clearRect(0, 0, panel.getWidth(), panel.getHeight());
        BasicStroke stroke = new BasicStroke(4);
        this.g2.setStroke(stroke);
        this.paintTest();
    }

    private void paintTest() {
        Point a = Point.of(100, 100);
        Point b = Point.of(200, 100);
        Point c = Point.of(200, 150);
        Point d = Point.of(100, 150);
        Segment s1 = Segment.of(a, b);
        Segment s2 = Segment.of(b, c);
        Segment s3 = Segment.of(c, d);
        Segment s4 = Segment.of(d, a);

        Point xshift = Point.of(110, 0);
        Composite ziegel = new Composite();
        ziegel.addShape(s1, s2, s3, s4);
        Composite reihe = new Composite();
        reihe.addShape(ziegel);
        reihe.addShape(ziegel = (Composite) ziegel.move(xshift));
        reihe.addShape(ziegel = (Composite) ziegel.move(xshift));
        reihe.addShape(ziegel = (Composite) ziegel.move(xshift));
        reihe.addShape(ziegel = (Composite) ziegel.move(xshift));

        Point yshift = Point.of(0, 60);
        Composite wand = new Composite();
        wand.addShape(reihe);
        wand.addShape(reihe = (Composite) reihe.move(yshift));
        wand.addShape(reihe = (Composite) reihe.move(yshift));
        wand.addShape(reihe = (Composite) reihe.move(yshift));
        wand.addShape(reihe = (Composite) reihe.move(yshift));
        wand.addShape(reihe = (Composite) reihe.move(yshift));
        wand.getPainter(this.g2, WIDTH, HEIGHT).paint();

    }

    private void paintImpl() {
        Composite comp = new Composite();

        Line c = Line.of(0.0, 400, Color.BLUE);

        Point p1 = Point.of(0, 400);
        Point p2 = Point.of(800, HEIGHT);
        Line d = Line.of(p1, p2, Color.ORANGE);

        Point p3 = Point.of(0, 400);
        Point p4 = Point.of(800, 0);
        Line e = Line.of(p3, p4, Color.RED);

        Point p5 = Point.of(0, 400);
        Point p6 = Point.of(WIDTH, 600);
        Line f = Line.of(p5, p6, Color.GREEN);

        Point p7 = Point.of(200, HEIGHT);
        Point p8 = Point.of(800, 0);
        Line g = Line.of(p7, p8, Color.YELLOW);

        Point p9 = Point.of(200, HEIGHT);
        Point p10 = Point.of(WIDTH, 400);
        Line h = Line.of(p9, p10, Color.PINK);

        Point p11 = Point.of(200, 0);
        Point p12 = Point.of(800, HEIGHT);
        Line i = Line.of(p11, p12, Color.MAGENTA);

        Point p13 = Point.of(200, 0);
        Point p14 = Point.of(WIDTH, 400);
        Line j = Line.of(p13, p14, Color.GRAY);

        Point p15 = Point.of(200, 350, Color.BLUE);

        Point p16 = Point.of(500, 300);
        Point p17 = Point.of(250, 350);
        Segment se1 = Segment.of(p16, p17, Color.GREEN);

        Point a = Point.of(200, 200, Color.black);
        Point b = Point.of(200, 100, Color.red);
        Point c1 = Point.of(300, 130, Color.green);
        Point d1 = Point.of(300, 150, Color.red);
        Point e1 = Point.of(21, 0, Color.yellow);

        Set<Point> seP = new HashSet<>();
        seP.add(a);
        seP.add(b);
        seP.add(c1);
        seP.add(d1);
        seP.add(e1);

        seP.stream().filter(x -> x.getColor().equals(Color.green)).forEach(x -> x.getPainter(this.g2, WIDTH, HEIGHT).paint());

        comp.addShape(c, d, e, f, g, h, i, j, p15, se1);
        comp.getPainter(this.g2, WIDTH, HEIGHT).paint();
        comp.move(100, 100).getPainter(this.g2, WIDTH, HEIGHT).paint();

        Point ca = Point.of(100, 100);
        Circle cc = Circle.of(ca, 100, Color.BLUE);
        cc.getPainter(this.g2, WIDTH, HEIGHT).paint();
        cc = (Circle) cc.move(100, 100);

        cc.getPainter(this.g2, WIDTH, HEIGHT).paint();

    }

    public static void main(String[] args) {
        new Java2d();
    }
}