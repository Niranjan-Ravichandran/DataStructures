package com.example.demo;

import java.util.Arrays;

public class BubbleSort {
	public int[] swap(int i , int j , int[] arr) {
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]= temp;
		return arr;
		
	}
	
	public int[] sort(int arr[] ) {
		for(int i=0;i<arr.length;i++) {
			boolean swapped = false;
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j+1]<arr[j]) {
					swapped = true;
					swap(j, j+1, arr);
					Arrays.stream(arr).forEach(k-> System.out.print(k+" "));
					System.out.println();
				}
			}
			if(!swapped) {
				break;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = {64,25,12,22,11};
		BubbleSort bb = new BubbleSort();
		bb.sort(arr);
		Arrays.stream(bb.sort(arr)).forEach(System.out::println);
	}
}
