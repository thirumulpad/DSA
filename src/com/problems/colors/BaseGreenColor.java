package com.problems.colors;

public class BaseGreenColor implements IColor {
	String baseColor;

	public BaseGreenColor() {
		this.baseColor = "Green";
	}

	@Override
	public String retrieveColor() {
		// TODO Auto-generated method stub
		return this.baseColor;
	}
}
