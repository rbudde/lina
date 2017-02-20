package de.laura.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class RegexTests {

    @Test

    public void Test1() {
        /*Im folgendem: X ist eine Zeichenkette
         */
        // . ->beliebiges Zeichen, * -> Quantifizierer, der wahllos viele Zeichen erlaubt
        System.out.println("'Hello World'".matches("'.*'"));
        //X? -> X kommt keinmal oder einmal vor
        System.out.println("'Hello World'".matches("'Hello World'?"));
        // x kommt einmal oder beliebig oft vor
        System.out.println("'Hello World'".matches("'.+'"));

        System.out.println(Pattern.matches("0*", "00000"));
        //mit [] definiert man Zeichenklassen
        System.out.println(Pattern.matches("[01]*", "1"));
        //mit ^ definiert man negative Zeichenklassen, also Zeichen, die nicht vorkommen dürfen
        System.out.println(Pattern.matches("[^01]*", "3"));
        System.out.println(Pattern.matches("[0234567891]*", "334"));

        System.out.println(Pattern.matches("\\d*", "334"));
        System.out.println(Pattern.matches("\\w*", "a3"));
        System.out.println(Pattern.matches(".*", "a3"));

        System.out.println("Testreihe 2");

        Pattern p = Pattern.compile("'.*'");
        Matcher m = p.matcher("'HalloWelt'");
        boolean b = m.matches();
        System.out.println(b);

    }

    @Test

    public void Zahlenfinder() {

        String s = "'Wer die Freiheit sucht,der tut wohl, welcher aber die" + "Freiheit lebt," + "der tut besser!'1. Korintehere 7,38";
        Matcher matcher = Pattern.compile("\\d+").matcher(s);
        while ( matcher.find() ) {
            System.out.printf("%s an Position [%d,%d]%n", matcher.group(), matcher.start(), matcher.end());
        }

        Pattern patternt = Pattern.compile("<b>.*</b>");
        Matcher matchert = patternt.matcher("Echt <b>fett</b>. <b>Cool</b>!");
        while ( matchert.find() ) {
            System.out.println(matchert.group());
        }

    }

}
