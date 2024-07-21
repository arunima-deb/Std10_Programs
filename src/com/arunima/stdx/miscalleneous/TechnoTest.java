package com.arunima.stdx.miscalleneous;

import java.util.Scanner ;

public class TechnoTest 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print( "Enter a number : " ) ;
    int n = sc.nextInt() ;
    
    if( isTechno(n) )
      System.out.println( n + " is a tech number." ) ;
    else
      System.out.println( n + " is not a tech number." ) ;
  }
  
  public static boolean isTechno(int n)
  {
    int nClone = n, nCloneClone = n ;
    int numDig = 0, firstHalf = 0, secondHalf = 0 ;
    boolean isTechno = false ;
    
    // Find number of digits
    while( nCloneClone>0 )
    {
      numDig++ ;
      nCloneClone/=10 ;
    }
    
    // Separate second half
    for( int i=1; i<=(numDig/2); i++ )
    {
      secondHalf = (secondHalf*10) + nClone%10 ;
      nClone/=10 ;
    }
    
    // Separate first half
    for( int j=1; j<=(numDig/2); j++ )
    {
      firstHalf = (firstHalf*10) + nClone%10 ;
      nClone/=10 ;
    }
    
    // Check if Techno
    if( Math.pow(( firstHalf+secondHalf ), 2) == n )
    {
      isTechno = true ;
    }
    else
    {
      isTechno = false ;
    }
    
    return isTechno ;
  }
}
