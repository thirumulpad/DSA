package com.problems;

import java.util.HashMap;
import java.util.Map;

public class EntryTest {

	public static void main(String[] args) {
		int[] integerList = { 1, 2, 5, 2, 5, 2 };
		Map<Entry, Integer> map = new HashMap<Entry, Integer>();
		for (int value : integerList) {
			Entry entry = new Entry(value, 1);
			if (map.containsKey(entry)) {
				count = map.get(entry);
			} else
				arrayList.add(entry);
			System.out.println("value : " + entry.value + " has " + entry.count + "counts");
		}

	}

}
