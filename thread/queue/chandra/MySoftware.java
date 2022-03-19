package com.datastructure.thread.queue.chandra;


public class MySoftware extends Thread {

	private String name;
	
	public MySoftware(String name) {	
		super(name);
		this.name = name;
		
	}
	
	@Override
	public void run() {
		System.out.println("program running: "+name);
	}


	
	
	
}
