package com.yingcankeji.architect.vistor;

public class VisitorPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}

}
