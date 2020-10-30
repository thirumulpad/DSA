package com.problems;

import java.util.ArrayList;
import java.util.List;

public class FibonacciSeries {
	public static void main(String[] args) {
		// 10 entries ...
		// 1, 1, 2, 3, 5, 8, 13, 21 ...

		printFibonacchi(10);
	}

	private static void printFibonacchi(int count) {
		int currentLevel = 0;
		int previousLevel = 0;
		List<Integer> fiboList = new ArrayList<Integer>();
		for (int i = 0; i < count; i++) {
			if (i == 0 || i == 1) {
				fiboList.add(1);
			} else {
				currentLevel = fiboList.get(i - 1);
				previousLevel = fiboList.get(i - 2);
				currentLevel = currentLevel + previousLevel;
				fiboList.add(currentLevel);
			}
		}
		System.out.println(">>> " + fiboList);
	}

}
