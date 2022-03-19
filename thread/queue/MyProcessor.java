package com.datastructure.thread.queue;

public class MyProcessor implements Runnable {
	
	private QueueImpl que;
	private Thread t;
	private int MaxSize;
	
	public MyProcessor(QueueImpl q, int s) {
		this.que = q;
		this.MaxSize = s;
//		this.t = thr;
		
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		int count = 0;
				
		while(true) {
			try {
				System.out.println("running program "+ Thread.currentThread().getName());
				t = Thread.currentThread();
				processor(t);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
							
	}
	
	public void processor(Thread program) throws InterruptedException {
		synchronized (que) {						
			System.out.println("program to process...... "+ program.getName());
			System.out.println("program to process...... toString"+ this.toString());
			while(que.isEmpty()) {
				System.out.println("CPU idle");
//				System.out.println("Waiting for thread " + ct.getName() + " to complete process ");				
	            que.wait();
			}
			
			System.out.println("Processing program...... "+ program.getName());
//			que.peekFront();
			Thread.sleep(2000);
//			que.wait(2000);
			System.out.print("Processed program...... ");
			que.peekFront();
			removeProcess();
			que.notifyAll();
		}
	}
	
	public void removeProcess() throws InterruptedException {
		
		while(que.isEmpty()) {
			System.out.println("CPU Idle");
			que.wait();
		}
		System.out.print("Program completed processing...... ");
		que.remove();
		que.notifyAll();
	}

}
