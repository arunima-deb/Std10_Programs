package com.arunima.stdx.ch4 ;

import java.util.* ;

/**
 * Write a program to accept a number and check whether the number is palindrome or
 * not by using the method name reverse (int n). The method returns the reversed
 * number to the main program that checks the palindrome number. 
 */
public class Program_S_3
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in ) ;
        System.out.println( "Enter a number : " ) ;
        int x = sc.nextInt() ;
        
        if( reverse(x)==x )
        	System.out.println( x + " is a palindrome." ) ;
        else
        	System.out.println( x + " is not a palindrome." ) ;
        
        sc.close() ;
    }
    
    public static int reverse( int n )
    {
    	int curDigit = 0, reversedN = 0 ;
    	while( n>0 )
    	{
    		curDigit = n%10 ;
    		reversedN = reversedN*10 + curDigit ;
    		n /= 10 ;
    	}
    	return reversedN ;
    }
    
}
