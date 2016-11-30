package de.laura.java2d;

import java.awt.BasicStroke;
import java.awt.Container;
import java.awt.Graphics2D;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import de.laura.java2d.geo.Punkt;
import de.laura.java2d.shape.GGroup;
import de.laura.java2d.shape.GStrecke;

public class Java2dShape {
    private boolean bild1 = true;

    public Java2dShape() {
        final JFrame frame = new JFrame("Shapes");
        final JPanel panel = new JPanel();
        panel.setSize(1024, 768);

        JButton maleButton = new JButton("zeichne!");
        maleButton.setEnabled(true);
        maleButton.addActionListener(e -> paint(panel));

        Container contentPane = frame.getContentPane();
        contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));
        contentPane.add(panel);
        contentPane.add(maleButton);

        frame.setSize(1200, 900);
        frame.setVisible(true);
    }

    private void paint(JPanel panel) {
        Graphics2D g2 = (Graphics2D) panel.getGraphics();

        g2.clearRect(0, 0, panel.getWidth(), panel.getHeight());
        maleShapes(g2);
    }

    public void maleShapes(Graphics2D g2) {
        BasicStroke stroke = new BasicStroke(2);
        g2.setStroke(stroke);
        GStrecke sN = GStrecke.mk(10, 10, 100, 10);
        GStrecke sW = GStrecke.mk(10, 10, 10, 100);
        GStrecke sS = GStrecke.mk(10, 100, 100, 100);
        GStrecke sO = GStrecke.mk(100, 10, 100, 100);

        GGroup.Builder grosserBuilder = GGroup.builder();
        GGroup.Builder quadratBuilder = GGroup.builder(sN, sW, sS, sO);
        GGroup quadrat = quadratBuilder.build();
        grosserBuilder.add(quadrat.getShapes());
        for ( int j = 0; j < 8; j++ ) {
            for ( int i = 0; i <= 20; i++ ) {
                grosserBuilder.add(quadrat.translate(Punkt.mk(110 * j + 10 * i, 12 * i)).getShapes());
            }
        }
        GGroup grosseGroup = grosserBuilder.build();
        grosseGroup.paint(g2);
    }

    public static void main(String[] args) {
        new Java2dShape();
    }
}