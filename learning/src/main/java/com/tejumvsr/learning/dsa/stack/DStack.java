package com.tejumvsr.learning.dsa.stack;

public class DStack {
	int capacity = 2;
	private int stack[] = new int[capacity];
	private int top = -1;

	public void push(int data) {
		System.out.println("Size : " + size() + " capacity : " + capacity);
		if (size() == capacity) {
			expand();
		}
		stack[++top] = data;
	}

	public int pop() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
//		top--;
		int data = stack[top];
		stack[top--] = 0;
		System.out.println("Popped item : " + data);
		shrink();
		return data;
	}

	public int peek() {
		if (this.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		System.out.println("top item : " + stack[top]);
		return stack[top];
	}

	public void show() {
		for (int i : stack) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	private void expand() {
		int newCapacity = 2 * capacity;
		int newStack[] = new int[newCapacity];

		for (int i = 0; i < capacity; i++) {
			newStack[i] = stack[i];
		}
		stack = newStack;
		capacity = newCapacity;
	}
	
	private void shrink() {
		int length = size();
		
		if(length <=(capacity /4)) {
			capacity = capacity/2;
			int newStack[] = new int[capacity];
			for (int i = 0; i < length; i++) {
				newStack[i] = stack[i];
			}
			stack = newStack;
		}
	}

}
