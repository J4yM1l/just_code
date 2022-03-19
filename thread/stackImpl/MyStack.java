package com.datastructure.thread.stackImpl;

import java.util.EmptyStackException;

public class MyStack<E> {
	private int top, maxCap, maxSize;
	private Object[] arr;		
	
	public MyStack(int size) {
//		this.arr = (E[]) java.lang.reflect.Array.newInstance((MyStack<?>) type, size);
		this.arr = new Object[size];
		this.top = -1;
		this.maxCap = 0;
		this.maxSize = size;	
		
	}

	public MyStack() {
		this(5);
		
	}
	
	public void push(E item) {
		try {
		if(top==(maxSize-1)) {
			System.out.println("Stack Overflow \nTerminating program.....");
			throw new Exception("Program Terminated");
		}else {
		maxCap++;
		arr[++top] = item;
		System.out.println("Number of items in the stack: "+maxCap);
		System.out.println("Added "+arr[top]+" to the stack");
		}
		}catch(Exception e) {
//			System.out.println(e.getStackTrace());
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
//		Object item = null;
		if(!isEmpty()) {
		maxCap--;
//		item = arr[top--];
//		System.out.println("Popped Item: "+ item);
		return (E) arr[top--];
		}else {
//		System.out.println("Stack underflow ");
			throw new EmptyStackException();
//		return (E) "Stack underflow ";
		}
		
	}
	
	public boolean isFull() {
//		System.out.println("Items added: "+(count));
		return maxCap == maxSize;
		
	}
	
	public boolean isEmpty() {
//		System.out.println("Test: ");
		return maxCap == 0;
		
	}
	
	@SuppressWarnings("unchecked")
	public E peekFront() {
		if (isEmpty()) {
//			System.out.println("No element in the queue");
			throw new EmptyStackException();
		} else {
//			System.out.print("peeked top value: ");
//			System.out.println(arr[top]);
			return (E) arr[top];
		}
	}
	
	public int size() {
		return maxCap;
	}
	
	
	
	
}
