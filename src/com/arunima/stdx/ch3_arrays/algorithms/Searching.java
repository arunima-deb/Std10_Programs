package com.arunima.stdx.ch3_arrays.algorithms;

import java.util.Scanner ;

public class Searching 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in) ;
		int[] array = {5, 3, 7, 1, 4} ;
		Basics.printArray("Array", array);
		System.out.println( "Enter element to be searched for : " ) ;
		int key = sc.nextInt() ;
		int keyIndex = sequentialSearch(array, key) ;
		if( keyIndex==-1 )
			System.out.println( "Element not found in array." ) ;
		else
			System.out.println("Index of "+key+" in array is " + keyIndex ) ;
		sc.close();
	}
	
	public static int binarySearch( int[] array, int key )
	{
		int firstIndex=0, lastIndex=array.length-1 ;
		int midIndex, keyIndex=-1 ;
		while( firstIndex<=lastIndex )
		{
			midIndex = (firstIndex+lastIndex)/2 ;
			if( array[midIndex]==key ) {
				keyIndex = midIndex ;
				break ;
			}
			else if( array[midIndex]<key )
				firstIndex = midIndex+1 ;
			else if( array[midIndex]>key )
				lastIndex = midIndex-1 ;
		}
		return keyIndex ;
	}
	
	public static int sequentialSearch( int[] array, int key )
	{
		int keyIndex = -1 ;
		for( int i=0; i<array.length; i++ )
		{
			if( array[i]==key )
				keyIndex = i ;
		}
		return keyIndex ;
	}
}
