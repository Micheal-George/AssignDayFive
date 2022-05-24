package com.Masai;

import java.util.Scanner;

public class Ticket {

	private int ticketId;
	private int price;
	private static int ticketAvailable;
	private int Noticket;
	private int remainingTicket;
	
	public Ticket(int ticketId, int price,int ticketAvailable,int Noticket) {
		this.ticketId=ticketId;
		this.price=price;
		setPrive(price);
		this.Noticket=Noticket;
		set(ticketAvailable);
		
	}
	public void setPrive(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public int calculateTicketCost(int nooftickets)
	{
		int x=get()-nooftickets;
		
		if(x>0)
		{
			
			return nooftickets*getPrice();
		}
		else
		{
			return -1;
		}
	}
	
	
	public void set(int ticketAvailable) {
		this.ticketAvailable=ticketAvailable;	
	}
	public int get() {	
		return ticketAvailable;
	}
	
	
	public int getR() {
	return ticketAvailable-Noticket;
	}
	
	
	
	void showDetails() {
		System.out.println("Ticket id : "+ticketId);
		System.out.println("Price : "+price);
		System.out.println("Ticket Availabe : "+get());
		System.out.println("No of Ticket : "+Noticket);
		System.out.println("Remaninig Ticket : "+getR());
	}
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter price");
		int price=scan.nextInt();
		System.out.println("Enter ticketId ");
		int ticketId=scan.nextInt();
		
		System.out.println("Enter ticketAvailable ");
		int ticketAvailable=scan.nextInt();
		
		System.out.println("Enter Noticket ");
		int Noticket=scan.nextInt();
		
		Ticket t=new Ticket(ticketId,price,ticketAvailable,Noticket);
		t.showDetails();
		int m=t.calculateTicketCost(Noticket);
		System.out.println("Amount : "+m);
		
	}

}
