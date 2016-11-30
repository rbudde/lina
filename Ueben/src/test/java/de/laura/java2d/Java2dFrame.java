package de.laura.java2d;

import java.awt.Container;
import java.awt.Graphics2D;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Java2dFrame {
    private boolean bild1 = true;

    public Java2dFrame() {
        final JFrame frame = new JFrame("SchönesBild");
        final JPanel panel = new JPanel();
        panel.setSize(1024, 768);

        JButton maleButton = new JButton("wechsle das Bild");
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
        Graphics2D g2d = (Graphics2D) panel.getGraphics();
        g2d.clearRect(0, 0, panel.getWidth(), panel.getHeight());
        if ( bild1 ) {
            new Java2d(g2d).maleText();
        } else {
            new Java2d(g2d).maleSchoenesBild();
        }
        bild1 = !bild1;
    }

    public static void main(String[] args) {
        new Java2dFrame();
        //        EventQueue.invokeLater(new Runnable() {
        //            @Override
        //            public void run() {
        //                new Java2dFrame();
        //            }
        //        });
    }
}