package com.problems.data;

import java.util.ArrayList;
import java.util.List;

public class Staircase {

	public int number;
	public List<Integer> visited = new ArrayList<Integer>();

	public Staircase(int number, List<Integer> visited) {

		this.number = number;
		this.visited.addAll(visited);
		this.visited.add(this.number);
	}

}
