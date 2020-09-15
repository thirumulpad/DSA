package com.sort;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 1, 50, 30, 10, 70, 80, 2 };
		printArray("Before Sorting", arr);
		bubbleSort(arr);
		printArray("After Sorting", arr);

	}

	private static void printArray(String text, int[] arr) {
		System.out.println(text);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println("\n");
	}

	private static void bubbleSort(int[] arr) {

		int n = arr.length;
		int temp = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
}
