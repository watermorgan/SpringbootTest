package com.yingcankeji.architect.interpreter;

public class InterpreterPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedFemaleExpression();

		System.out.println("John is male? " + isMale.interprete("John"));
		System.out.println("Julie is a married women? "
				+ isMarriedWoman.interprete("Single Julie"));
	}

	public static Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	public static Expression getMarriedFemaleExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}

}
