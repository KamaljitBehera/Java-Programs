package java_test;
// This program is used to demonstrate that the interface variable

//creating an interface

interface Interface{
	int num=10;
	static void square() {
		System.out.println("The square of that number is "+Math.pow(num, 2));
	}
	default int reinitialize(int n) {
//		 this.num=n;//Here we get compile time error
/*		 
     	 Explanation:-
		 Inside an interface a variable is bydefault public static final.
		 as it is decalre as final the we can't re-initialise it.
		 
*/
		return num;
	}
}
//Driver class
public class Interface_4 implements Interface {
    public static void main(String[] args) {
//		creating the object of Interface_4
    	Interface_4 ref=new Interface_4();
    	System.out.println(ref.reinitialize(40));
    	Interface.square();
	}
}
