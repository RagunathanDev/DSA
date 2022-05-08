package com.queue;

public class CircularQueue {

	private int front, rear, capacity;
	private int queue[];

	public CircularQueue(int size) {
		this.capacity = size;
		this.front = -1;
		this.rear = -1;
		this.queue = new int[size];
	}

	private boolean isFull() {
		return ((front == 1 && rear == capacity - 1) || front == rear + 1);
	}

	private boolean isEmpty() {
		return front == -1;
	}

	private void enqueue(int element) {
		if (isFull()) {
			System.out.println("Queue is full");
		} else {
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % capacity;
			queue[rear] = element;
			System.out.println("Element has inserted into Queue: " + element);
		}
	}

	private void dequeue() {
		int element;
		if (isEmpty()) {
			System.out.println("Queue is empty");
		} else {
			element = queue[front];
			if (front == rear) {
				front = -1;
				rear = -1;
			} else {
				front = (front + 1) % capacity;
			}
			System.out.println(element);
		}

	}

	private void printCircularQueue() {
		if (front == -1 && front == -1) {
			System.out.println("Queue is empty ..");
		} else {
			System.out.println();
			System.out.print("Queue elements are :: ");
			for (int i = front; i != rear; i = (i + 1) % capacity) {
				System.out.print(queue[i]);
			}

		}
	}

	public static void main(String[] args) {
		CircularQueue cQueue = new CircularQueue(5);
		cQueue.enqueue(1);
		cQueue.enqueue(2);
		cQueue.enqueue(3);
		cQueue.enqueue(4);
		cQueue.enqueue(5);

		cQueue.dequeue();
		cQueue.dequeue();
		

		cQueue.enqueue(6);
		cQueue.enqueue(7);
		cQueue.printCircularQueue();

	}

}
