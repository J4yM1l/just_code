package com.datastructure.linkedList.Impl;

//import java.text.DecimalFormat;
import java.util.LinkedList;

public class MyLinkedListDemo {

	public static void main(String[] args) {
		MyLinkedListImpl<String> ll = new MyLinkedListImpl<String>();
		MyLinkedListImpl<Integer> ll1 = new MyLinkedListImpl<Integer>();
		LinkedList<Integer> test = new LinkedList<Integer>();
//		test
//		DecimalFormat df= new DecimalFormat("#.##");		
		System.out.println(ll.addFirst("F"));//first in last out
//		System.out.println(ll1.addFirst(1));
		System.out.println(ll.addFirst("E"));
//		System.out.println(ll1.addFirst(2));
		System.out.println(ll.addFirst("D"));
//		System.out.println(ll1.addFirst(3));
		System.out.println(ll.addFirst("C"));
//		System.out.println(ll1.addFirst(4));
		System.out.println(ll.addFirst("B"));//last in first out
//		System.out.println(ll1.addFirst(5));
		System.out.println(ll.addAtPosition(2,"A"));
//		System.out.println(ll1.addAtPosition(6,6));
		System.out.println(ll.addAtEnd("Z"));
//		System.out.println(ll1.addAtEnd(7));		
		
		ll.printListData();
//		System.out.println("===============");
//		ll1.printListData();
//		System.out.println("Removing 3 items");
//		System.out.println("===============");
//		System.out.println(ll.remove());
//		System.out.println(ll.remove());
//		System.out.println(ll.remove());
//		System.out.println(ll1.remove());
//		System.out.println(ll1.remove());
		
//		System.out.println("Printing result");
//		ll.printListData();
//		System.out.println("===============");
//		ll1.printListData();
	}

}
