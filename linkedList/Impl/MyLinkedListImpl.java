package com.datastructure.linkedList.Impl;

public class MyLinkedListImpl<T> {
	private Node head = null;
	private int numberOfEntries;
	private Node endNode = null;
	private class Node{
		private Node next;
		private T data;
		
		public Node(T d) {
			this(d, null);			
		}
		
		public Node(T d, Node n) {
			data = d;
			next = n;
		}
	}
	
	//add at the beginning of the list
	public boolean addFirst(T item) {
		
		Node newNode = new Node(item); // creates a new item Node
		newNode.next = head; // newNode.next reference/points to an incoming node
		head = newNode; // the incoming node becomes the current node		
		numberOfEntries++;
		System.out.println("Node "+ numberOfEntries +" "+head.data+" Next Node " +head.next);
		if(numberOfEntries <= 1) {
			endNode = newNode;
//			System.out.println("Last Node "+endNode.data);
		}
		
		return true;
		
	}
	//add to a specific position in the list
	public boolean addAtPosition(int pos, T data) {
		Node newNode = new Node(data);		
		Node tempHead = null;
		Node last = head;
		
		for(int i = 1; i<= pos; i++) {
			
			System.out.println("Node "+i+" "+ last.data);			
			if(last.next == null) {
				System.out.println("End of node or zero pos ");
				addAtEnd(data);
				return false;
			}
				
			if((i+1)== pos) {
				System.out.println("found Node "+(i+1)+" "+ last.next.data);
//				tempHead = tempHead.next;
			tempHead = last;//pos=2 ->tempHead==B
			System.out.println("At position "+pos+ " tempHead=="+tempHead.data);
			last = tempHead.next; //C==last
			System.out.println("last=="+tempHead.next.data);
			System.out.println("Head Node "+tempHead.data);
			System.out.println("Found Node position "+last.data);	
			
				newNode.next = last; //A->C
				System.out.println(newNode.data+ "->"+last.data);
				tempHead.next = newNode; //B->A
				System.out.println(tempHead.data+ "->"+newNode.data);
				numberOfEntries++;
				System.out.println("# of entries "+ numberOfEntries+"\nPrevious Node "+tempHead.data+ 
						"\nNew Node added "+tempHead.next.data+"\nNext Node "+last.data);				
				return true;				
					
				}
			if(i == pos) {
				addFirst(data);
				return true;
			}	
			last = last.next;
								
				
//			}
			
		}			
			return false;									
	}
	
	public boolean addAtEnd(T d) {
		Node lastNode = new Node(d);
		endNode.next = lastNode ;
		endNode = lastNode;
		System.out.println("Last Node "+endNode.data);
		numberOfEntries++;
		return true;
	}
	
	//remove from the beginning of the list
	public T remove() {
		T itemRemoved = null;
		try {
		if(head.next != null) {
			System.out.println("Nxt to Remove "+ head.next.data);
			itemRemoved = head.data;
			head = head.next;
			numberOfEntries--;			
			System.out.println("Removed "+ itemRemoved);
			return itemRemoved;
		}
		
		itemRemoved = head.data;
		head = head.next;
		numberOfEntries--;
		}catch(NullPointerException e) {
		e.printStackTrace();		
		}
		return itemRemoved;		
		
	}
	
	public void printListData() {
		Node currentN = head;		
//		System.out.println("Node: "+currentN.data);
		while(currentN.next != null) {
			System.out.println("Node: "+currentN.data);
			currentN = currentN.next;			
		}
		System.out.println("Node: "+currentN.data);
		
	}

}
