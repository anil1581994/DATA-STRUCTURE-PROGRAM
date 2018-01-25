package com.bridgelabz.programs;

public class Array2DPrime {

	public static void main(String[] args)
	{
		int primeNumber[][]=new int[10][100];
		int i,j;
		String Prime="";
		for(i=0;i<10;i++)
		{
			for(j=0;j<=100;j++)
			{
				int num=i*100+j;  //check wether it is prime ot not
				if(isprime(num))
				{
					primeNumber[i][j]=num;
					Prime=Prime+num+" ";
				}
			}
		}
	
		for(i=0;i<9;i++) 
		{
			for(j=0;j<100;j++) 
			{
		     if(primeNumber[i][j]!=0)
				System.out.print(primeNumber[i][j]+" ");//to print prime array
			}
			System.out.println();
		}
		
		}	
		
			public static boolean isprime(int num) 
			{
				 
		        for(int i=2; i<=num/2; i++)
		        {
		            if(num % i == 0)
		            {
		                return false;
		            }
		        }
		        return true;
			}

}
