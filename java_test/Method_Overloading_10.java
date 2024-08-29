package java_test;

//This program is used to demonstarte that can we overload the method return type
public class Method_Overloading_10 {
	/* package whatever //do not write package name here */
	public int foo(int i) {
		System.out.println(i);
		return i;
	}
	public char foo(char f) {
		System.out.println(f);
		return 'a';
	}
//creatint the main method
	public static void main(String args[]) {
//		Creating the object of this class
		Method_Overloading_10 obj = new Method_Overloading_10();
//			calling the overloaded method
		obj.foo(10);
		obj.foo('c');
		
		}
/*	Explanation:-
	We can overload the return type with different parameter.But we cant overload the return type with same parameter.
*/

}
