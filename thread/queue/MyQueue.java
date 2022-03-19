package com.datastructure.thread.queue;

import java.util.EmptyStackException;

import com.datastructure.thread.queue.exceptions.ItemNotAvailableException;

public class MyQueue<E> {
	private int front, count, maxCap, back;
	private Object[] arr;
	
	public MyQueue(int size) {
		arr = new Object[size];
		maxCap = size;
		front = 0;
		back = -1;
		count = 0;	
	}
	public MyQueue() {
		this(10);		
	}
	
	public void add(E item) {
		try {
		if (isFull()) {
			System.out.println("Cannot add to the queue");
			throw new InterruptedException("Queue is full");

		}					
			back = (back + 1) % maxCap;
			arr[back] = item;
			// System.out.println("Added item "+ arr[back] +" to the que");
			count++;						
			System.out.println("Item added to the que: "+item);
		}catch(InterruptedException e0) {
			e0.getMessage();
		}

	}

	@SuppressWarnings("unchecked")
	public E remove() {
		E obj = null;
		if (isEmpty()) {
			System.out.println("Queue is empty..Cannot remove from the queue");	
			throw new EmptyStackException();
		} else {
//			System.out.println("Removing " + arr[front] + " from the queue");
//			System.out.print("Item removed from the que ");
			obj = (E) arr[front];
//			arr[front] = null;
			front = (front + 1) % maxCap;			
			count--;
			return obj;
		}
		
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

	@SuppressWarnings("unchecked")
	public E peekFront() {
		if (isEmpty()) {
			System.out.println("No element in the queue");
			throw new EmptyStackException();
		} else {
			System.out.print("peeked top value: ");
			System.out.println(arr[front]);
			return (E) arr[front];
		}
		
	}

	@SuppressWarnings("unchecked")
	public E peekBack() {
		if (isEmpty()) {
			System.out.println("No element in the queue");
			throw new EmptyStackException();
		} else {
			System.out.print("peeked top value: ");
			System.out.println(arr[back]);
			return (E) arr[back];
		}
	}
//insert 10 data and remove 6 data, and then try to give index from 0-3.
//And u will not retrieve correct value;
	@SuppressWarnings("unchecked")
	public E getIndex(int index) throws ItemNotAvailableException {				
		System.out.println("Index "+index+" Front "+front+ " Back "+back+ " Count "+count);
		if(index < 0 || (index+front) > back) {
//			if(arr[index] != null) {
//		try {			
			throw new ItemNotAvailableException("Index out of bound");		
//		}catch(ItemNotAvailableException e2) {						
//			System.out.println(e2.getMessage());
////			e2.printStackTrace();
//		}
//			}
		}
		
		return (E) arr[index+front];	
		
	}

	
	

}
