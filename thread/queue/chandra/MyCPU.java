package com.datastructure.thread.queue.chandra;

import com.datastructure.thread.queue.QueueImpl;

public class MyCPU extends Thread {
	
	QueueImpl queue;
	private String name;
	
	public MyCPU(QueueImpl queue, String name) {
		super(name);
		this.queue = queue;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Starting CPU thread......"+ name);
		int count = 0;
		while(true) {
			try {
				System.out.println("CPU process started....");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(!QueueHandler.queue.isEmpty()) {
				MySoftware obj = (MySoftware) QueueHandler.queue.remove();
				System.out.println("Found "+obj.getName()+" program");
				if (obj != null) {
					System.out.println("Starting the program......");
					obj.start();
				}
			}
//			System.out.println("Looking for programs....");
			if(++count > 20) {
				break;
			}
		}
	}
	
	

}
