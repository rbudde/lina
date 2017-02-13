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
        c.getPainter(g2, WIDTH, HEIGHT).paint();
        Point p1 = Point.of(0, 400);
        Point p2 = Point.of(800, HEIGHT);
        Line d = new Line(p1, p2);
        d.setColor(Color.ORANGE);
        d.getPainter(g2, WIDTH, HEIGHT).paint();
        Point p3 = Point.of(0, 400);
        Point p4 = Point.of(800, 0);
        Line e = new Line(p3, p4);
        e.setColor(Color.RED);
        e.getPainter(g2, WIDTH, HEIGHT).paint();
        Point p5 = Point.of(0, 400);
        Point p6 = Point.of(WIDTH, 600);
        Line f = new Line(p5, p6);
        f.setColor(Color.GREEN);
        f.getPainter(g2, WIDTH, HEIGHT).paint();
        Point p7 = Point.of(200, HEIGHT);
        Point p8 = Point.of(800, 0);
        Line g = new Line(p7, p8);
        g.setColor(Color.YELLOW);
        g.getPainter(g2, WIDTH, HEIGHT).paint();
        Point p9 = Point.of(200, HEIGHT);
        Point p10 = Point.of(WIDTH, 400);
        Line h = new Line(p9, p10);
        h.setColor(Color.PINK);
        h.getPainter(g2, WIDTH, HEIGHT).paint();
        Point p11 = Point.of(200, 0);
        Point p12 = Point.of(800, HEIGHT);
        Line i = new Line(p11, p12);
        i.setColor(Color.MAGENTA);
        i.getPainter(g2, WIDTH, HEIGHT).paint();
        Point p13 = Point.of(200, 0);
        Point p14 = Point.of(WIDTH, 400);
        Line j = new Line(p13, p14);
        j.setColor(Color.GRAY);
        j.getPainter(g2, WIDTH, HEIGHT).paint();

        Point p15 = Point.of(200, 350);
        p15.setColor(Color.BLUE);
        p15.getPainter(g2, WIDTH, HEIGHT).paint();

        Point p16 = Point.of(500, 300);
        Point p17 = Point.of(250, 350);
        Segment se1 = new Segment(p16, p17);
        se1.setColor(Color.GREEN);
        se1.getPainter(g2, WIDTH, HEIGHT).paint();
        ;

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

        seP.stream().filter(x -> x.getColor().equals(Color.green)).forEach(x -> x.getPainter(g2, WIDTH, HEIGHT).paint());

    }

    public static void main(String[] args) {
        new Java2d();
    }
}