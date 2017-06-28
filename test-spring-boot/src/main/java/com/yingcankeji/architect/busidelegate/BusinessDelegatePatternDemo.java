package com.yingcankeji.architect.busidelegate;

public class BusinessDelegatePatternDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		
		Client client = new Client(businessDelegate);
		client.doTask();
		
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}

}
