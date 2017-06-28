package com.yingcankeji.architect.chainofresponsibility;

public class ChainPatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AbstractLogger loggerChain = getChainOfLoggers();
		
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		System.out.println();
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");

	}
	
	private static AbstractLogger getChainOfLoggers() {
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		
//		errorLogger.setNextLogger(fileLogger);
//		fileLogger.setNextLogger(consoleLogger);
		
		consoleLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(errorLogger);
		
		return consoleLogger;
	}

}
