package com.bd.benu.model;

public class limitServiceConfiguration {

	private int minimum;
	private int maximum;
	
	public limitServiceConfiguration() {
		super();
	}

	public limitServiceConfiguration(int minimum, int maximum) {
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
