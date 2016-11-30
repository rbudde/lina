package de.felix.mathe;

public class Mathe {

    /**
     * liefere die Größere zweier Zahlen
     * 
     * @param x erste Zahl
     * @param y zweite Zahl
     * @return die Größere
     */
    public static int max(int x, int y) {
        if ( x > y ) {
            return x;
        } else {
            return y;
        }
    }

    /**
     * liefere n!
     * 
     * @param n
     * @return n!
     */
    public static int fac(int n) {
        if ( n <= 1 ) {
            return 1;
        }
        return n * fac(n - 1);
    }
}
