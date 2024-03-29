package com.Masai;

public class Employee {
	
 private	int employeeId;
 private	String employeeName;
 private	double salary;
 private 	static double netSalary;
	
 public void setSalary(double salary) {
	 this.salary=salary;
 }
 public double getSalary() {
	 return salary;
 }
 
 public  void setNetSalary(double netSalary) {
	 this.netSalary=netSalary;
 }
 public static int getPFPercentage() {
	 return (int)netSalary;
 }
 
 public Employee(int employeeId,String employeeName,double salary,int pfpercentage) {
	 this.employeeId=employeeId;
	 this.employeeName=employeeName;
	 this.salary=salary;
	
	 setSalary(this.salary);
	 calculateNetSalary(pfpercentage);
 }
 

 public  void calculateNetSalary(int pfpercentage)
 {
	 double salary =getSalary();
	 double pfsalary=salary*pfpercentage/100;
	double netSalary=salary-pfsalary;
	 setNetSalary(netSalary);
	
 }
 
 void showDetails() {
	 System.out.println("id "+employeeId);
	 System.out.println("Name "+employeeName);
	 System.out.println("Salary "+salary);
	 System.out.println("PfSalary "+getPFPercentage());
 }

 public static Employee getEmployeeDetails()
 {
	 Employee e1=new Employee(20,"Micheal",2212,9) ;
	 return e1;
 }
 
 
	public static void main(String[] args) {
	
		
		getEmployeeDetails().showDetails(); 
 
	}

}
