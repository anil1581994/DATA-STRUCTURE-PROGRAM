package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Calender {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Utility utility=new Utility();
		System.out.println("Enter month and year ");
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
          utility.calendarLogic(month, year);//jan ,2018
	}

}
