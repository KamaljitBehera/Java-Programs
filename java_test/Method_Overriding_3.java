package java_test;
//This program is illustrate how method overriding by using parent class reference object
//for method overriding minimum two class is required and they should be in relation
//Create a parent class
class P_Method_Overriding_3{
	public void details() {
		System.out.println("Hello there! I am the method inside Parent class");
	}
}
//Creating the child class
public class Method_Overriding_3 extends P_Method_Overriding_3 {
	//override the parent class method
		public void details() {
			System.out.println("Hello everyone! I am the method inside child class");
		}
		 public static void main(String[] args) {
//				creating object parent class and call the override method
			 P_Method_Overriding_3 obj=new Method_Overriding_3();
//		    	 calling the details method
		    	 obj.details();
			}
}
