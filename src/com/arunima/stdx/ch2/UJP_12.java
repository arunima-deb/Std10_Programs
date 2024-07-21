package com.arunima.stdx.ch2;

import java.util.Scanner ;

public class UJP_12 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.println( "Enter choice : " ) ;
    char ch = sc.next().charAt(0) ;
    
    switch(ch)
    {
    case 'a' : Pattern1() ; break ;
    }
    
  }
  
  public static void Pattern1()
  {
    for( int i=97; i<=101; i++ )
    {
      for( int j=97; j<=i; j++ )
      {
        if( j%2==0 )
        {
          System.out.print( Character.toUpperCase( (char)j ) ) ;
        }
      }
      System.out.println() ;
    }
  }
  
}
