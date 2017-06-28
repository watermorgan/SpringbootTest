package com.yingcankeji.architect.strategy;

public class OperationMultiply implements Strategy {

	@Override
	public int doOpertation(int num1, int num2) {
		return num1 * num2;
	}

}
