package com.queue;

public class QueueImplementation {

	private int front, rear;
	private int[] queue;
	private int capacity;

	public QueueImplementation(int size) {
		this.front = -1;
		this.rear = -1;
		this.queue = new int[size];
		this.capacity = size;
	}

	// Check capacity is full
	public boolean isFull() {
		return (front == 0 && (rear == capacity - 1));
	}

	// Check capacity is empty
	public boolean isEmpty() {
		return front == -1;
	}

	// Add element into the queue
	public void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1) {
				front = 0;
			}
			queue[++rear] = element;
			System.out.println("Element Inserted into queue " + element);
		}

	}

	// Remove element from the queue
	public void dequeue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty .. please insert the value");
		} else {
			element = queue[front];

			if (front >= rear) {
				front = -1;
				rear = -1;
			} else
				front++;
			System.out.println("Queue element removed : " + element);
		}
	}

	// Iterate over the Queue
	public void printElements() {
		System.out.print("Element in queue : ");
		if (front != -1 && rear != -1) {
			for (int i = front; i <= rear; i++) {
				System.out.print(queue[i] + " ");
			}
		}else {
			System.out.println(" :) Queue is empty");
		}
	}

	public static void main(String[] args) {

		QueueImplementation queueImplementation = new QueueImplementation(2);

		queueImplementation.enqueue(1);
		queueImplementation.enqueue(2);
		queueImplementation.enqueue(3);
		queueImplementation.enqueue(4);

		queueImplementation.dequeue();
		queueImplementation.dequeue();
		queueImplementation.dequeue();

		queueImplementation.printElements();
		
		

	}

}
