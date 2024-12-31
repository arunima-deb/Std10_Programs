package com.arunima.stdx;

import java.util.Scanner ;

public class FirstLetters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		String st = new String() ;
		System.out.println( "Paste material : " ) ;
		st = sc.nextLine() ;
		
		st = " " + st ;
		
		for( int i=0; i<st.length(); i++ ) {
			if( Character.isWhitespace(st.charAt(i)) ) {
				System.out.print( st.charAt(i+1) + " " ) ;
			}
		}
	}
}
