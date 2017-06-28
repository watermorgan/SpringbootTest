package com.yingcankeji.architect.singleton;

public enum SingletonEnum {
	INSTANCE;
	
	public void showMessage() {
		System.out.println("SingletonEnum showMessage's Method!");
	}
}
