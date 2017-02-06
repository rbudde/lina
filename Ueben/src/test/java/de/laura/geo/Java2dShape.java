package de.laura.geo;

import java.awt.BasicStroke;
import java.awt.Container;
import java.awt.Graphics2D;
import java.util.Random;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import de.laura.java2d.geo.Punkt;

public class Java2dShape {
    Graphics2D g2;

    public Java2dShape() {
        final JFrame frame = new JFrame();
        frame.setSize(1400, 1000);

        final JPanel panel = new JPanel();
        panel.setSize(1400, 900);

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
        this.paintImpl();
    }

    private void paintImpl() {
        //        Punkt p1 = Punkt.mk(10, 10);
        //        Punkt p2 = p1;
        //        for ( int i = 0; i < 40; i++ ) {
        //            this.paint(p2);
        //            p2 = p2.translate(p1);
        //        }
        Random rnd = new Random(1998);
        for ( int i = 0; i < 15000; i++ ) {
            Punkt p3 = Punkt.mk(rnd.nextInt(900), rnd.nextInt(900));
            this.paint(p3);
        }

    }

    private void paint(Punkt p1) {
        this.g2.drawLine(p1.getX(), p1.getY(), p1.getX(), p1.getY());
    }

    public static void main(String[] args) {
        new Java2dShape();
    }
}