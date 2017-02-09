package de.budde.laura.main;

import java.awt.BasicStroke;
import java.awt.Container;
import java.awt.Graphics2D;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import de.budde.laura.shape.Point;
import de.budde.laura.shape.Segment;

public class Java2d {
    Graphics2D g2;

    private final int WIDTH = 1000;
    private final int HEIGHT = 700;

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
        Point a = new Point(100, 0);
        Point b = new Point(500, 200);
        Segment st = new Segment(a, b);
        paint(st);
        Point e = new Point(100, 100);
        paint(e);

    }

    private void paint(Point p1) {
        if ( isValid2DPoint(p1) ) {

            g2.drawLine(p1.getX(), HEIGHT - p1.getY(), p1.getX(), HEIGHT - p1.getY());

        } else {
            System.out.println("Punkt ungültig:" + p1);
        }
    }

    private void paint(Segment st) {
        Point start = st.getStart();
        Point end = st.getEnd();
        if ( isValid2DPoint(start) && isValid2DPoint(end) ) {
            g2.drawLine(start.getX(), HEIGHT - start.getY(), end.getX(), HEIGHT - end.getY());

        } else {
            System.out.println("Punkte ungültig:" + st);
        }
    }

    private boolean isValid2DPoint(Point pk) {
        return pk.getX() <= WIDTH && pk.getY() <= HEIGHT && pk.getX() >= 0 && pk.getY() >= 0;
    }

    public static void main(String[] args) {
        new Java2d();
    }
}