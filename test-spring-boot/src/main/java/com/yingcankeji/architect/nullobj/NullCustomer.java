package com.yingcankeji.architect.nullobj;

public class NullCustomer extends AbstractCustomer {
	
	@Override
	public boolean isNil() {
		return true;
	}

	@Override
	public String getName() {
		return "Not Available in Customer Database";
	}

}
