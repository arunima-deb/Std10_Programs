package com.arunima.stdx.ch4;

import java.util.Scanner ;

public class Pronic {

  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print( "Enter a number : " ) ;
    int n = sc.nextInt() ;
    if( isPronic(n) )
      System.out.println( n + " is a pronic number." ) ;
    else
      System.out.println( n + " is not a pronic number." ) ;  
    sc.close() ;
  }
  
  public static boolean isPronic( int n )
  {
    boolean isPronic = false ;
    for( int i=1; i<=n; i++ )
    {
      if( (i*(i+1))==n )
      {
        isPronic = true ;
        break ;
      }
    }
    return isPronic ;
  }

}
