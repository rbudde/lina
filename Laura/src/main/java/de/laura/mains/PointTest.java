package de.laura.mains;

import java.awt.*;

public class PointTest {

	public static void main(String[] args) {

		{
			Point a, b, c; // Referenzvariablen

			a = new Point(); // ein Point-Objekt erzeugen bei ( 0, 0 );
								// Referenz in "a" speichern
			b = new Point(12, 45); // ein Point-Objekt erzeugen bei ( 12, 45 );
									// Referenz in "b" speichern
			c = new Point(b); // ein Point-Objekt erzeugen

			System.out.println(a.toString());
			System.out.println(a);

			Point pointA = new Point(7, 99); // erstes Point-Objekt
			Point pointB = new Point(7, 99); // zweites Point-Objekt
												// mit äquivalenten Daten

			if (pointA.equals(pointB))
				System.out.println("Die zwei Objekte enthalten die gleichen Daten: " + pointA);
			else
				System.out.println(
						"Die zwei Objekte sind nicht äquivalent: " + pointA + " unterscheidet sich von" + pointB);

			Point pointI = new Point();
			Point pointP = new Point(94, 172);

			pointI.move(45, 82);

			pointP.move(24 - 12, 34 * 3 - 45);

			int x = 87;
			int y = 55;
			pointI.move(x, y);

			pointP.move(x - 4, y * 2 + 34);

			System.out.println(pointI);
			System.out.println(pointP);
			
			System.out.println("Typumwandlungsbespiel:");

			Point pointD = new Point(); 
			pointD.move((int) 14.305, (int) (34.9 - 12.6));
			System.out.println("Neue Position:" + pointD);
		}
	}
}
