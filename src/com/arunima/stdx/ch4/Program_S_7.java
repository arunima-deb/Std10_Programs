package com.arunima.stdx.ch4 ;

import static com.arunima.util.IOUtil.* ;
import java.util.* ;

/**
 * Write a program to accept a word and pass this word to a method name void
 * display (String st). Display all the vowels present in the word. (Hint: non
 * return type) Sample Input: Enter a word 
 * 
 * Computer Sample Output: The vowels
 * are: 
 * o 
 * u 
 * c 
 */
public class Program_S_7
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner( System.in ) ;
        println( "Enter a word : " ) ;
        String s = sc.next() ;
        //display(s) ;
        displayVowels(s) ;
        sc.close() ;
    }
    
    public static void display( String st )
    {
    	for( int i=0; i<st.length(); i++ )
    	{
    		if( st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i' || st.charAt(i)=='o' || st.charAt(i)=='u' || 
    			st.charAt(i)=='A' || st.charAt(i)=='E' || st.charAt(i)=='I' || st.charAt(i)=='O' || st.charAt(i)=='U' )
    		{
    			println( st.charAt(i) ) ;
    		}
    	}
    }
    
    public static void displayVowels( String input ) 
    {
    	// String.toUpperCase() converts the string into uppercase letters
    	// input = "compuTer"
    	// input.toUpperCase() == "COMPUTER"
    	input = input.toUpperCase() ;
    	String vowels = "AEIOU" ;
    	
    	for( int i=0; i<input.length(); i++ ) 
    	{
        	char ch = input.charAt(i) ;
        	// String.indexOf( char ) gives the position of the character
        	// if it exists in the string, else -1
        	//
        	// "COMPUTER".indexOf('C') = 0
        	// "COMPUTER".indexOf('P') = 3
        	// "COMPUTER".indexOf('A') = -1
    		if( vowels.indexOf( ch ) != -1 )
    		{
    			println( ch ) ;
    		}
    	}
    }
}
