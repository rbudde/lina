package de.budde.laura.shape;

import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import de.budde.laura.painter.Painter;

public class Composite extends Shape {

    private List<Shape> shapesList = new ArrayList<>();

    public Composite() {
        super(Color.YELLOW);
    }

    public void addShape(Shape... s) {
        for ( Shape shape : s ) {
            this.shapesList.add(shape);
        }
    }

    public void removeShape(Shape s) {

        this.shapesList.remove(s);
    }

    public void printShapes() {

        System.out.println(this.shapesList);
    }

    @Override
    public Painter getPainter(Graphics2D g2, int width, int height) {

        return new Painter(g2, width, height) {

            @Override
            public void paint() {
                Composite.this.shapesList.forEach(s -> s.getPainter(this.g2, this.width, this.height).paint());

            }
        };
    }

    @Override
    public Shape move(int x, int y) {
        Composite s = new Composite();
        for ( Shape shape : this.shapesList ) {
            s.addShape(shape.move(x, y));
        }
        return s;
    }

}
