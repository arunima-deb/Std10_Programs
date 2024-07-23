package com.arunima.stdx.ch4 ;

import static com.arunima.util.IOUtil.* ;
import java.util.* ;

/**
 * Write a program using method name Glcm(int,int) to find the Lowest Common
 * Multiple (LCM) of two numbers by GCD (Greatest Common Divisor) of the numbers.
 * GCD of two integers is calculated by continued division method. Divide the
 * larger number by the smaller, the remainder then divides the previous divisor.
 * The Process is repeated till the remainder is zero. The divisor then results in
 * the GCD. __ product of two numbers LCM = eb 
 */
public class Program_E_11
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner( System.in ) ;
        println( "Enter two numbers : " ) ;
        int a = sc.nextInt() ;
        int b = sc.nextInt() ;
        Glcm( a,b ) ;
        sc.close() ;
    }
    
    public static void Glcm( int x, int y )
    {
    	int hcf = 0;
    	for( int i=1; i<=((x>y)?x:y); i++)
    	{
    		if( x%i==0 && y%i==0 )
    		{
    			hcf = i ;
    		}
    	}
		int lcm = (x*y)/hcf ;
		
		println( "LCM = " + lcm ) ;
    }
    
}
