package com.datastructure.thread.stackImpl;

import java.util.Stack;

public class MyStackImplDemo {

	public static void main(String[] args) {
		MyStack<String> stack = new MyStack<String>();
		Stack<String> stack1 = new Stack<String>();		
//		stack1.push("Test");
//		stack1.push("Stack");
//		stack1.peek();
//		System.out.println("Empty: "+stack1.peek());
//		try {					
			stack.push("Hello");
			stack.push("World");
			stack.push("John");
//			stack.push("Milton");
//			stack.push("James");
//			stack.push("Brown");
//			System.out.print("peeking: ");
//			stack.peekFront();
			System.out.println("Peeked: "+stack.peekFront());
//			stack.peekFront();
			System.out.println("Popped: "+stack.pop());
//			stack.peekFront();				
			System.out.println("Is stack full? "+stack.isFull());//false
			System.out.println("Is stack empty? "+stack.isEmpty());//true
			
//		} catch (Exception e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		

	}

}
