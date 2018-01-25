package com.bridgelabz.utility;

import java.io.BufferedReader;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;


import com.bridgelabz.programs.LinkedListProg;


public  class Utility {
	
	static int i = 0;
	Scanner scanner;
	public Utility() {
	
		scanner = new Scanner(System.in);
	}

	public String getString() {
		return scanner.next();
	}

	public int getInteger() {
		return scanner.nextInt();
	}

	public double getDouble() {
		return scanner.nextDouble();
	}

	public boolean getBoolean() {
		return scanner.nextBoolean();
	}

	public void displayDetails(String Message) {
		System.out.println(Message);
	}
	/*@Discription:search word in file if it is avialable then remove form the file.
	 * @if the word is not available in file append the word in file
	 * @Author:anil patil
	*/
	public static void readWordFromFile() 
	{
	
		// read word from file
		try {
			File file = new File("/home/bridgeit/Desktop/AnilWorkSpace/DataStructure-Programs/src/Files/unOrderedList.txt");

			BufferedReader buffer = new BufferedReader(new FileReader(file));
			Scanner scanner = new Scanner(System.in);
			String words = buffer.readLine();
			System.out.println(words.toString());
			FileWriter fileWriter = new FileWriter("/home/bridgeit/Desktop/AnilWorkSpace/DataStructure-Programs/src/Files/unOrderedList.txt");
			System.out.println(words);
			String[] str1 = words.split(" ");
			
		    LinkedListProg list = new LinkedListProg();
			for (int i = 0; i < str1.length; i++) 
			{
				list.add(str1[i]);
			}
			  String info=list.printList();
			  System.out.println("..........");
			  System.out.println(info);
			System.out.println("Enter the String to search...");
			String search = scanner.next();
			
			String Allist=list.removeNode(search);
			System.out.println("All List-->"+Allist);
			String result=list.printList();
			System.out.println("result---------->"+result);
			fileWriter.write(result);
			
			fileWriter.flush();
			scanner.close();
			buffer.close();
			
			fileWriter.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	//read the integer form the file sort the in ascending order
	//if user entered number is found in the list then remove from the list else append into file
	//at appropriate position
	public static void oderedList() throws IOException
	{
		java.util.LinkedList<String>  list=new java.util.LinkedList<String>();
		Scanner scanner =new Scanner(System.in);
		FileReader fileReader=null;
		File file =new File("/home/bridgeit/Desktop/AnilWorkSpace/DataStructure-Programs/src/Files/number.txt");
		fileReader= new FileReader(file);
		String integersArray[]=null;
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		String str;
		while((str=bufferedReader.readLine())!=null)
		{    	
			integersArray = str.trim().split(" ");//store element in array
		}
		fileReader.close();
		
		FileWriter fileWriter = new FileWriter("/home/bridgeit/Desktop/AnilWorkSpace/DataStructure-Programs/src/Files/number.txt");
		try 
		{
			System.out.println("Before Sorting");
			for (String numbers: integersArray) 
			{
				list.add(numbers);
				System.out.println(numbers);
			}
			System.out.println("Enter the number to serch in list");
			String search=scanner.nextLine();

			if(list.contains(search)) 
			{
				list.remove(search);
			} 
			else
			{
				list.add(search);

			}
			Collections.sort(list);//sort list element
			String words="";
			for(String num:list)
			{
				words=words+" "+num;
			}  
			list.sort(null);
			System.out.println(list);
			fileWriter.write(words);
			fileWriter.flush();
			fileWriter.close();
			scanner.close();

		}
		catch(Exception e) 
		{
			e.printStackTrace();
		}
	}	
		
	


	public static  String[] sort(String str2[])
	{
		String temps;
		for (int t = 0; t < str2.length - 1; t++) {
			for (int i = 0; i < str2.length - t - 1; i++) {
				if (str2[i + 1].compareTo(str2[i])>0) {
				temps = str2[i];
					str2[i] = str2[i + 1];
					str2[i + 1] = temps;
				}
			}
		}

		
		return str2;
	}

	
	// boolean method to check Equation is balanced or not 
	 
		public static boolean isBalanced(String Expression)
		{
			Stack<Character> stack=new Stack<Character>();
			
			for(int i=0;i<Expression.length();i++)
			{
				if(Expression.charAt(i)=='(' || Expression.charAt(i)=='{' || Expression.charAt(i)=='[')
					stack.push(Expression.charAt(i));
				else 
				if(stack.isEmpty())
				return false;
				if( (Expression.charAt(i)==')') && (stack.peek()=='('))
					stack.pop();
				if((Expression.charAt(i)=='}') && (stack.peek()=='{'))
					stack.pop();
				if((Expression.charAt(i)==']') && (stack.peek()=='[')) 
					stack.pop();	
			}
			return stack.isEmpty() ? true : false;
        }
		// palidrome checker
		public static boolean isPalindrome(String str)
		{
			ArrayDeque<Character> queue=new ArrayDeque<Character>();
			int n,i;
			for(i=0;i<str.length();i++)
				queue.add(str.charAt(i));
			
			if(queue.size()%2==0)
				n=queue.size();
			else
				n=queue.size()-1;
			while(!queue.isEmpty()&&n>0)
			{
				if(queue.peekFirst().equals(queue.peekLast()))
				{
					queue.removeLast();
					queue.removeFirst();
					n=n-2;
				}else
				{
				 return false;	
				}
			}
			
			return n==0? true:false;
			
		}
		//calender logic
		public static int  calendarLogic(int month,int year) 
		{
			String months[] ={"","January","February","march","April","may","June","July","August","september","October","November","December"};
			
			  // days[i] = number of days in month i
			int days[]= {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			if(month==2 && leapYear(year))
				days[month]=29;
			
			System.out.println("   " + months[month] + " " + year);
			System.out.println(" S  M Tu  W Th  F  S");
			
			int number_days=day(month, year);
			
			for(int i=0;i<number_days;i++)//( 0 t0 6)for firstweekDayofMonth to add space
			
				System.out.print("   ");
			
			for(int i=1;i<=days[month];i++) //days[march]=days count
			{
				System.out.printf("%2d ",i);
				 if (((i + number_days) % 7 == 0) || (i == days[month]))
		            	System.out.println();	
				 
			}
			return number_days;
		  } 
		    // find the starting day of the  month
			private static int day(int month, int year) 
			{
			    int y = year - (14 - month) / 12;
		        int x = y + y/4 - y/100 + y/400;
		        int m = month + 12 * ((14 - month) / 12) - 2;
		        int d = (1 + x + (31*m)/12) % 7;
		        return d;//remainder decide day of the week sun,mon...
		   }

		    private static boolean leapYear(int year) 
		    {
			  if  (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
				  return true;
		          return false;
	         }
    

}//cls
