package com.yingcankeji.architect.bridge;

public class BlueSquare implements DrawAPI {

	@Override
	public void drawCircle(int radius, int x, int y) {

	}

	@Override
	public void drawSquare(int length, int width) {
		System.out.println("Drawing Square[ color: blue, width: " + width
				+ ", length: " + length +"]");
	}

}
