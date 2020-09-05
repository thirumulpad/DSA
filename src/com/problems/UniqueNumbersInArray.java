package com.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UniqueNumbersInArray {

	public static void main(String[] args) {
		int[] array = { 1, 3, 5, 5, 6, 6, 7, 8, 10, 10 };

		List<Integer> listNumber = getUniqueNumbers(array);
		System.out.println(listNumber.toString());

	}

	private static List<Integer> getUniqueNumbers(int[] array) {
		List<Integer> uniqueNumbers = new ArrayList<Integer>();
		Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < array.length; i++) {
			if (null != hashmap.get(array[i])) {
				int frequency = hashmap.get(array[i]);
				frequency = frequency + 1;
				hashmap.put(array[i], frequency);
			} else {
				hashmap.put(array[i], 1);
			}
		}

		for (int key : hashmap.keySet()) {
			if (hashmap.get(key) == 1)
				uniqueNumbers.add(key);
		}
		if (!uniqueNumbers.isEmpty()) {
			return uniqueNumbers;
		}
		return null;
	}

}
