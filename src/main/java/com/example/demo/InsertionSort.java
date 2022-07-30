package com.example.demo;

import java.util.Arrays;

public class InsertionSort {
	
	public int[] swap(int i , int j , int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	public int[] sort(int arr[] ) {
		for(int i=0;i<arr.length;i++) {
			for (int j=i;j>0;j--) {
				if(arr[j-1]>arr[j]) {
					swap(j-1, j, arr);
					Arrays.stream(arr).forEach(k-> System.out.print(k+" "));
					System.out.println();
				}
			}
		}
		return arr;
	}
	
public static void main(String[] args) {
	int arr[] = {64,25,12,22,11};
	InsertionSort insertionSort = new InsertionSort();
	int[] ar=insertionSort.sort(arr);
	Arrays.stream(ar).forEach(System.out::println);
}
}
// 64 25 12 22 11

//25 64 12 22 11
// 25 12 64 22 11
// 12 25 64 22 11
// 12 25 22  64 11
// 12 22 25 64 11
// 12 22 25 11 64
// 12 22 11 25 64
// 12 11 22 25 64
// 11 12 22 25 64