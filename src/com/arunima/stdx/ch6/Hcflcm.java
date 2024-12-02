package com.arunima.stdx.ch6;

import java.util.Scanner ;

public class Hcflcm {
	private int a ;
	private int b ;
	
	public Hcflcm( int x, int y ) {
		a = x ;
		b = y ;
	}
	
	private void calculate() {
		int hcf = 1 ;
		for( int i=1; i<=a && i<=b; i++ )
		{
			if( a%i==0 && b%i==0 )
				hcf = i ;
		}
		System.out.println( "HCF = " + hcf ) ;
		System.out.println( "LCM = " + (a*b)/hcf ) ;
	}
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter two numbers:" ) ;
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Hcflcm ob = new Hcflcm(n1, n2) ;
		ob.calculate();
	}
}
