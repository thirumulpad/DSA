package com.problems.colors;

public class BaseRedColor implements IColor {

	String baseColor;

	public BaseRedColor() {
		this.baseColor = "Red";
	}

	@Override
	public String retrieveColor() {
		return this.baseColor;
	}
}
