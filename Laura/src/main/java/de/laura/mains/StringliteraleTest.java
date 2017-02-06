package de.laura.mains;

public class StringliteraleTest {

	
	
	  public static void main ( String[] args )
	  {
	    String str1 = "Stringliteral" ;  // ein Literal erzeugen
	    String str2 = "Stringliteral" ;  // str2 verweist auf dasselbe Literal

	    String msgA = new String ("Aufgepasst!");  // ein Objekt erzeugen
	    String msgB = new String ("Aufgepasst!");  // ein weiteres Objekt erzeugen

	    if ( str1 == str2 )
	      System.out.println( "Das WIRD ausgegeben.");

	    if ( msgA == msgB )
	      System.out.println( "Das wird NICHT ausgegeben.");
	    

	  }

	}


