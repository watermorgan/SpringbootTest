package com.yingcankeji.architect.strategy;

public class OperationAdd implements Strategy {

	@Override
	public int doOpertation(int num1, int num2) {
		return num1 + num2;
	}

}
