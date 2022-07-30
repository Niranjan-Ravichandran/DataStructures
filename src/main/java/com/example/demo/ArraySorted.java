package com.example.demo;

public class ArraySorted {
	public int search(int[] arr, int target) {
		int heighest = findHeighestIndex(arr);
		System.out.println("===>" + heighest);
		int count = binarySearch(arr, target, 0, heighest);;
		if (count == -1) {
			count = binarySearch(arr, target, heighest+1, arr.length - 1);
		}
		return count;

	}

	public int findHeighestIndex(int[] nums) {

		int n = nums.length;
		int l = 1, r = n - 1, mid;
		int ans = 0;
		while (l <= r) {
			mid = (l + r) / 2;
			if (nums[mid] >= nums[0]) {
				l = mid + 1;
				ans = mid;
			} else {
				r = mid - 1;
			}
		}
		return ans;
	}

	public int binarySearch(int[] arr, int target, int l, int r) {
		// binary search
		int mid = 0;
		//0 1 2 3 4 5 6 7 8 9
		while (l <= r) {
			mid = (l + r) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				r = mid - 1;
			} else if (arr[mid] < target) {
				l = mid + 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		ArraySorted arraySorted = new ArraySorted();
		int count = arraySorted.search(new int[]{4,5,6,7,0,1,2}, 66);
		System.out.println(count);
	}
}
