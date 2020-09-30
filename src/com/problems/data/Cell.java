package com.problems.data;

public class Cell {

	public int rowIndex;
	public int columnIndex;
	public Integer distance;

	public Cell(int rowIndex, int columnIndex, Integer newDistance) {
		super();
		this.rowIndex = rowIndex;
		this.columnIndex = columnIndex;
		this.distance = newDistance;
	}

}
