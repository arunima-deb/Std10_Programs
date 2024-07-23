package com.arunima.stdx.ch1;

import static com.arunima.util.IOUtil.* ;
import java.util.Scanner ;

public class UJP 
{
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    print( "Enter a character : " );
    char ch = sc.next().charAt(0) ;
    Prog3(ch) ;
  }
  
  public static void Prog1( char ch )
  {
    println( "\n10th character from entered letter = " + (char)(ch + 10) ) ;
  }
  
  public static void Prog2( char ch )
  {
    print( "\nNext 5 characters from entered character : " ) ;
    for( int i=ch+1; i<=(ch+5); i++ )
    {
      print( (char)i);
      
      if( i<=(ch+4) )
        print( ", " );
    }
  }
  
  public static void Prog3( char ch )
  {
    println( Character.toLowerCase(ch) ) ;
  }
  
  
  public static void Prog4( char ch )
  {
    
  }
  
}
