package de.laura.mains;

import java.awt.BasicStroke;
import java.awt.Container;
import java.awt.Graphics2D;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
        Punkt a = new Punkt(100, 0);
        Punkt b = new Punkt(500, 200);
        Strecke st = new Strecke(a, b);
        paint(st);
        Punkt e = new Punkt(100, 100);
        paint(e);

    }

    private void paint(Punkt p1) {
        if ( isValid2DPoint(p1) ) {

            g2.drawLine(p1.getx(), HEIGHT - p1.gety(), p1.getx(), HEIGHT - p1.gety());

        } else {
            System.out.println("Punkt ungültig:" + p1);
        }
    }

    private void paint(Strecke st) {
        Punkt start = st.getStart();
        Punkt end = st.getEnd();
        if ( isValid2DPoint(start) && isValid2DPoint(end) ) {
            g2.drawLine(start.getx(), HEIGHT - start.gety(), end.getx(), HEIGHT - end.gety());

        } else {
            System.out.println("Punkte ungültig:" + st);
        }
    }

    private boolean isValid2DPoint(Punkt pk) {
        return pk.getx() <= WIDTH && pk.gety() <= HEIGHT && pk.getx() >= 0 && pk.gety() >= 0;
    }

    public static void main(String[] args) {
        new Java2d();
    }
}