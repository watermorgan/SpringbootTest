package com.yingcankeji.architect.singleton;

public class SingleObject {
	//创建 SingleObject 的一个对象
	private static SingleObject instance = new SingleObject();
	
	private SingleObject(){}
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void showMessage() {
		System.out.println("Singleton-showMessage's Method!");
	}
}
