package com.yingcankeji.architect.observer;

public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		super.subject = subject;
		super.subject.attatch(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String: "
				+ Integer.toBinaryString(subject.getState()));
	}

}
