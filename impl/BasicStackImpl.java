package com.datastructure.impl;

import java.util.Scanner;

public class BasicStackImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int size = 10;
		int [] stack = new int[size];
		int max = 0;
		int strtPos = (size-1);
		System.out.println("Do you wanna add to stack? or -1 to exit");
		int input = in.nextInt();		
		while(input != -1 && max < stack.length) {						
//			max < size
			stack[strtPos] = input;
//			System.out.println("Index "+stack[0]);
			max++;
			strtPos--;
			System.out.println("Do you wanna continue? or -1 to exit");
			input = in.nextInt();
		}
		
		System.out.println("Stack is full! ");
		BasicStackImpl.pop(stack);
//		for(int i: stack) {
//			System.out.println(i);
//		}
		
		in.close();
	}
	
	public static void pop(int[] arr) {
		System.out.println("Elements in Stack "+ arr[0]);
		int size = arr.length;
		int count = 0;
		for (int i = 0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count++;
//				continue;
			}
//			else {
//				int item = arr[i];
//				System.out.println("Item deleted "+ item);
//				arr[i] = 0;
//			}
//			System.out.print(i+", ");
			
		}
		int nxtCnt = count;
		int newArr[] = new int[(size-count)];
		int newArrSize = newArr.length;
		System.out.println("New Array size "+ newArrSize);
		for(int j = 0; j<newArr.length; j++) {
			newArr[j] = arr[nxtCnt];
			int item = newArr[j];
			nxtCnt++;
			System.out.println("New Array value "+ item);
			
		}
	}

}
