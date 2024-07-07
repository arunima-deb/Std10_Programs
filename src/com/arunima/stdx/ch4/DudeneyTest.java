package com.arunima.stdx.ch4;

import java.util.Scanner ;

public class DudeneyTest 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    System.out.print("Enter a number : ");
    int n = sc.nextInt() ;
    
    if( isDudeney(n) )
      System.out.println( n + " is a Dudeney number." ) ;
    else
      System.out.println( n + " is not a Dudeney number." ) ;
  }
  
  public static boolean isDudeney(int n)
  {
    int sumDig = 0, nClone = n ;
    boolean isDudeney = false ;
    while(n>0)
    {
      sumDig += n%10 ;
      n /= 10 ;
    }
    if( Math.cbrt(nClone)==Math.floor(Math.cbrt(nClone)) && sumDig==Math.cbrt(nClone) )
      isDudeney = true ;
    
   return isDudeney ;
  }
}
