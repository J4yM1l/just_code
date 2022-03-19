package com.datastructure.thread.queue;

public class QueueImpl {
	private int front, count, maxCap, back; 
	private Object arr[];

	public QueueImpl(int size) {
		arr = new Object[size];
		maxCap = size;
		front = 0;
		back = -1;
		count = 0;
	}

	public QueueImpl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void add(Object item) throws InterruptedException {
		if (isFull()) {
			System.out.println("Cannot add to the queue");
			throw new InterruptedException("Queue is full");

		} else {
//			System.out.println("Adding element " + item + " to the que");
			back = (back + 1) % maxCap;
			arr[back] = item;
			// System.out.println("Added item "+ arr[back] +" to the que");
			count++;
		}

	}

	public Object remove() {
		Object obj = null;
		if (isEmpty()) {
			System.out.println("Queue is empty..Cannot remove from the queue");

		} else {
			System.out.println("Removing " + arr[front] + " from the queue");
			obj = arr[front];
			front = (front + 1) % maxCap;
			count--;
		}
		return obj;
	}

	public boolean isFull() {
		return (size() == maxCap);
	}

	public boolean isEmpty() {
		return (size() == 0);
	}

	public int size() {
		return count;
	}

	public void peekFront() {
		if (isEmpty()) {
			System.out.println("No element in the queue");
		} else {
			System.out.print("peeked top value: ");
			System.out.println(arr[front]);
		}
	}

	public void peekBack() {
		if (isEmpty()) {
			System.out.println("No element in the queue");
		} else {
			System.out.print("peeked top value: ");
			System.out.println(arr[back]);
		}
	}

}
