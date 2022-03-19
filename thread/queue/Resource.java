package com.datastructure.thread.queue;

public class Resource {

	public Resource() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void consume(QueueImpl q, int s) throws InterruptedException {
		int count = 0;
		synchronized (q) {
			while(q.isEmpty()) {
				q.add(count);
				count++;
			}
			
		}
	}

}
