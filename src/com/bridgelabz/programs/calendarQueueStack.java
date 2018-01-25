package com.bridgelabz.programs;
import java.util.Scanner;

 class linkedQueue
 {
	      Node rear,front;
	     int size,month,year;
      private class Node
      {
	         int data;
	         String weekDay;
	         Node next;
      }

    public linkedQueue() 
    {
	rear=front=null;
	size=0;
    }
   void insert(int data,String weekDay)
   {
	Node temp=rear;
	rear=new Node();
	rear.data=data;
	rear.weekDay=weekDay;
	rear.next=null;
	if(isEmpty())
	{
		front=rear;
	}else {
		temp.next=rear;
	}
	size++;
   }

  private boolean isEmpty()
  {
    	return (size==0);
  }

   void display()
   {
	   
	Node tempNode = front;
	while(tempNode!=null)
	{
		System.out.print(tempNode.data+"-->"+tempNode.weekDay);
		System.out.println();
		tempNode=tempNode.next;
	}
  }
}

class stackLink
{
	Node top;
	private class Node
	{
		int data;
		String weekDay;
		Node next;
	}
	
	
	void insert(int data,String weekDay) 
	{
		Node temp=new Node();
		temp.data=data;
		temp.weekDay=weekDay;
		temp.next=top;
		top=temp;
	}
}
public class calendarQueueStack {

	public static void main(String[] args) 
	{
		
		linkedQueue day = new linkedQueue();
		stackLink stack=new stackLink();
		Scanner scan = new Scanner(System.in);
        String[] months = {"","January", "February", "March","April", "May", "June",
            "July", "August", "September","October", "November", "December"};
      
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("Enter the month and year..........");
    	int mon = scan.nextInt();
        int year = scan.nextInt();
        if (mon == 2 && isLeapYear(year)) 
        {
        	days[mon] = 29;
        }
        System.out.println("   " + months[mon] + " " + year);
        String str[]= {"","Sun","Man","Tue","Wen","Thus","Fri","Sat"};
      
      
        int d = dayInMonth(mon, 1, year);
       
        int k=1;
        for (int i = 1; i <= days[mon]; i++)
        {
        	day.insert(i, str[k]);
        	stack.insert(i, str[k]);
        	k++;
            if (((i + d) % 7 == 0) || (i == days[mon])) {
            k=1;
            }
        }
        day.display();
        
        for (int i = 0; i < d; i++)
        System.out.print("  ");
        System.out.println("S   M  T  W  T  F  S");
            for(int i=1;i<=days[mon];i++) {
			    System.out.printf("%2d ",i);
			 if (((i + d) % 7 == 0) || (i == days[mon]))
	            	System.out.println();		 
		}
        scan.close();  
	}
	
	public static int dayInMonth(int month, int day, int year) 
	{
        int y = year - (14 - month) / 12;
        int x = y + y/4 - y/100 + y/400;
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (day + x + (31*m)/12) % 7;
        return d;
    }
	
	  public static boolean isLeapYear(int year) 
	    {
	        if  ((year % 4 == 0) && (year % 100 != 0)|| year % 400 == 0) 
	        	return true;
	        else
	        	return false;
	    }

}
