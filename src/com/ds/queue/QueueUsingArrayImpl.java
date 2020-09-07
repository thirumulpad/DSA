package com.ds.queue;

public class QueueUsingArrayImpl {

	public static void main(String[] args) {
		QueueUsingArray<String> queue = new QueueUsingArray<String>(4);
		queue.queue("vivek");
		queue.queue("pallavi");
		queue.queue("pratik");
		queue.queue("susmita");
		System.out.println("dequeue : " + queue.dequeue());
		System.out.println("dequeue : " + queue.dequeue());
//		queue.queue("ruchira");
		System.out.println("dequeue : " + queue.dequeue());
		System.out.println("dequeue : " + queue.dequeue());
		System.out.println("dequeue : " + queue.dequeue());
	}

}
