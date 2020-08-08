package com.medium.singleton;

public class LazyInstantiation {

	private static LazyInstantiation lazy;
	
	private LazyInstantiation() {

	}
	
	public static LazyInstantiation getLazyInstantiation() {
		if(lazy == null) {
			synchronized (LazyInstantiation.class) {
				if(lazy == null) {
					lazy = new LazyInstantiation();
				}
			}
		}
		return lazy;
	}
}
