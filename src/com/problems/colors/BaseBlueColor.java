package com.problems.colors;

public class BaseBlueColor implements IColor {

	String baseColor;

	public BaseBlueColor() {
		this.baseColor = "Blue";
	}

	@Override
	public String retrieveColor() {
		return this.baseColor;
	}

}
