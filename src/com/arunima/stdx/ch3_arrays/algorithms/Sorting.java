package com.arunima.stdx.ch3_arrays.algorithms;

import java.util.Scanner ; 

public class Sorting {
	
	public static void main(String args[]) {
		
		int[] array = new int[8] ;
		Scanner sc = new Scanner(System.in) ;
		System.out.println( "Enter 8 elements : " ) ;
		for( int i=0; i<8; i++ )
			array[i] = sc.nextInt() ;
		sc.close() ;
		
		Sorting coordinator = new Sorting( array ) ;
		
		Basics.printArray( "\nUnsorted array", array ) ;
		coordinator.bubbleSort() ;
		Basics.printArray( "Sorted array", array ) ;
	}
	
	private int[] array ;
	
	public Sorting( int[] array ) {
		this.array = array ;
	}
	
	public void bubbleSort() {
		for( int i=0; i<array.length-1; i++ ) {
			for( int j=0; j<array.length-i-1; j++ ) {
				if( array[j]>array[j+1] )
					Basics.swap( array, j, j+1 ) ;
			}
		}
	}
	
	public void selectionSort() 
    {    
        int minIndex ;
        int unsortedStart ;
        
        for( int i=0; i<array.length; i++ )
        {
            unsortedStart = i ;
            minIndex = getMinIndex( unsortedStart ) ;
            Basics.swap( array, unsortedStart, minIndex ) ;
        }
    }

	private int getMinIndex( int firstIndex )
    {
        int minIndex = firstIndex ;
        for( int i=firstIndex; i<array.length; i++ )
        {
            if( array[i]<array[minIndex] )
                minIndex = i ;
        }
        return minIndex ;
    }
	
}
