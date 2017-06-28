package com.yingcankeji.architect.abstractfactory.factory;

import com.yingcankeji.architect.abstractfactory.imp.Blue;
import com.yingcankeji.architect.abstractfactory.imp.Green;
import com.yingcankeji.architect.abstractfactory.imp.Red;
import com.yingcankeji.architect.abstractfactory.interf.Color;
import com.yingcankeji.architect.abstractfactory.interf.Shape;

public class ColorFactory extends AbstractFactory {

	@Override
	public Color getColor(String colorType) {
		switch (colorType) {
		case "RED":
			return new Red();
		case "GREEN":
			return new Green();
		case "BLUE":
			return new Blue();
		default:
			return null;
		}
	}

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

}
