package com.bridgelabz.programs;

import java.util.Scanner;

public class CashCounter {

	public static void main(String[] args) {
		CashCounterLogic q = new CashCounterLogic();

		@SuppressWarnings("unused")
		int ch = 0, amount_Deposite, amount_Withdraw;
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.println();
			System.out.println("---------(SBH)Banking Cash Counter-----------");
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Number of people in the Queue ");
			System.out.println("4.Display Balacne");
			System.out.println("5.Exit");
			System.out.println("----------------------------------------------");
			System.out.println();
			int choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter the amount you want to Deposit");
				amount_Deposite = scanner.nextInt();
				q.enqueue(amount_Deposite);
				q.display();
				break;
			case 2:
				System.out.println("Enter the amount you want to Withdraw ");
				amount_Withdraw = scanner.nextInt();
				q.dequeue();
				System.out.println(" Your Available Balance is: ");
				q.display();
				break;
			case 3:
				int j = q.getSize();
				System.out.println("The Number of People in Queue is: " + j);
				break;
			case 4:
				System.out.println(" Your Available Balance is: ");
				q.display();
				break;

			default:
				System.out.println("You entered wrong choice");
				return;
			}
		} while (ch < 5);
	}
}
