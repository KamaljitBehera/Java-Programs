package com.org.oops.inheritance;

//Java Program to illustrate Single Inheritance

//Base or Super Class
	class Employee {
	    int salary = 60000;
	}
	
	
	// Inherited or Sub Class
		class Engineer extends Employee {
		    int benefits = 10000;
		}
		// Through this class we show the single inheritance
public class Single_Inheritance{
	    public static void main(String args[])
	    {
	    	//creating the child class object
	    	//By using the inheritance concept we can access the parent class members
	        Engineer E1 = new Engineer();
	        System.out.println("Salary : " + E1.salary
	                           + "\nBenefits : " + E1.benefits);
	    }
}

