package com.Masai;

import java.util.Scanner;

public class BankAccountDetails {

	Account account;

	public Account getAccountDetails() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter account id:");
		int id=scan.nextInt();
		System.out.println("Enter account type:");
		String type=scan.next();
		System.out.println("Enter account balance:");
		int balance=scan.nextInt();
		if(balance<=0)
		{
			System.out.println("Balance should be positive");
			 getAccountDetails();
		}
		
		return new Account(id,type,balance);
	}

	public int getWithdrawAmount() {
		Scanner scan1=new Scanner(System.in);
		BankAccountDetails B =new BankAccountDetails();
		System.out.println("Enter amount to be withdrawn:");
		int amount=scan1.nextInt();
			if(amount<=0)
			{
				System.out.println("Amount should be positive");
				B.getAccountDetails();
			}
			return amount;	
	}

	public static void main(String[] args) {
		
		
		BankAccountDetails B =new BankAccountDetails();
	     Account A=B.getAccountDetails();
	    int am= B.getWithdrawAmount();
	   A.withdraw(am);
	    
		
		

		
		
		
			

	}

}
