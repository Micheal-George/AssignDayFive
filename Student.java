
package com.Masai;

public class Student {
	int roll;
	 String name;
	 String address;
	int marks;
	int i;
	
		public Student(int roll,String name,String address,int marks,int i) {
			this.roll=roll;
			this.name=name;
			this.address=address;
			this.marks=marks;
			this.i=i;
		}
	
		void show() {
			System.out.println("Details of Student "+i);
			System.out.println("Roll No : "+roll);
			System.out.println("Name : "+name);
			System.out.println("Address : "+address);
			System.out.println("Mark : "+marks);
		}


	public static void main(String[] args) {
		
		
		


	}

}
