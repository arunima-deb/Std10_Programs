package com.arunima.stdx.ch2;

import java.util.Scanner ;

public class UJP 
{
  
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print( "Enter a character : " );
    char ch = sc.next().charAt(0) ;
    Prog2(ch) ;
  }
  
  public static void Prog1( char ch )
  {
    System.out.println( "\n10th character from entered letter = " + (char)(ch + 10) ) ;
  }
  
  public static void Prog2( char ch )
  {
    System.out.print( "\nNext 5 characters from entered character : " ) ;
    for( int i=ch+1; i<=(ch+5); i++ )
    {
      System.out.print( (char)i);
      
      if( i<=(ch+4) )
        System.out.print( ", " );
    }
  }
  
  public static void Prog3( char ch )
  {
    
  }
  
}