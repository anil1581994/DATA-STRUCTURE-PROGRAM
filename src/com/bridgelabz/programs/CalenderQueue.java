package com.bridgelabz.programs;
import java.util.Scanner;

class linkedQueue1 // Queue class ..
	 {
		  Node rear,front;
		  int size,month,year;
	      private class Node //linkedList class..implment via node
	      {
		         int data;
		         String weekDay;
		         Node next;
	      }

	    public linkedQueue1() 
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
		}else 
		{
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
		   if(size==0)
		   {
			   System.out.print("Empty String");
			   return;
		   }
		   
		Node tempNode = front;
		while(tempNode!=null)
		{
			System.out.print(tempNode.data+"-->"+tempNode.weekDay);
			System.out.println();
			tempNode=tempNode.next;
		}
		   
		   
		  
	   }
	 }
	 public class CalenderQueue 
	 {

			public static void main(String[] args) 
			{
				
				linkedQueue1 day = new linkedQueue1();
				
				Scanner scanner = new Scanner(System.in);
		        String[] months = {"","January", "February", "March","April", "May", "June",
		            "July", "August", "September","October", "November", "December"};
		      
		        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		        System.out.println("Enter the month and year..........");
		    	int mon = scanner.nextInt();
		        int year = scanner.nextInt();
		        if (mon == 2 && isLeapYear(year)) 
		        {
		        	days[mon] = 29;
		        }
		        System.out.println("   " + months[mon] + " " + year);
		        String str[]= {"","Sun","Man","Tue","Wen","Thus","Fri","Sat"};
		      
		      
		        int d = dayInMonth(mon, 1, year);//starting day of month
		       
		        int k=1;
		        for (int i = 1; i <= days[mon]; i++)//for month
		        {
		        	day.insert(i, str[k]);//insert weekday object as param and start day month
		        	
		        	k++;
		            if (((i + d) % 7 == 0) || (i == days[mon]))
		            {
		            k=1;
		            }
		        }
		       day.display();
		        //print calender
		      for (int i = 0; i < d; i++)
		        System.out.print("  ");
		        System.out.println("S   M  T  W  T  F  S");
		            for(int i=1;i<=days[mon];i++) {
					    System.out.printf("%2d ",i);
					 if (((i + d) % 7 == 0) || (i == days[mon]))
			            	System.out.println();		 
				}
		        scanner.close();  
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


