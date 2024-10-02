package com.tejumvsr.learning.dsa.stack;

import java.util.Iterator;

public class Stack {

	private int[] stack = new int[5];
	private int top = -1;

	public void push(int data) {
		if(this.size() == 4) {
			System.out.println("Stack is full");
			return;
		}
		stack[++top] = data;
	}

	public int pop() {
		if(this.isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		int data = stack[top];
		stack[top--] = 0;
		System.out.println("Popped item : " + data);
		return data;
	}

	public int peek() {
		if(this.isEmpty()) {
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
		return top;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
}

