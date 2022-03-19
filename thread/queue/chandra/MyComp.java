package com.datastructure.thread.queue.chandra;

import com.datastructure.thread.queue.QueueImpl;

public class MyComp {
	
	public static void main(String[] args) {
		System.out.println("Starting "+ Thread.currentThread().getName());
		//QueueHandler queueHandler = new QueueHandler(10);
		QueueImpl queue = QueueHandler.queue;
		try {
			queue.add("Item 1");
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		MyCPU myCPU = new MyCPU(queue, "CPU");
		myCPU.start();
		
		MySoftware chrome = new MySoftware("Chrome");
		MySoftware eclipse = new MySoftware("Eclipse");
		MySoftware msword = new MySoftware("MsWord");
		MySoftware zoom = new MySoftware("Zoom");		
		try {
			System.out.println("Adding Chrome to queue");			
			queue.add(chrome);
			Thread.sleep(5000);
			System.out.println("Adding Eclipse to queue");
			queue.add(eclipse);
			Thread.sleep(5000);
			System.out.println("Adding Msword to queue");
			queue.add(msword);
			Thread.sleep(5000);
			System.out.println("Adding Zoom to queue");
			queue.add(zoom);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
