package com.Masai;

public class Account {

	
	
		private int	accountId ;
		private String accountType ;
		private int balance ;
	
		public  Account( int accountId,String accountType,int balance) {
			this.accountId=accountId;
			this.accountType=accountType;
			this.balance=balance;
		}
	
		
		
		 public boolean withdraw(int amount) {
			 int x=this.balance-amount;
			 if(x>=0)
			 {
				System.out.println("Balance amount after withdraw: "+x); 
				return true;
			 }
			 else
			 {
				 System.out.println("Sorry!!! No enough balance"); 
					return false; 
			 }
		 }
		
	public static void main(String[] args) {
		
   
	}

}
