package com.yingcankeji.architect.singleton;

public class Singleton {

	// private static Singleton instance;
	// private Singleton (){}
	// public static synchronized Singleton getInstance() {
	// if (instance == null) {
	// instance = new Singleton();
	// }
	// return instance;
	// }
	
//	private volatile static Singleton singleton;
//
//	private Singleton() {
//	}
//
//	public static Singleton getSingleton() {
//		if (singleton == null) {
//			synchronized (Singleton.class) {
//				if (singleton == null) {
//					singleton = new Singleton();
//				}
//			}
//		}
//		return singleton;
//	}
	
	private static class SingletonHolder {
		private static final Singleton INSTANCE = new Singleton();
	}

	private Singleton() {
	}

	public static final Singleton getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
