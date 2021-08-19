package com.bfxy.disruptor.quickstart;

public class OrderEvent {

	private long value; //订单的价格

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}
	
}
