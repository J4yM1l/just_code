package com.datastructure.thread.queue.chandra;

import com.datastructure.thread.queue.QueueImpl;

public class QueueHandler {
	static QueueImpl queue = new QueueImpl(10);
	
	
	public QueueHandler() {
		this(10);
	}

	public QueueHandler(int size) {
		QueueHandler.queue = new QueueImpl(size);
		
	}
	
	
}
