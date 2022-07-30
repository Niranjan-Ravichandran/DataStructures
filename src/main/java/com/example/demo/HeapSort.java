package com.example.demo;

import java.util.Arrays;

public class HeapSort {

	public void sort(int[] arr, int n) {
		for (int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		Arrays.stream(arr).forEach(i->System.out.print(i+" =>"));
		System.out.println();
		for (int i = n - 1; i >= 0; i--) {  
	        /* Move current root element to end*/  
	        // swap a[0] with a[i]  
	        int temp = arr[0];  
	        arr[0] = arr[i];  
	        arr[i] = temp;  
	          
	        heapify(arr, i, 0);  
	    }  
	}
	public void swap(int[] arr, int i, int j) {
		int temp = arr[j];
		arr[j]=arr[i];
		arr[i]= temp;
	}
	 void heapify(int a[], int n, int i)  
	{  
	  int largest = i;
	  int left = 2*i+1;
	  int right = 2*i+2;
	  if(left < n && a[left]>a[largest]) {
		  largest = left;
	  }
	  if(right< n && a[right]>a[largest]) {
		  largest = right;
	  }
	  if(i!=largest) {
		  swap(a, i, largest);
		  heapify(a, n, largest);
	  }
	  
	}  

	public static void main(String[] args) {
		 int a[] = {81,89,9,11,14,76,54,22};  
		HeapSort heapSort = new HeapSort();
		heapSort.sort(a, a.length);
		Arrays.stream(a).forEach(i->System.out.print(i+" =>"));
		System.out.println();
	}
}
