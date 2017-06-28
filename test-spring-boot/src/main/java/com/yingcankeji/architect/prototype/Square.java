package com.yingcankeji.architect.prototype;

public class Square extends Shape {

	public Square() {
		type = "Squre";
	}

	@Override
	void draw() {
		System.out.println("Inside Square::draw() method.");
	}

}
