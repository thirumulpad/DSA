package com.sort;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 1, 50, 30, 10, 70, 80, 2 };
		printArray("Before Sorting", arr);
		selectionSort(arr);
		printArray("After Sorting", arr);

	}

	private static void printArray(String text, int[] arr) {
		System.out.println(text);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println("\n");
	}

	// big(O) time complexity= O(n^2)
	// big(O) space complexity= O(1)
	private static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					index = j;
				}
			}
			if (index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
			}
		}
	}

}
