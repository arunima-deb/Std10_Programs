package com.arunima.stdx.miscalleneous;

import java.util.Scanner ;

public class Patterns 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter degree of pattern : " ) ;
		int degree = sc.nextInt() ;
		zeroOneTriangleBasic(degree) ;
	}
	
	public static void zeroOneTriangleBasic(int n)
	{
		for( int i=0; i<n; i++ )
		{
			for( int j=0; j<=i; j++ )
			{
				if( j%2==0 )
					System.out.print(1 + " ");
				else
					System.out.print(0 + " ");
			}
			System.out.println();
		}
	}
	
	public static void zeroOneTriangleComplex(int n)
	{
		int startNum = 1 ;
		for( int i=0; i<n; i++ )
		{
			if( i%2==0 )
				startNum = 1 ;
			else if( i%2==1 )
				startNum = 0 ;
			for( int j=0; j<=i; j++ )
			{
				if( j%2==startNum )
					System.out.print( startNum + " " );
				else
					System.out.print( j%2 + " " ) ;
			}
			System.out.println();
		}
	}
	
	public static void square(int n)
	{
		for( int i=0; i<n; i++ )
		{
			for( int j=0; j<n; j++ )
			{
				System.out.print( "* " ) ;
			}
			System.out.println();
		}
	}
}
