package com.arunima.stdx.ch4 ;

import static com.arunima.util.IOUtil.* ;
import java.util.* ;

/**
 * Write a method fact(int n) to find the factorial of a number n. 
 * 
 * Include a main class to find the value of S where: 
 * 
 * n! = m! / (n—m)! 
 * 
 * where, 
 * 
 * n! = 1 x 2 x 3 x .. x n 
 */
public class Program_E_9
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner( System.in ) ;
        println( "Enter two numbers : " ) ;
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        double S = fact(n)/((fact(m)*fact((n-m)))) ;
        println(S) ;
        
        sc.close() ;
    }
    
    public static int fact( int n ) 
    {
    	int f=1 ;
    	for( int i=1; i<=n; i++ )
    	{
    		f=f*i ;
    	}
    	return f ;
    }
    
}
