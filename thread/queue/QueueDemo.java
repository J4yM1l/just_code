package com.datastructure.thread.queue;

import com.datastructure.thread.queue.exceptions.ItemNotAvailableException;

public class QueueDemo {

	public static void main(String[] args) {
		int size = 5;
		QueueImpl que = new QueueImpl(size);
//		MyQueue<String> myQue = new MyQueue<String>();
//		myQue.add("p0");
//		myQue.add("p1");
//		myQue.add("p2");
//		myQue.add("p3");	
				
//					try {
//						System.out.println(myQue.getIndex(10));
//					} catch (ItemNotAvailableException e) {							
//						System.out.println(e.getMessage());
////						e.printStackTrace();
//					}
//					try {
//						System.out.println(myQue.getIndex(-1));
//					} catch (ItemNotAvailableException e1) {
//						System.out.println(e1.getMessage());
//						e1.printStackTrace();
//					}				
//				System.out.println(myQue.getIndex(0));
//				System.out.println(myQue.getIndex(2));
//				System.out.println(myQue.getIndex(3));			
			
		//adding to the queue
//			myQue.add("p0");
//			myQue.add("p1");
//			myQue.add("p2");
//			myQue.add("p3");
//			myQue.add("p4");
//			myQue.add("p5");
//			myQue.add("p6");
//			myQue.add("p7");
//			myQue.add("p8");
//			myQue.add("p9");
//			myQue.add("p10");
					
		//removing data 
//		System.out.println("Item 1 removed from the que "+myQue.remove());
//		System.out.println("Item 2 removed from the que "+myQue.remove());
//		System.out.println("Item 3 removed from the que "+myQue.remove());
//		System.out.println("Item 4 removed from the que "+myQue.remove());
//		System.out.println("Item 5 removed from the que "+myQue.remove());
//		System.out.println("Item 6 removed from the que "+myQue.remove());
					
//					try {
//						System.out.println(myQue.getIndex(0));
//					} catch (ItemNotAvailableException e2) {
//						System.out.println(e2.getMessage());
////						e.printStackTrace();
//					}
//					try {
//						System.out.println(myQue.getIndex(1));
//					} catch (ItemNotAvailableException e3) {
//						System.out.println(e3.getMessage());
//						e.printStackTrace();
//					}								
//					System.out.println(myQue.getIndex(5));								
//					System.out.println(myQue.getIndex(6));				
//					System.out.println(myQue.getIndex(9));					
					
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName()+ " thread started");
		MyProcessor t0 = new MyProcessor(que, size);
		Thread t1 = new Thread(new MyProcessor(que, size), "MSWord");
		Thread t2 = new Thread(new MyProcessor(que, size), "Adobe");
		Thread t3 = new Thread(new MyProcessor(que, size), "WhatsApp");
		Thread t4 = new Thread(new MyProcessor(que, size), "Itunes");
		System.out.println("Starting t0");
		
		
		
		try {
			que.add(t1.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();	
		
		try {
			que.add(t2.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();		
		
		try {
			que.add(t3.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t3.start();
		
		try {
			que.add(t4.getName());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start();
		
		
//		Random rand = new Random();
//		int val;
		
//		for(int i = 0; i<6; i++) {
//			val = rand.nextInt(6)+5;
//			System.out.println("Adding to the queue ");
//			Thread t = "t"+i;
//			que.add("t"+i);						
//		}
		// wait for threads to end
//        try {
//        t1.join();
//        t2.join();
//        t3.join();
//        t4.join();
//     } catch ( Exception e) {
//        System.out.println("Interrupted");
//     }
		
//		synchronized (que) {
//
//			if (que.isFull()) {
//				System.out.println("Queue is full with MaxCapacity: " + que.size() + "\n"
//						+ Thread.currentThread().getName() + " is waiting ");
//				 t1.wait(1000);
//
//			}
//
//			System.out.println("t1 notify");
//			 t1.notify();
//
//		}
		

//		que.peekFront();
//		que.remove();
		// que.remove();
		// que.peek();

		// que.remove();

	}

	// System.out.println("Finished thread initialization");
	// System.out.println ("pi1 = " + mt1.result);
	// System.out.println ("pi2 = " + mt2.result);
	// System.out.println ("pi3 = " + mt3.result);
	// in.close();

}
