package de.laura.java2d.shape;

import java.awt.Graphics2D;

import de.laura.java2d.geo.Punkt;

public interface IShape<S extends IShape<?>> {
    void paint(Graphics2D g2);

    S translate(Punkt p);
}
