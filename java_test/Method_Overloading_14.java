package java_test;
//Program to check whether the abstract method can be overloaded or not
//creating an abstract class
abstract class P_Method_Overloading_14{
//	creating the abstract method
	public abstract void add(int a,int b,int c) ;
	
//	creating the overloaded abstract method
	public abstract void add(int a,int b) ;

}
//Driver class extending the parent class
public class Method_Overloading_14 extends P_Method_Overloading_14{
//    overriding the abstract method
	@Override
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
		
	}

	@Override
	public void add(int a, int b) {
		System.out.println(a+b);
		
	}
//    creating the main method
	public static void main(String[] args) {
//		Creating the object of the class
		Method_Overloading_14 obj = new Method_Overloading_14();
//	calling the method
		obj.add(10, 20);
		obj.add(40,30,20);
	}
}
