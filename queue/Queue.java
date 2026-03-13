package queues;

import java.util.EmptyStackException;

public class Queue <E>{
	private Node <E> front;
	private Node <E> rear;
	int size = 0;
	
	public boolean isEmpty() {
		return front == null;
	}
	public int size() {
		return size;
	}
	
	public void enqueue (E value) {
		Node <E> newNode = new Node <>(value);
		if (front == null) {
			front = rear = newNode; size++;
		}
		else { rear.next = newNode;
		rear = newNode;
		size++;
		}
	}
	
	public E dequeue() {
		if (isEmpty()) throw new RuntimeException("Queue is Empty");
		E value = front.value;
		front = front.next;
		if (front == null) rear = null;
		size--;
		return value;
	}
	
	public E peek() {
		if (isEmpty()) throw new RuntimeException("Queue is Empty");
		return front.value;
		
	}
	public class Stack <E> {
		private Node  <E> top;
		
		public void push(E value) {
			Node <E> newNode = new Node<>(value);
			newNode.next = top;
			top = newNode;
		}
		public E pop() {
			if (isEmpty()) throw new EmptyStackException();
			E value = (E) top.value;
			top = top.next;
			return value;
		}
		public E peek() {
			if (isEmpty()) throw new EmptyStackException();
			return top.value;
		}
		public boolean isEmpty() {
			return top == null;
		}
		

	}


}
