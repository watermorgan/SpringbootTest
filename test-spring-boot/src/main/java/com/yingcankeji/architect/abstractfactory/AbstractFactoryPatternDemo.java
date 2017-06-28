package com.yingcankeji.architect.abstractfactory;

import com.yingcankeji.architect.abstractfactory.factory.AbstractFactory;
import com.yingcankeji.architect.abstractfactory.factory.FactoryProducer;
import com.yingcankeji.architect.abstractfactory.interf.Color;
import com.yingcankeji.architect.abstractfactory.interf.Shape;

public class AbstractFactoryPatternDemo {

	public static void main(String[] args) {
		//获取形状工厂
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		//获得颜色工厂
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		Color color1 = colorFactory.getColor("RED");
		color1.fill();
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
		Color color3 = colorFactory.getColor("BLUE");
		color3.fill();
		
	}

}
