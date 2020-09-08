package com.ds.queue;

public class DynamicArrayQueueImpl {

	public static void main(String[] args) {
		QueueUsingDArray<String> queue = new QueueUsingDArray<String>(2);
		queue.queue("vivek");
		System.out.println(queue.getSize());
		queue.queue("pallavi");
		System.out.println(queue.getSize());
		queue.queue("pratik");
		System.out.println(queue.getSize());
		queue.queue("susmita");
		System.out.println(queue.getSize());
		System.out.println("dequeue : " + queue.dequeue());
		System.out.println(queue.getSize());
		System.out.println("dequeue : " + queue.dequeue());
		System.out.println(queue.getSize());
		queue.queue("ruchira");
		System.out.println(queue.getSize());
		System.out.println("dequeue : " + queue.dequeue());
		System.out.println(queue.getSize());
		System.out.println("dequeue : " + queue.dequeue());
		System.out.println(queue.getSize());
		System.out.println("dequeue : " + queue.dequeue());
		System.out.println(queue.getSize());

	}

}
