package com.yingcankeji.architect.abstractfactory.imp;

import com.yingcankeji.architect.abstractfactory.interf.Shape;

public class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
