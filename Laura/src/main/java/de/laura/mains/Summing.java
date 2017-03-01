package de.laura.mains;

import org.junit.Assert;
import org.junit.Test;

public class Summing {

    public static final int N = 3;

    public int sumfor() {
        int zaehl = 0;
        for ( int a = 0; a <= N; a++ ) {
            zaehl = zaehl + a;
        }
        return zaehl;

    }

    public int sumwhile() {
        int a = 0;
        int zaehl = 0;
        while ( a <= N ) {
            zaehl = zaehl + a;
            a++;
        }
        return zaehl;
    }

    public int sumrek(int i) {

        if ( i == 0 ) {
            return 0;
        } else {
            return i + sumrek(i - 1);

        }

    }

    @Test
    public void Tests() {

        Assert.assertEquals(6, sumfor());

        Assert.assertEquals(6, sumwhile());

        Assert.assertEquals(6, sumrek(3));

    }
}
