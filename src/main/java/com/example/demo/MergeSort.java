package com.example.demo;

import java.util.Arrays;

public class MergeSort {
	
	
	public int[] sp(int[] arr, int beg, int end) {
		return Arrays.copyOfRange(arr, beg, end);
	}
	public void display(int[] arr) {
		Arrays.stream(arr).forEach(i->System.out.print(i+" "));
		System.out.println();
	}
	
	public int[] merge(int[] arr, int beg,int mid, int end) {
		int n1 = mid-beg+1;
		int n2 = end-mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for(int i=0;i<n1;i++) {
			left[i]=arr[beg+i];
		}
		for(int j=0;j<n2;j++) {
				right[j] = arr[mid+1+j];	
		}
		int i=0; int j=0; int k = beg;
		while(i<left.length && j<right.length) 
		{
			if(left[i]<right[j]) {
				arr[k] = left[i];
				i++;
				
			}else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while(i<n1) {
			arr[k]= left[i];
			i++;
			k++;
		}
		while(j<n2) {
			arr[k] = right[j];
			j++;
			k++;
		}
		
		return arr;
	}
	
	
	
	public void split(int[] arr,int beg,int end) {
		if(beg<end) {
			int mid = (end+beg)/2;
			split(arr, beg, mid);
			split(arr, mid+1, end);
			merge(arr, beg, mid, end);
			
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {34,12,31,25,8,32,17,40,42};
		MergeSort mergeSort = new MergeSort();
		 mergeSort.split(arr, 0, arr.length-1);
		 Arrays.stream(arr).forEach(System.out::println);
	}

}
