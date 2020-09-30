package com.problems;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.problems.data.GCity;

public class TripPlanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = { { 1, 1, 1, 1, 0 }, { 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 0, 1, 0 },
				{ 0, 1, 0, 0, 1 } };
		Queue<GCity> queue = new LinkedList<GCity>();
		// set initial location
		move(grid, queue, 0, 0, null);
		while (!queue.isEmpty()) {
			GCity city = queue.poll();
			// move to the next row
			move(grid, queue, city.rowIndex + 1, city.columnIndex, city.listOfCities);
			// move to the next column and row
			move(grid, queue, city.rowIndex + 1, city.columnIndex + 1, city.listOfCities);
		}

	}

	private static void move(int[][] grid, Queue<GCity> queue, int newRow, int newCol, List<Integer> listOfCities) {
		if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length) {
			if (grid[newRow][newCol] == 1 && newCol == grid[0].length - 1) {
				System.out.println("list of cities visited : " + listOfCities);
				System.exit(0);
			} else if (grid[newRow][newCol] == 1) {
				queue.add(new GCity(newRow, newCol, listOfCities));
				grid[newRow][newCol] = -1;
			}
		}
	}

}
