package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class BalancedParenthesis
{
	public static void main(String[] args) 
	{

		Utility utility = new Utility();
		String str;

		System.out.println("Enter the Parenthsis......");
		str = utility.getString();
		boolean r = Utility.isBalanced(str);
		if (r)
		{
			System.out.println("mathematical equation is balanced");
		} else 
		{
			System.out.println("Mathematical equation is Unbalaned");
		}

	}

}
