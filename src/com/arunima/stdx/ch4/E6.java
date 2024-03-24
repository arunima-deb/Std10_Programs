package com.arunima.stdx.ch4;
import java.util.* ;

// Armstrong number
public class E6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter a number : " ) ;
		
		int input = sc.nextInt() ;
		if( armstrong( input ) == 1 ) 
		{
			System.out.println( input + " is an Armstrong number." ) ;
		}
		else 
		{
			System.out.println( input + " is not an Armstrong number." ) ;
		}
		
		sc.close() ;
	}
	
	public static int armstrong( int x )
	{
		int xClone = x, currentDigit = 0, sum = 0 ;
		
		while( xClone > 0 )
		{
			currentDigit = xClone%10 ;
			sum += Math.pow(currentDigit, 3) ;
			xClone /= 10 ;
		}
		
		if( sum==x )
			return 1 ;
		else
			return 0 ;
	}
}
