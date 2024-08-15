package java_test;

//This program is used to demonstrate access modifier useing rule at the time of method overriding
//Creating the parent class
abstract class P_Method_Overriding_5 {
//	creating the public abstract method
	public abstract void add(int num1, int num2);

//	creating the default abstract method
	abstract void mul(int num1, int num2);

//  creating the protected abstract method
	protected abstract void sub(int num1, int num2);

}

public class Method_Overriding_5 extends P_Method_Overriding_5 {
	//Override  the  add method
	public void add(int num1, int num2) {
		System.out.println("The addition of two number is " + (num1 + num2));
	}

	
//	overriding the mul method 
	void mul(int num1, int num2) {
		System.out.println("The multiplication of two number is " + (num1 * num2));
	}
/*	//or
	public void mul(int num1, int num2) {
		System.out.println("The multiplication of two number is " + (num1 * num2));
	}
	//or
//	protected void mul(int num1, int num2) {
//		System.out.println("The multiplication of two number is " + (num1 * num2));
//	}
 */
	
	
//  Override the sub method 
/*	public void sub(int num1, int num2) {
		System.out.println("The substraction of two number is " + (num1 - num2));
	}
*/
	protected void sub(int num1, int num2) {
		System.out.println("The substraction of two number is " + (num1 - num2));
	}
	
	
//	creating the main method
	public static void main(String[] args) {
//		Creating the parent class reference and store the child class object
		P_Method_Overriding_5 ref=new Method_Overriding_5();
		
//		calling the override method
		ref.add(10,20);
		ref.mul(10, 20);
		ref.sub(20,10);
	}
}
