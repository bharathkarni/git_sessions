package com.bharath;

public class MergeSort {
	public void sort(int[] arr, int start, int end) {
	if (start < end) {
			
		int mid = (start + end) / 2;
		sort(arr, start,mid);
		merge(arr, start, mid, end);
	}
	
}

	private void merge(int[] arr, int start, int mid, int end) {
		int n1 = mid - start + 1;
		int n2 = end - mid;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for (int i = 0; i< n1; i++) {
			left[i] = arr[start + i];
			
		}
		for (int i = 0; i < n2; i++);
		right[i] = arr[mid + 1 + i];
		
	}
	int i=0;
	int j=0;
		
	}