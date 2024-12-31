package com.arunima.stdx.practice;

import java.util.Scanner;

public class Basics {
	private static int[] array = new int[10] ;
	static void swap( int firstIndex, int lastIndex ) {
		int temp = array[firstIndex] ;
		array[firstIndex] = array[lastIndex] ;
		array[lastIndex] = temp ;
	}
	
	void print() {
		System.out.println( "\n\nSorted elements : \n\n" ) ;
		for( int k=0; k<array.length; k++ ) {
			System.out.println( array[k] ) ;
		}
	}
	
	
	void getData() {
		Scanner sc = new Scanner(System.in) ;
		System.out.print( "Enter 10 elements : " ) ;
		for( int i=0; i<10; i++ )
			array[i] = sc.nextInt() ;
		sc.close() ;
	}
}
