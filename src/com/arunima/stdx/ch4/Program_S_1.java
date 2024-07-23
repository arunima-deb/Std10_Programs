package com.arunima.stdx.ch4 ;

import static com.arunima.util.IOUtil.* ;
import java.util.* ;

/**
 * Write a program to accept a number and check whether the number is prime or not.
 * Use the function name as check (int n). The function returns 1, if the number is
 * prime otherwise, it returns 0. 
 */
public class Program_S_1
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in ) ;
        println( "Enter a number : " ) ;
        int x = sc.nextInt() ;
        println( check(x) ) ;
        sc.close() ;
    }
    
    public static int check( int n )
    {
    	int numFact = 0 ;
    	for( int i=1; i<=n; i++ )
    	{
    		if( n%i==0 )
    		{
    			numFact++ ;
    		}
    	}
    	return ( numFact==2 ) ? 1 : 0 ;
    }
    
}
