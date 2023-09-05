package com.medium.singleton;

public class EarlyInstantiation {

	private static EarlyInstantiation early = new EarlyInstantiation();
	
	private EarlyInstantiation() {
		// private Constructor
	}
	
	public static EarlyInstantiation getEarlyInstantiation() {
		return early;
	}
}
