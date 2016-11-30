package de.laura.java2d;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.junit.Test;

public class Java2dPNG {
    private static final String DIR = "out/";

    @Test
    public void schoenesPNG() throws IOException {
        BufferedImage bi = new BufferedImage(1024, 768, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = bi.createGraphics();
        Java2d maler = new Java2d(graphics);
        maler.maleSchoenesBild();
        Java2dPNG.writeGraphicToFile(bi, "PNG", "muster");
    }

    private static void writeGraphicToFile(BufferedImage bi, String format, String name) throws IOException {
        boolean writerFound = ImageIO.write(bi, format, new File(DIR + name + "." + format));
        if ( !writerFound ) {
            System.out.println("No writer found for format " + format);
        }
    }
}