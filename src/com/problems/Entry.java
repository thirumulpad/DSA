package com.problems;

import java.util.ArrayList;

public class Entry implements Comparable<Integer> {

	public int value;
	public int count;

	public Entry(int intvalue, int count) {
		this.value = intvalue;
//		this.count = valueCountMap.get(intvalue);
		this.count = count;
	}

	@Override
	public int compareTo(Integer o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
