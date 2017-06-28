package com.yingcankeji.architect.template;

public class TemplatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
		System.out.println();
	}

}
