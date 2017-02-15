package de.budde.laura.shape;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.List;

import de.budde.laura.painter.Painter;

public class Composite extends Shape {
    Shape shapes;
    private List<Shape> shapesList = new ArrayList<>();

    public void addShape(Shape... s) {
        for ( Shape shape : s ) {
            shapesList.add(shape);
        }
    }

    public void removeShape(Shape s) {

        shapesList.remove(s);
    }

    public void printShapes() {

        System.out.println(shapesList);
    }

    @Override
    public Painter getPainter(Graphics2D g2, int width, int height) {

        return new Painter(g2, width, height) {

            @Override
            public void paint() {
                shapesList.forEach(s -> s.getPainter(g2, width, height).paint());

            }
        };
    }

    @Override
    public void move(int x, int y) {

        shapesList.stream().forEach(s -> s.move(x, y));
    }

    @Override
    public Shape clone(int x, int y) {
        Composite s = new Composite();
        for ( Shape shape : shapesList ) {
            s.addShape(shape.clone(x, y));
        }
        return s;
    }

}
