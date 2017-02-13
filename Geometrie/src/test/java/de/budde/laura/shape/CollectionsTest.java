package de.budde.laura.shape;

import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CollectionsTest {
    @Test
    public void ArrayTest1() {

        String Stringarray[] = new String[5];
        Stringarray[0] = "Hallo";
        System.out.println(Stringarray[0]);

        double tab[][] = new double[5][3];//Tabelle mit Elementen vom Typ double mit 5 Zeilen und 3 Spalten
        tab[1][1] = 1.0;
        Assert.assertEquals(1.0, tab[1][1], 0.0001);

    }

    @Test
    public void CollectionsTest1() {

        List<Shape> shapeList = new LinkedList<Shape>();
        shapeList.add(Point.of(1, 9));
        shapeList.add(Point.of(18, 9));
        for ( Shape shape : shapeList ) {
            System.out.println(shape.toString());
        }
        shapeList.stream().forEach(shape -> System.out.println(shape));

    }
}
