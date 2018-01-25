package com.bridgelabz.programs;



public class LinkedStack<T> {
Node top;

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

LinkedStack(){
	top=null;
	size=0;
}

void insert(T data) {
	Node node = new Node(data, null);
    if (top == null)
    {
    	top = node;
    }
    else
    {
    	top.setLinks(node);
        top = top.getLinks();
    }
size++ ;
}

public int getSize() {
	return size;
}



public void peek()
{
    if (isEmpty())
	{
       System.out.println("Stack is empty.......");
       return;
	}
}

private boolean isEmpty() {
	return (size==0);
}
}
