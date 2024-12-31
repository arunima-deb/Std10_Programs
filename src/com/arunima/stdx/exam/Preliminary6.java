package com.arunima.stdx.exam;

import java.util.Scanner ;

public class Preliminary6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "1 - Tribonacci series\n2 - Sunny numbers" ) ;
		System.out.print( "Enter choice : " ) ;
		int ch = sc.nextInt() ; int n = 0 ;
		switch(ch)
		{
		case 1 : printTribonacci() ; break ;
		case 2 : System.out.print( "Enter range : " ) ;
				 n = sc.nextInt() ;
				 printSunny(n) ;
		}
	}
	
	public static void printSunny( int range )
	{
		System.out.println( "Sunny numbers are : " ) ;
		for( int i=1; i<=range; i++ )
		{
			if( Math.sqrt(i+1)==Math.floor(Math.sqrt(i+1)) )
				System.out.println( i ) ;
		}
	}
	
	public static void printTribonacci()
	{
		int[] tribonArr = new int[20] ;
		tribonArr[0] = 1 ;
		tribonArr[1] = 1 ;
		tribonArr[2] = tribonArr[0] + tribonArr[1] ;
		int i ;
		
		for( i=3; i<20; i++ )
		{
			tribonArr[i] = tribonArr[i-3] + tribonArr[i-2] + tribonArr[i-1] ;
		}
		
		System.out.println( "Tribonacci numbers are : " ) ;
		System.out.print( tribonArr[0] + ", " + tribonArr[1] + ", " + tribonArr[2] + ", "  ) ;
		for( i=3; i<20; i++ )
		{
			System.out.print( tribonArr[i] + ", " ) ;
		}
	}
}
