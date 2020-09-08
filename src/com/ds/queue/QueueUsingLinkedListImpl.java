package com.ds.queue;

public class QueueUsingLinkedListImpl {

	public static void main(String[] args) {
		QueueUsingLinkedList<String> queue = new QueueUsingLinkedList<String>();
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
