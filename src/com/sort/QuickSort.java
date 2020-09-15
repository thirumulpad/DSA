package com.sort;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 1, 50, 30, 10, 70, 80, 2 };
		printArray("Before Sorting", arr);
		quickSort(arr, 0, arr.length - 1);
		printArray("After Sorting", arr);

	}

	private static void printArray(String text, int[] arr) {
		System.out.println(text);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println("\n");
	}
	
	// time complexity O(n^2)
	// space complexity log(n)
	private static void quickSort(int[] arr, int low, int high) {

		if (low > high) {
			return;
		}
		int mid = low + ((high - low) / 2);
		int pivot = arr[mid];

		int i = low;
		int j = high;
		while (i <= j) {
			while (arr[i] < pivot)
				i++;
			while (arr[j] > pivot)
				j--;
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j)
			quickSort(arr, low, j);
		if (high > i)
			quickSort(arr, i, high);
	}

}
