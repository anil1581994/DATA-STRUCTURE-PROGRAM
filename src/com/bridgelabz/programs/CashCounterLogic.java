package com.bridgelabz.programs;

import java.util.NoSuchElementException;

public class CashCounterLogic //Queue class implement using linkedlist
{
	public Node front, rear;
    public int size;
 
    private class Node//liked list as inner class as inner class
    {
    	int data;
    	Node next;
    	
    }
		
   
    /* Constructor */
    public CashCounterLogic()
    {
        front = rear = null;//references type
        size = 0;
    }
    
    /*  Function to check if queue is empty */
    public boolean isEmpty()
    {
        return front == null;
    }   
    
    /*  Function to get the size of the queue */
    public int getSize()
    {
        return size;
    }    
    
    /*  Function to insert an element to the queue */
    public void enqueue(int data)
    {
        Node node = new Node();
        node.data=data;
        node.next=null;
        if (rear == null)
        {
            front = rear = node;
        }
        else
        {
            
            rear.next = node;
        }
        size++ ;
    }   
    
    /*  Function to remove front element from the queue */
   	public Object dequeue()
    {
        if (isEmpty())
		{
        	throw new NoSuchElementException("Underflow Exception");
		}
        Node ptr = front;
        front = ptr.next;        
        if (front == null)
		{
            rear =null;
		}   
        size-- ; 
        return ptr.data;
    }    
    
    /*  Function to check the front element of the queue */
    public Object peek()
    {
        if (isEmpty())
		{
            throw new NoSuchElementException("Underflow Exception");
		}
        return front.data;
    }    
    
    /*  Function to display the status of the queue */
    public void display()
    {  
		int ptr1 = 0;//get balance in it
      //  System.out.print("Available Balance = ");
        if (size == 0)//if queue is return 
        {
            System.out.print("Empty");
            return ;
        }
        Node ptr = front;
        while (ptr != rear.next)
        { 
        	ptr1=ptr1 + ptr.data;
        	System.out.println(ptr1);
            ptr = ptr.next;
        }
    }
}
