package com.problems;

import java.util.LinkedList;
import java.util.Queue;

import com.problems.data.Cell;

public class ShortestPath {

	public static void main(String[] args) {

		int[][] grid = {{ 1, 1, 1, 1, 0 }, 
						{ 0, 0, 0, 1, 0 },
						{ 0, 0, 1, 1, 0 },
						{ 1, 1, 9, 1, 0 } };
		printGrid(grid);
		Queue<Cell> myQueue = new LinkedList<Cell>();
		move(myQueue, grid, 0, 0, 0);

		while (!myQueue.isEmpty()) {

			Cell currentCell = myQueue.poll();
			// left
			move(myQueue, grid, currentCell.rowIndex - 1, currentCell.columnIndex, currentCell.distance + 1);
			// right
			move(myQueue, grid, currentCell.rowIndex + 1, currentCell.columnIndex, currentCell.distance + 1);
			// top
			move(myQueue, grid, currentCell.rowIndex, currentCell.columnIndex - 1, currentCell.distance + 1);
			// bottom
			move(myQueue, grid, currentCell.rowIndex, currentCell.columnIndex + 1, currentCell.distance + 1);

		}
	}

	private static void printGrid(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				System.out.print(grid[i][j] + "\t");
			}
			System.out.println("");
		}
	}

	private static void move(Queue<Cell> myQueue, int[][] grid, int newRow, int newCol, int distance) {

		if (newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length) {
			if (grid[newRow][newCol] == 1) {
				myQueue.add(new Cell(newRow, newCol, distance));
				grid[newRow][newCol] = -1;
			} else if (grid[newRow][newCol] == 9) {
				System.out.println(distance);
			}
		}
	}
}
