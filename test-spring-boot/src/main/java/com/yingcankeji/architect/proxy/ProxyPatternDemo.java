package com.yingcankeji.architect.proxy;

public class ProxyPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Image image = new ProxyImage("test_proxy.jpg");

		image.display();

		System.out.println("\n");

		image.display();

	}

}
