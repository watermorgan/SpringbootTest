package com.yingcankeji.architect.bridge;

public class BridgePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Shape redCircle = new Circle(100, 100, 10, new RedCircle());
		Shape greenCircle = new Circle(100, 100, 10, new GreenCircle());
		
		redCircle.draw();
		greenCircle.draw();
		
		Shape purpleSquare = new Square(150, 130, new PurpleSquare());
		Shape blueSquare = new Square(140, 160, new BlueSquare());
		
		purpleSquare.draw();
		blueSquare.draw();
	}

}
