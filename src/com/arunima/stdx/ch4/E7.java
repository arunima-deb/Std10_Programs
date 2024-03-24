package com.arunima.stdx.ch4;
import java.util.* ;
public class E7 
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
