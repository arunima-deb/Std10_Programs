package com.arunima.stdx.ch3_arrays.algorithms;

public class Basics 
{
	public static void swap( int[] array, int prevIndex, int newIndex ) {
		int temp = array[prevIndex] ;
		array[prevIndex] = array[newIndex] ;
		array[newIndex] = temp ;
	}
	
	public static void printArray( String msg, int[] array ) {
		System.out.print( msg + " : [ " + array[0] ) ;
		for( int i=1; i<array.length; i++ )
			System.out.print( ", " + array[i] ) ;
		System.out.print( " ]\n" ) ;
	}
}
