package com.bridgelabz.programs;

public class LinkedListProg {
	  private Node head;
	   private int size;
	public Node getHead() 
	{
		return head;
	}

	public void setHead(Node head)
	{
		this.head = head;
	}

	public int getSize() 
	{
		return size;
	}

	public void setSize(int size)
	{
		this.size = size;
	}

	private class Node 
	{
		private String data;
		private Node next;

		Node() 
		{
			data = null;
			next = null;

		}
	}

	public LinkedListProg() 
	{
		head = null;
		size = 0;
	}

	public void add(String search)
	{
		Node temp = new Node();
		temp.data = search;
		temp.next = head;
		head = temp;

	}

	public String printList() 
	{
		Node temp = head;
		String result = "";
		while (temp != null)
		{
			result = result + temp.data + " ";
			temp = temp.next;
		}
		return result;
	}

	public int size() 
	{
		return size;
	}

	public String removeNode(String search)
	{
		
		// If linked list is empty
		if (head == null)
			return null;

		// Store head node
		Node temp = head;
		Node prev = head;
		boolean found = false;//if found
		String allList = null;

		// If head needs to be removed
		// when a node contain single elements
		if (head.data.equals(search)) 
		{
			head = temp.next; // Change head
			return null;
		}

		// Loop To remove the Elements from linked list
		while (temp != null) 
		{
			//System.out.println("Temp----->" + temp.data);
			if (temp.data.equals(search))
			{
				prev.next = temp.next;
				found = true;
				break;
			} else 
			{
				prev = temp;
				temp = temp.next;
			}
		}

		// To get The element of all linked list
		if (found) // element then remove
		{
			allList = printList();
			return allList;
		}
		else //elemnet not found then add
		{
			add(search);
			allList = printList();
			return allList;
	
	    }

	
	}
}
