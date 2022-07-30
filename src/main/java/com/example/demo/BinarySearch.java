package com.example.demo;

public class BinarySearch {

	int search(int[] arr, int l, int r, int element) {
		int index = -1;

		if (r >= l) {
			int mid = l + (r-l) / 2;
			if (arr[mid] == element) {
				return mid;
			}
			if (arr[mid] > element) {
				return search(arr, l, mid-1, element);
			} else {
				return search(arr, mid+1, r, element);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		BinarySearch binarySearch = new BinarySearch();
		int index = binarySearch.search(arr, 0, arr.length - 1, 60);
		System.out.println(index);
	}

}
