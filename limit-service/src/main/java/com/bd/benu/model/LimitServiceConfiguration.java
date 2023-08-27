package com.bd.benu.model;

public class LimitServiceConfiguration {

	private int minimum;
	private int maximum;
	
	public LimitServiceConfiguration() {
		super();
	}

	public LimitServiceConfiguration(int minimum, int maximum) {
		super();
		this.minimum = minimum;
		this.maximum = maximum;
	}

	public int getMinimum() {
		return minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}

	@Override
	public String toString() {
		return "limitServiceConfiguration [minimum=" + minimum + ", maximum=" + maximum + "]";
	}
	
	
}
