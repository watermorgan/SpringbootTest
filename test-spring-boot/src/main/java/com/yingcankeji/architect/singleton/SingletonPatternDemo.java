package com.yingcankeji.architect.singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
//		SingleObject singleObject = new SingleObject();
		
//		SingleObject object = SingleObject.getInstance();
//		
//		object.showMessage();
		
		SingletonEnum object2 = SingletonEnum.INSTANCE;
		object2.showMessage();
	}

}
