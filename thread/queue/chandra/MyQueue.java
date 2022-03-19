package com.datastructure.thread.queue.chandra;

public class MyQueue<T> {

		private int front = 0;
	private int back = -1;
	private int max = 10;
	private int count = 0;
	private Object[] programs = new Object[max];
	
	public MyQueue(int size) {
		max = size;
	}
	
}
