package com.arunima.stdx.ch4 ;

import static com.arunima.util.IOUtil.* ;
import java.util.* ;

/**
 * Write a program to input a three digit number. Use a method int Armstrong(int n)
 * to accept the number. The method returns 1, if the number is Armstrong,
 * otherwise zero(0). 
 * 
 * Sample Input: 153 
 * Sample Output : 153 = 19 + 5° + 3° = 153
 * 
 * It is an Armstrong Number. 
 */
public class Program_E_6 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		println( "Enter a number : " ) ;
		
		int input = sc.nextInt() ;
		if( armstrong( input ) == 1 ) 
		{
			println( input + " is an Armstrong number." ) ;
		}
		else 
		{
			println( input + " is not an Armstrong number." ) ;
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
