package de.laura.mains;

import java.util.Random;
import java.util.Scanner;

public class Würfelspiel {
    public static void main(String[] args) {

        final int ENDSTAND = 3;
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int spielerscore = 0, computerscore = 0;
        int spielerwurf = 0, computerwurf;

        while ( spielerscore < ENDSTAND && computerscore < ENDSTAND ) {

            computerwurf = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
            System.out.println("Der Computer wirft: " + computerwurf);

            System.out.print("1 -> 11-seitiger Wuerfel | 2 -> Zwei 6-seitige Wuerfel (1 oder 2)? ");
            String wuerfeltyp = scan.nextLine();

            if ( wuerfeltyp.equals("1") ) {
                spielerwurf = rand.nextInt(11) + 2;
                System.out.println("Du wirfst den 11-seitigen Würfel und hast eine: " + spielerwurf);
            } else {
                if ( wuerfeltyp.equals("2") ) {
                    spielerwurf = rand.nextInt(6) + 1 + rand.nextInt(6) + 1;
                    System.out.println("Du wirfst zwei Wuerfel und hast eine: " + spielerwurf);
                } else {
                    System.out.println("FALSCH");
                }

            }

            if ( spielerwurf > computerwurf ) {
                spielerscore = spielerscore + 1;
                System.out.println("Du hast die Runde gewonnen!");
            } else {
                if ( spielerwurf == computerwurf ) {
                    System.out.println("Gleichstand :)");
                } else {
                    computerscore = computerscore + 1;
                    System.out.println("Du hast die Runde verloren!");
                }

            }
            System.out.println("Score: Computer " + computerscore + ", Du " + spielerscore + "\n");
        }

        System.out.println("Endstand: Computer " + computerscore + ", Du " + spielerscore);

        if ( computerscore > spielerscore ) {
            System.out.println("Der Computer hat das Spiel gewonnen! :p");
        } else {
            System.out.println("Du hast das Spiel gewonnen! :D");
        }

    }
}