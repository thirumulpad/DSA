package com.problems.data;

import java.util.ArrayList;
import java.util.List;

public class GCity {

	public int rowIndex;
	public int columnIndex;
	public List<Integer> listOfCities;

	public GCity(int rowIndex, int columnIndex, List<Integer> listOfCities) {
		this.rowIndex = rowIndex;
		this.columnIndex = columnIndex;
		this.listOfCities = new ArrayList<Integer>();
		if (listOfCities != null)
			this.listOfCities.addAll(listOfCities);
		this.listOfCities.add(columnIndex);
	}

}
