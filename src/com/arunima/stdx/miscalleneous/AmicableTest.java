package com.arunima.stdx.miscalleneous;

import java.util.Scanner ;

public class AmicableTest 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.println( "Enter two numbers : " ) ;
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if( areAmicable(a, b) )
      System.out.println( a + " and " + b + " are amicable numbers." ) ;
    else
      System.out.println( a + " and " + b + " are not amicable numbers." ) ;
    
    sc.close();
  }
  
  public static boolean areAmicable( int x, int y )
  {
    int xFact = 0, yFact = 0 ;
    boolean areAmicable = false ;
    
    for( int i=1; i<x; i++ )
    {
      if(x%i==0)
        xFact += i ;
    }
    for( int j=1; j<y; j++ )
    {
      if(y%j==0)
        yFact += j ;
    }
    
    if( xFact==y && yFact==x )
      areAmicable = true ;
    
    return areAmicable ;
  }
}
