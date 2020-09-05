package com.ds.arrays;

public class TwoDArray {
	
	public static void main(String[] args) {
		
		int[][] data = new int[3][3];
		
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				data[i][j] = i+j;
			}
		}
		for(int i=0; i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(data[i][j] + "\t");
			}
			System.out.println("\n");
		}
	}
	

}
