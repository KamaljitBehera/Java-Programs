package java_test;
//this program is used to demonstrate that how to implement a method contained by two different interface
// Creating interface 1
interface Parent1{
	//Creating method
	public void details();
}
//Creating interface 2
interface Parent2{
	//Creating same method
	public void details();
}
//implemented class
public class Interface_5 implements Parent1,Parent2 {
    public static void main(String[] args) {
//    	creating the object of implemented class
    	Interface_5 obj=new Interface_5();
    	obj.details();
/*   	
    	Explanation:-
    	If more than one interface having same method signature the we have to
    	provide implementation only once
*/
	}

	@Override
	public void details() {
		System.out.println("Hello There i am the implemented method for both the interface.");
		
	}
}
