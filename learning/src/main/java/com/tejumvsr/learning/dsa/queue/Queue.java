package com.tejumvsr.learning.dsa.queue;

public class Queue {

	int queue[] = new int[5];
	int size;
	int front;
	int rear;
	
	public void enqueue(int data) {
		size++;
		queue[rear] = data;
		rear = (rear + 1) % 5;
	}
	
	public int dequeue() {
		size--;
		int data = queue[front];
		front = (front + 1) % 5;
		return data;
	}
	
	public void show() {
		System.out.println("Elements : ");
		
		for (int i = 0; i < size; i++) {
			System.out.print(queue[((front+i)%5)] + ", " );
		}
		System.out.println();
		for (int i : queue) {
			System.out.print(i + ", ");
		}
		System.out.println();
	}
	
	public int size() {
		
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
