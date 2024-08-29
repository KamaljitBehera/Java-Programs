package java_test;
//Program to demonstrate that can java support overloaded operator.
//Actually java fully doesn't support the operator overloading but there only one operater act as overloaded
public class Method_Overloading_11 {
//  Creating the method add
	public void add(int a,int b) {
		System.out.println("The adddition of two number is "+(a+b));
	}
//	creating the method to concarnet
	public void concart(int a,String s) {
		System.out.println("The concartination is "+(a+s));
	}
//	creating the main method
	public static void main(String[] args) {
//		creating the current class object
		Method_Overloading_11 ref = new Method_Overloading_11();
		ref.add(10, 20);
		ref.concart(30,"Kamal");
		
/*		Explanation:-
		When we use plus operator to add two integer then it act as plus operator.
		But whent we add string type data to any other data with plus operator then it acts a
		concartination operator.
*/
	}
}
