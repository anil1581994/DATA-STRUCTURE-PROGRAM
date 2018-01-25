package com.bridgelabz.programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class OrderedList1 {


	public static void main(String[] args) throws IOException 
	{
		OrderedList1 ol = new OrderedList1();
	            ol.calOrderList();
	}
	public   void calOrderList() throws IOException
	{
		LinkedList<String>  list=new LinkedList<String>();
		Scanner scanner =new Scanner(System.in);
		FileReader fileReader=null;
		File file =new File("/home/bridgeit/Documents/Programs/DataStructure-Programs/src/Files/number.txt");
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
}



