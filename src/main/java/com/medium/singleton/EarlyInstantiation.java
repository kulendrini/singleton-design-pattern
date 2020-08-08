package com.medium.singleton;

public class EarlyInstantiation {

	private static EarlyInstantiation early = new EarlyInstantiation();
	
	private EarlyInstantiation() {

	}
	
	public static EarlyInstantiation getEarlyInstantiation() {
		return early;
	}
}
