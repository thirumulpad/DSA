package com.searching.linear;

public class LinearSeach {

	public static void main(String[] args) {
		DataSetForLinearSearch data = new DataSetForLinearSearch(100000);
		int search = 99999;
		for (int i = 0; i < data.getSize(); i++) {
			data.numberTry++;
			if (data.data[i] == search)
				System.out.println("element " + search + " found after " + data.numberTry + " tries");
		}
	}

}
