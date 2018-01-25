package com.bridgelabz.programs;

import java.util.NoSuchElementException;

public class QueueLinkedList<T> {
		Node rear,front;
		public int size;

		private class Node{
			protected Node next;
			protected T data;
			Node(T data,Node next){
				this.data=data;
				this.next=next;
			}
			public void setData(T data) {
				this.data=data;
			}
			
			public T getData() {
				return data;
			}
			public void setLinks(Node next) {
				this.next=next;
			}
			
			public Node getLinks() {
				return next;
			}
		}

		QueueLinkedList(){
			front=rear=null;
			size=0;
		}

		void insert(T data) {
			Node node = new Node(data, null);
		    if (rear == null)
		    {
		        front = rear = node;
		    }
		    else
		    {
		        rear.setLinks(node);
		        rear = rear.getLinks();
		    }
		size++ ;
		}

		public int getSize() {
			return size;
		}

		public T peek()
		{
		    if (isEmpty())
			{
		        throw new NoSuchElementException("Underflow Exception");
			}
		    return front.getData();
		}

		private boolean isEmpty() {
			return (size==0);
	}
}
