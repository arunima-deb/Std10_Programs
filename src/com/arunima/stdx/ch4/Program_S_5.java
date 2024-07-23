package com.arunima.stdx.ch4 ;

import static com.arunima.util.IOUtil.* ;
import java.util.* ;

/**
 * Write a program to accept two numbers and check whether they are twin prime or
 * not. Use the method name as twin(). The function returns 1, if it is twin prime
 * otherwise, returns 0. 
 * 
 * (Twin Prime numbers are the prime numbers whose
 * difference is 2.) For example, (5, 7), (11, 13), (17, 19), etc. are twin prime
 * numbers. 
 */
public class Program_S_5
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in ) ;
        println( "Enter two numbers : " ) ;
        int n1 = sc.nextInt() ;
        int n2 = sc.nextInt() ;
        println( twin( n1, n2) ) ;
        sc.close() ;
    }
    
    public static int twin( int x1, int x2 )
    {
    	int numFactX1 = getNumFactors(x1) ;
    	int numFactX2 = getNumFactors(x2) ;
    
    	return ( Math.abs(x1-x2)==2 && 
    			 numFactX1==2 && 
    			 numFactX2==2  ) ? 1 : 0 ;
    }
    
    public static int getNumFactors( int x ) 
    {
    	int numFactors = 0 ;
    	for( int i=1; i<=x ; i++ )
    	{
    		if( x%i==0 ) 
    		{
    			numFactors++ ;
    		}
    	}
    	return numFactors ;
    }
    
}
