package de.budde.laura.shape;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.junit.Assert;
import org.junit.Test;

public class CollectionsTest {
    @Test
    public void ArrayTest1() {

        String Stringarray[] = new String[5];
        Stringarray[0] = "Hallo";
        System.out.println(Stringarray[0]);

        double tab[][] = new double[5][3];//Tabelle mit Elementen vom Typ double mit 5 Zeilen und 3 Spalten
        tab[1][1] = 3.0;
        Assert.assertEquals(3.0, tab[1][1], 0.0001);

    }

    /* LinkedList wird als doppelt verkettete Liste implementiert. Jedes Element (außer Ränder)
     * hat einen Vorgänger und Nachfolger.
    */
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

    /* Set is a Collection that cannot contain duplicate elements.
     *A Hash set is an unsorted Set.
     * */

    @Test
    public void CollectionsTest3() {

        Set<Shape> shapeS = new HashSet<>();
        shapeS.add(Point.of(1, 9));
        shapeS.add(Point.of(18, 9));
        shapeS.add(Point.of(168, 39));
        shapeS.add(Point.of(178, 0));
        for ( Shape shape : shapeS ) {
            System.out.println(shape.toString());
        }
        shapeS.stream().forEach(shape -> System.out.println(shape));

    }
    /* Jedes Exemplar der ArrayList vertritt ein Array mit unterschieddlicher Länge.
     * (ohne beso. Angaben: Array mit einer Capazität von 10)
     *
     */

    @Test
    public void CollectionsTest2() {

        List<Integer> intList = new ArrayList<Integer>();
        intList.add(4);
        intList.add(3);
        intList.add(6);
        intList.stream().forEach(i -> System.out.println(i));
        intList.set(0, 10);
        for ( Integer i : intList ) {
            System.out.println(i);
        }
        System.out.println("Anzahl der Elemente:" + intList.size());
        intList.clear();
        System.out.println(intList.isEmpty());

    }

    @Test
    public void CollectionsTest4() {

        Map<Integer, String> mapo = new HashMap<>();
        mapo.put(0, "Hallo1");
        mapo.put(1, "Hallo2");
        System.out.println(mapo.get(0));
        String x = mapo.keySet().stream().map(i -> mapo.get(i)).collect(Collectors.joining(",  ,"));
        System.out.println(x);
    }

    @Test
    public void CollectionsTest5() {

        Comparator<Integer> ic = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {

                return o1 - o2;
            }
        };
        Set<Integer> treeS = new TreeSet<>(ic);
        treeS.add(1);
        treeS.add(2);
        treeS.add(0);
        treeS.add(4);
        for ( Integer i : treeS ) {

            System.out.println(i);
        }

    }

    @Test
    public void CollectionsTest6() {
        Point a = Point.of(1, 1);
        Point b = Point.of(2, 2);
        Point c = Point.of(4, 4);

        Comparator<Point> pc = new Comparator<Point>() {

            @Override
            public int compare(Point o1, Point o2) {

                return o1.getX() - o2.getX();
            }
        };
        Set<Point> treeP = new TreeSet<>(pc);
        treeP.add(a);
        treeP.add(b);
        treeP.add(c);
        for ( Point p : treeP ) {
            System.out.println(p);

        }

    }

    @Test
    public void CollectionsTest7() {
        Point a = Point.of(4, 0);
        Point b = Point.of(2, 0);
        Point c = Point.of(8, 0);

        Comparator<Point> pc = new Comparator<Point>() {

            @Override
            public int compare(Point o1, Point o2) {

                return o1.length(o1) - o2.length(o2);
            }
        };
        Set<Point> treeP = new TreeSet<>(pc);
        treeP.add(a);
        treeP.add(b);
        treeP.add(c);
        for ( Point p : treeP ) {
            System.out.println(p);

        }
    }

    @Test
    public void CollectionsTest8() {

        Comparator<Shape> sc = new Comparator<Shape>() {

            @Override
            public int compare(Shape x, Shape y) {

                return x.getIdentity() - y.getIdentity();
            }
        };
        Set<Shape> shapeS = new TreeSet<Shape>(sc);
        Point p1 = Point.of(1, 0);
        Point p2 = Point.of(4, 0);
        Shape l1 = Line.of(2, 0);
        Shape s1 = Segment.of(p1, p2);

        shapeS.add(s1);
        shapeS.add(l1);
        shapeS.add(p2);
        shapeS.add(p1);

        for ( Shape e : shapeS ) {
            System.out.println(e);
        }

    }

    @Test
    public void CollectionsTest9() {
        Point a = Point.of(2, 0);
        a.setColor(Color.black);
        Point b = Point.of(6, 0);
        b.setColor(Color.red);
        Point c = Point.of(9, 0);
        c.setColor(Color.green);
        Point d = Point.of(3, 0);
        d.setColor(Color.red);
        Point e = Point.of(21, 0);
        e.setColor(Color.yellow);

        Set<Point> seP = new HashSet<>();
        seP.add(a);
        seP.add(b);
        seP.add(c);
        seP.add(d);
        seP.add(e);

        seP.stream().filter(CollectionsTest::rot).forEach(CollectionsTest::raus);

    }

    public static void raus(Object x) {
        System.out.println(x);

    }

    public static boolean rot(Shape x) {
        return x.getColor().equals(Color.RED);

    }

    @Test
    public void CollectionsTest10() {

        Comparator<Integer> ic = new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {

                return o1 - o2;
            }
        };
        Set<Integer> treeS = new TreeSet<>(ic);
        treeS.add(1);
        treeS.add(2);
        treeS.add(0);
        treeS.add(4);
        treeS.add(10);
        treeS.add(3);
        treeS.add(11);
        treeS.add(6);
        for ( Integer i : treeS ) {

            System.out.println(i);
        }
        String stringr;
        stringr = treeS.stream().filter(x -> (x % 2) == 0).map(x -> x * x).map(x -> "(" + x + ")").collect(Collectors.joining(",", "<<<", ">>>"));
        System.out.println(stringr);

    }

    @Test
    public void ModuloTest() {
        int a = 0;
        boolean isEven;

        if ( (a % 2) == 0 ) {
            isEven = true;
        } else {
            isEven = false;
        }

        isEven = (a % 2) == 0;

    }

}
