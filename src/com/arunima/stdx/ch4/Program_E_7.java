package com.arunima.stdx.ch4 ;

import java.util.* ;

/**
 * Write a program to input a number and check and print whether it is a ‘Pronic’
 * number or not. Use a method int Pronic(int n) to accept a number. The method
 * returns 1, if the number is ‘Pronic’, otherwise returns zero (0). 
 * 
 * (Hint:Pronic number is the number which is the product of two consecutive integers)
 * 
 * Examples: 
 * 
 * 12 = 3 * 4 
 * 20 = 4 * 5 
 * 42 = 6 * 7 
 */
public class Program_E_7 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter a number : " ) ;
		int x = sc.nextInt() ;
		sc.close() ;
		System.out.println( Pronic(x) ) ;
	}
	
	public static int Pronic( int n )
	{
		boolean isPronic = false ;
		for( int i=1; i<=n; i++ )
		{
			if( i*(i+1)==n ) 
			{
				isPronic = true ;
				break ;
			}
		}
		
		return isPronic?1:0 ;
	}
}
