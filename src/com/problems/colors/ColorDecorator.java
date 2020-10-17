package com.problems.colors;

public class ColorDecorator implements IColor {

	String newColor;

	@Override
	public String retrieveColor() {
		// TODO Auto-generated method stub
		return this.newColor;
	}

	public String mixColor(IColor color1, IColor color2) {

		// based on the conditions return the new color
		return newColor;
	}

}
