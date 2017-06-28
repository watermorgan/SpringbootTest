package com.yingcankeji.architect.abstractfactory.factory;

import com.yingcankeji.architect.abstractfactory.imp.Circle;
import com.yingcankeji.architect.abstractfactory.imp.Rectangle;
import com.yingcankeji.architect.abstractfactory.imp.Square;
import com.yingcankeji.architect.abstractfactory.interf.Color;
import com.yingcankeji.architect.abstractfactory.interf.Shape;

public class ShapeFactory extends AbstractFactory {
	@Override
	public Shape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		
		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		} else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		} else if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}
		
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		return null;
	}
}
