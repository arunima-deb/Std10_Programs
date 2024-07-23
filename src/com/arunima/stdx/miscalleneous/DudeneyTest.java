package com.arunima.stdx.miscalleneous;

import static com.arunima.util.IOUtil.* ;
import java.util.Scanner ;

public class DudeneyTest 
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in) ;
    print("Enter a number : ");
    int n = sc.nextInt() ;
    
    if( isDudeney(n) )
      println( n + " is a Dudeney number." ) ;
    else
      println( n + " is not a Dudeney number." ) ;
    
    sc.close() ;
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
