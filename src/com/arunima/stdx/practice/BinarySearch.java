package com.arunima.stdx.practice;

import java.util.Scanner ;

public class BinarySearch extends BubbleSort {
	private static int[] array = {1, 5, 8, 9, 2, 0, 4, 6 } ;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		BinarySearch ob = new BinarySearch() ;
		System.out.println( "Enter key : " ) ;
		int key = sc.nextInt() ;
		ob.bubbleSort() ;
		ob.binarySearch( key ) ;
		sc.close();
	}
	
	void binarySearch( int key ) {
		int firstIndex = 0 ;
		int lastIndex = array.length-1 ;
		int midIndex=0 ;
		boolean isFound = false;
		
		while( firstIndex<=lastIndex ) {
			midIndex = (firstIndex+lastIndex)/2 ;
			if( key==array[midIndex] ) {
				isFound = true ;
				break ;
			}
			else if( key>array[midIndex] ) {
				firstIndex = midIndex+1 ;
			}
			else if( key<array[midIndex] ) {
				lastIndex = midIndex-1 ;
			}
		}
		
		if( isFound )
			System.out.println( "Key is found in array at index " + midIndex ) ;
		else
			System.out.println( "Not found in array." ) ;
	}
}
