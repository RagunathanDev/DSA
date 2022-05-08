package com.stack;

public class StackImplementation {

	private int capacity; // Capacity of the stack
	private int arr[]; // Array Stack
	private int top; // Indicate top element of the stack

	// Constructor
	StackImplementation(int size) {
		this.capacity = size;
		this.arr = new int[size];
		this.top = -1;
	}

	// Add element from stack
	public void push(int element) {

		if (isStackFull()) {
			System.out.println("Stack capacity full");
			System.exit(0);
		}

		arr[++top] = element;
		System.out.println("Inserting Element :" + element);
	}

	// Remove element from stack
	public void pop() {
		if (isStackEmpty()) {
			System.out.println("Stack is Empty");
		}
		System.out.println("Element removed from Stack : " + arr[--top]);

	}

	// Check Stack Capacity full
	public boolean isStackFull() {
		return top == capacity - 1;
	}

	// Check Stack Capacity empty
	public boolean isStackEmpty() {
		return top == -1;
	}

	// Print all element in stack
	public void printStack() {
		System.out.print("Stack elements :");
		for (int i = 0; i < top; i++) {
			System.out.print(" " + arr[i]);
		}

//		for (int element : arr) {
//			System.out.println("Stack Element : " + element);
//		}
	}

	public static void main(String[] args) {

		StackImplementation stack = new StackImplementation(5);

		// Add Element From Stack
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);

		// Remove Element From Stack
		stack.pop();

		//Print element from stack
		stack.printStack();

	}
}
