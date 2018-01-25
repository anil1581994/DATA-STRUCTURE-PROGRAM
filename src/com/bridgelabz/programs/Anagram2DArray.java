package com.bridgelabz.programs;
import java.util.ArrayList;


import java.util.Arrays;
import java.util.Collections;

public class Anagram2DArray {

	public static void main(String[] args)
	{
		ArrayList <Integer>arrayList = new ArrayList<Integer>();
		int primeNumber[][]=new int[10][100];
		int i,j;
		String Prime="";
		for(i=0;i<10;i++)
		{
			for(j=0;j<=100;j++) 
			{
				int num=i*100+j;
				if(isprime(num))
				{
					primeNumber[i][j]=num;
					Prime=Prime+num+" ";
				}
			}
		}

		int[][] anagram=new int[10][100];
		String[] strArray=Prime.split(" ");//add all prime to strArray and check are they anagram

		
		for(i=0;i<strArray.length;i++) 
		{
 			for(j=i+1;j<strArray.length;j++) 
 			{
 				if(anagramDetect(strArray[i],strArray[j])) //if they anagram
				{
 					arrayList.add(Integer.parseInt(strArray[i]));
 					arrayList.add(Integer.parseInt(strArray[j]));
				}
 			}
		}
		//arrayList.sort(null);
		 Collections.sort(arrayList);  //sort arraylist in ascending order
	
		j=0; i=0;	
		int k=0;
		while(j<=arrayList.size() && i<10)
		{
		k=0;
		
		int rem=arrayList.get(j)/100;
		while(j<arrayList.size() && arrayList.get(j)/100==rem)//add allanagram to anagram array
		 {
			anagram[i][k]=arrayList.get(j);
			k++;
			j++;
	
        }
		i++;
	    }
     		
		for(i=0;i<9;i++) 
		{
			for(j=0;j<anagram.length;j++) 
			{
		
				if(anagram[i][j]!=0)
				System.out.print(anagram[i][j]+" ");//anagram
			}
			System.out.println();
		}
		
		}	
		
			public static boolean isprime(int num) {
				 
		        for(int i=2; i<=num/2; i++){
		            if(num % i == 0){
		                return false;
		            }
		        }
		        return true;
			}
			
			public static boolean anagramDetect(String anagram1,String anagram2) 
			{
				char char1[]=anagram1.toCharArray();
			    char char2[]=anagram2.toCharArray();
			    Arrays.sort(char1);
			    Arrays.sort(char2);
			    String string1=String.valueOf(char1);
			    String string2=String.valueOf(char2);
			   
			    if(string1.equals(string2))
			    	return true;
			    else
			    	return false;
}
}
