package com.arunima.stdx.ch4.todo ;

import static com.arunima.util.IOUtil.* ;
import java.util.* ;

/**
 * Write a program in Java to accept the name of an employee and his/her annual
 * income. Pass the name and the annual income to a method Tax(String name, int
 * income) which displays the name of the employee and the income tax as per the
 * given tariff: 
 * 
 * | Annual Income Income Tax | Up to & 2,50,000 No tax 
 * 
 * 4 | %
 * 250,001 to & 5,00,000 10% of the income exceeding % 2,50,000 
 * 
 * es 
 * 
 * K 5,00,001
 * to % 10,00,000 % 30,000 + 20% of the amount exceeding % 5,00,000 
 * 
 * % 10,00,001
 * and above % 50,000 + 30% of the amount exceeding & 10,00,000 
 * 
 * 
 */
public class Program_E_16
{
    public static void main( String[] args )
    {
        println( "----------- Program Title --------------" ) ;

        Scanner sc = new Scanner( System.in ) ;
        println( "<Prompt> : " ) ;

        // Logic

        sc.close() ;
    }
}
