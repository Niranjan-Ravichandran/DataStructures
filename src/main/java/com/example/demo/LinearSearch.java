package com.example.demo;

public class LinearSearch {
	
	public int search(int[] arr, int element) {
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==element) {
				index = i;
				break;
			}
		}
		
		return index;
	}

	public static void main(String[] args) {
		int[] arr = {10, 80, 30, 90, 40, 50, 70};
		LinearSearch linearSearch = new LinearSearch();
		int index = linearSearch.search(arr,50);
		System.out.println(index);
	}
}
