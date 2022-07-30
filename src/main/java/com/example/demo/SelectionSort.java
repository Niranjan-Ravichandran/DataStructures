package com.example.demo;

import java.util.Arrays;

public class SelectionSort {
	
	public int[] swap(int i , int j , int[] arr) {
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]= temp;
		return arr;
		
	}
	
	public int[] sort(int arr[] ) {
		for(int i=0;i<arr.length;i++) {
			int maximum = arr[i];
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<maximum) {
					swap(i, j, arr);
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		SelectionSort selectionSort = new SelectionSort();
		selectionSort.sort(arr);
		Arrays.stream(selectionSort.sort(arr)).forEach(System.out::println);
	}
}
