
package com.datastructure.thread.queue;

public class Consumer implements Runnable {
	int [] arr;
	
	
	public Consumer(int[] arr) {
		super();
		this.arr = arr;
	}

	public void run() {
		while (true) {
			try {
				consume();
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void consume() throws InterruptedException {
		synchronized (arr) {
			while (arr.length==0) {
				System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: "
						+ arr.length);
				arr.wait();
			}
			Thread.sleep(1000);
			int i = (Integer) arr[0];
			System.out.println("Consumed: " + i);
			arr.notifyAll();
		}
	}
	
//	public void run ()
//	   {
//		int max = 0;
//		while(max< que.length) {
//			try {
//			System.out.println("Adding to the queue: "+ max);
//			add(max++);
//			
//			}catch(InterruptedException ex) {
//				ex.getStackTrace();
//			}
//		}
//		
//		while(max > 0) {
//			try {
//			System.out.println("Removing from the queue: "+ (max-1));
//			remove(max--);
//			
//			}catch(InterruptedException ex) {
//				ex.getStackTrace();
//			}
//		}
//	    	  
//		   
//	   }
	
//	public void add(int val) throws InterruptedException {
//		System.out.println("B4 sync: " + val);
//		synchronized (que) {
//			System.out.println("After sync: "+val+" " + (que.length-1));
//			while(val==(que.length-1)) {
//				 System.out.println("Queue is full " + Thread.currentThread().getName() + " is waiting , size: " + val);
//				 que.wait(1000);
//				 break;
//			}
//			System.out.println("B4 Sleep: " + val);
//			Thread.sleep(1000);
//			que[val] = val;
//	        System.out.println("Added: " + que[val]);
//	        que.notifyAll();
//			
//		}
//		System.out.println("Res: "+res);
//	}
	
//	public void remove(int val2) throws InterruptedException {
//		int newVal = val2;
//		System.out.println("B4 sync: " + val2);
//		synchronized (que){ 
//			
//			while ((val2-1) == 0) { 
//			System.out.println("Queue is empty " + Thread.currentThread().getName() + " is waiting , size: " +	(val2-1)); 
//			que.wait(1000); 
//			break;
//		}
			
//		Thread.sleep(1000); 
//		int i = que[(val2-1)]; 
//		System.out.println("Removed: " + i);
//		que.notifyAll(); 
//	}
//}

}
