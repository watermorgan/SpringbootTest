package com.yingcankeji.architect.abstractfactory.imp;

import com.yingcankeji.architect.abstractfactory.interf.Color;

public class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Inside Red::fill() method.");
	}

}
