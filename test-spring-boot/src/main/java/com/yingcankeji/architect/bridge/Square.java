package com.yingcankeji.architect.bridge;

public class Square extends Shape {
	
	private int length,width;

	public Square(int length, int width ,DrawAPI drawAPI) {
		super(drawAPI);
		this.length = length;
		this.width = width;
	}

	@Override
	public void draw() {
		drawAPI.drawSquare(length, width);
	}

}
