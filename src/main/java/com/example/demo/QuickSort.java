package com.example.demo;

import java.util.Arrays;

public class QuickSort {
	
	public int[] swap(int i , int j , int[] arr) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	int partition(int[] arr, int low, int high) {
		int i = low-1;
		int pilot =arr[high];
		for( int j=low;j<=high-1;j++) {
			if(arr[j]<pilot) {
				i++;
				swap(i, j, arr);
				
			}
		}
		swap(i+1, high, arr);
		Arrays.stream(arr).forEach(j-> System.out.print(j+" =>"));
		System.out.println();
		
		return i+1;
	}
	void sort(int[] arr,int beg , int end) {
		if(beg<end) {
			int partition = partition(arr, beg, end);
			System.out.println(arr[partition]);
			sort(arr,beg,partition-1);
			sort(arr,partition+1,end);
		}
	}
public static void main(String[] args) {
int[] arr = {10, 80, 30, 90, 40, 50, 70};
QuickSort quickSort = new QuickSort();
 quickSort.sort(arr, 0, arr.length-1);
Arrays.stream(arr).forEach(i-> System.out.print(i+" =>"));
}
}
