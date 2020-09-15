package com.searching.linear;

public class DataSetForLinearSearch {

	int[] data;
	int numberTry;

	public DataSetForLinearSearch(int size) {
		data = new int[size];
		for (int i = 1; i <= size; i++) {
			data[i - 1] = i;
		}
		numberTry = 0;
	}

	public int getSize() {
		return data.length;
	}
}
