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
		
		Sorting coordinator = new Sorting() ;
		
		coordinator.printArray( "\nUnsorted array", array ) ;
		coordinator.selectionSort(array) ;
		coordinator.printArray( "Sorted array", array ) ;
	}
	
	public void selectionSort( int[] array ) 
    {    
        int minIndex ;
        int unsortedStart ;
        
        for( int i=0; i<array.length; i++ )
        {
            unsortedStart = i ;
            minIndex = getMinIndex( array, unsortedStart ) ;
            swap( array, unsortedStart, minIndex ) ;
        }
    }
	
	public int getMinIndex( int[] array, int firstIndex )
    {
        int minIndex = firstIndex ;
        for( int i=firstIndex; i<array.length; i++ )
        {
            if( array[i]<array[minIndex] )
                minIndex = i ;
        }
        return minIndex ;
    }
	
	public void bubbleSort( int[] array ) {
		for( int i=0; i<array.length-1; i++ ) {
			for( int j=0; j<array.length-i-1; j++ ) {
				if( array[j]>array[j+1] )
					swap( array, j, j+1 ) ;
			}
		}
	}
	
	public void swap( int[] array, int prevIndex, int newIndex ) {
		int temp = array[prevIndex] ;
		array[prevIndex] = array[newIndex] ;
		array[newIndex] = temp ;
	}
	
	public void printArray( String msg, int[] array ) {
		System.out.print( msg + " : [ " + array[0] ) ;
		for( int i=1; i<array.length; i++ )
			System.out.print( ", " + array[i] ) ;
		System.out.print( " ]\n" ) ;
	}
}
