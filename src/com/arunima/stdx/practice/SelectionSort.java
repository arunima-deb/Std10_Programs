package com.arunima.stdx.practice;

import java.util.Scanner ;

public class SelectionSort extends Basics {
	private static int[] array = new int[10] ;
	
	public static void main(String[] args) {
		SelectionSort ob = new SelectionSort() ;
		ob.getData();
		ob.selectionSort();
		ob.print() ;
	}
	
	void selectionSort() {
		int minIndex ;
		int unsortedStart ;
		for( int i=0; i<array.length-1; i++ ) {
			unsortedStart = i ;
			minIndex = getMinIndex( unsortedStart ) ;
			swap( i, minIndex ) ;
		}
	}
	
	static int getMinIndex( int fromIndex ) {
		int minIndex = fromIndex ;
		for( int j=fromIndex+1; j<array.length; j++ ) {
			if( array[j]<array[minIndex] )
				minIndex = j ;
		}
		return minIndex ;
	}
	
	static void swap( int firstIndex, int lastIndex ) {
		int temp = array[firstIndex] ;
		array[firstIndex] = array[lastIndex] ;
		array[lastIndex] = temp ;
	}

}
