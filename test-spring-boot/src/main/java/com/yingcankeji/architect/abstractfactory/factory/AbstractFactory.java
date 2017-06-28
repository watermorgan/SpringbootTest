package com.yingcankeji.architect.abstractfactory.factory;

import com.yingcankeji.architect.abstractfactory.interf.Color;
import com.yingcankeji.architect.abstractfactory.interf.Shape;

public abstract class AbstractFactory {

	public abstract Color getColor(String colorType);
	public abstract Shape getShape(String shapeType);

}
