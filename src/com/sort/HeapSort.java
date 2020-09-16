package com.sort;

public class HeapSort {

	public static int total;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = { 1, 50, 30, 10, 70, 80, 2 };
		printArray("Before Sorting", arr);
		heapSort(arr);
		printArray("After Sorting", arr);

	}

	private static void printArray(String text, Integer[] arr) {
		System.out.println(text);
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
		System.out.println("\n");
	}

	private static void heapify(Comparable[] array, int i) {
		int lft = i * 2;
		int rgt = i * 2 + 1;
		int grt = i;

		if (lft <= total && array[lft].compareTo(array[grt]) >= 0)
			grt = lft;
		if (rgt <= total && array[rgt].compareTo(array[grt]) >= 0)
			grt = rgt;
		if (grt != i) {
			swap(array, i, grt);
			heapify(array, grt);

		}
	}

	private static void swap(Comparable[] array, int a, int b) {
		Comparable temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	private static void heapSort(Comparable[] array) {
		total = array.length - 1;
		for (int i = total / 2; i >= 0; i--)
			heapify(array, i);
		for (int i = total; i >= 0; i--) {
			swap(array, 0, i);
			total--;
			heapify(array, 0);
		}
	}
}
