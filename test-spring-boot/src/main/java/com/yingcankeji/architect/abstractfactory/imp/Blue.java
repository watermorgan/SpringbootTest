package com.yingcankeji.architect.abstractfactory.imp;

import com.yingcankeji.architect.abstractfactory.interf.Color;

public class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Blue::fill() method.");
	}

}
