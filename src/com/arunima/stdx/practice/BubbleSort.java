package com.arunima.stdx.practice;

public class BubbleSort extends Basics {
	private static int[] array = {4, 6, 2, 8, 1, 99, 65, 43} ;
	public static void main (String[] args) {
		BubbleSort ob = new BubbleSort() ;
		ob.bubbleSort() ;
		ob.print() ;
	}
	
	public void bubbleSort() {
		for( int i=0; i<array.length-1; i++ ) {
			for( int j=0; j<array.length-i-1; j++ ) {
				if( array[j+1]<array[j] ) 
					swap( j, j+1 ) ;
			}
		}
	}
}
