package com.problems;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		    1
//		2 		3
//	4 		5 		6
//7 		8 		9 		10

		// row
		int rowNum = 4;
		// col
		int space = rowNum - 1;
		int counter = 1;

		for (int i = 0; i < rowNum; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(counter + "\t");
				counter++;
			}
			System.out.println("");
		}

	}

}
