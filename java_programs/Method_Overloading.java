package java_programs;
//     This program is used to demonstrate how method overloading concept work
public class Method_Overloading {
//      Creating the first method add having two integer as an argument
	public void add(int a, int b) {
        System.out.println("The result is "+(a+b));
	}
//  Creating the first method add having one integer and afloat type as an argument
	public void add(float a, int b) {
		 System.out.println("The result is "+(a+b));
	}
//Creating main method
	public static void main(String[] args) {
//		creating the object of the class
		Method_Overloading obj=new Method_Overloading();
//		calling the method having float and integer type as an argument
		obj.add(10.2f, 20);
//		calling the method having two integer type as an argument
		obj.add(20, 30);
		
	}
}
