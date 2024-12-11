package com.arunima.stdx.miscalleneous;

import com.arunima.stdx.ch3_arrays.algorithms.Sorting ;

public class ScratchPad {

	public static void main(String[] args) {
		int[] array = { 8, 78, 3, 89, 5 } ;
		Sorting.printArray( "Unsorted array", array) ;
		selectionSortLocal(array) ;
		Sorting.printArray( "Sorted array", array ) ;
	}

	public static void bubbleSortLocal(int[] array) {
		for( int i=0; i<array.length-1; i++ ) {
			for( int j=i; j<array.length-1; j++ ) {
				if( array[j+1]<array[j] )
					Sorting.swap( array, j, j+1 ) ;
			}
		}
	}
	
	public static void selectionSortLocal( int[] array ) {
		int minIndexLocal, i ;
		for( i=0; i<array.length; i++ )
		{
			minIndexLocal = getMinIndex(array, i) ;
			Sorting.swap( array, i, minIndexLocal) ;
		}
	}
	
	/*
	 * This method accepts an array and the index from which
	 * the search of the smallest element is to begin. It returns
	 * the index of the smallest element in the array.
	 */
	public static int getMinIndex( int[] array, int fromIndex ) {
		int minIndex = fromIndex ;
		for( int i=fromIndex; i<array.length; i++ )
		{
			if( array[i]<array[minIndex] )
				minIndex = i ;
		}
		return minIndex ;
	}
}
