package com.problems;

public class SpiralMatrix {

	public static void main(String[] args) {
		int[][] data = new int[4][4];
		int val =1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				data[i][j] = val;
				val++;
			}
		}
		
		printMatrix(data);

	}

	private static void printMatrix(int[][] data) {
		for(int i=0; i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}

}
