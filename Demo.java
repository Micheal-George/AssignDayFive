package com.Masai;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		int sum=0;
		Scanner scan =new Scanner(System.in);
		System.out.println("enter Number of Student ");
		int std=scan.nextInt();
		System.out.println("======================= ");
      for(int i=1;i<=std;i++)
      {
    	  System.out.println("enter Student details of Student "+i);
    	  System.out.println("enter Student Roll  NO");
          int roll=scan.nextInt();
          System.out.println("enter Student Name");
          String name=scan.next();
          scan.nextLine();
          System.out.println("enter Student Address");
          String add=scan.nextLine();
          System.out.println("enter Student Marks");
          int marks=scan.nextInt();
          Student s=new Student(roll,name,add,marks,i);
          s.show();
          System.out.println("======================= ");
          sum=sum+marks;
      }
      System.out.println("Average Marks of Students : "+(double)(sum/std));  
	}

}
