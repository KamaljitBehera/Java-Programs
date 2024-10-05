package java_programs;

// A Java program to demonstrate 
//shallow copy using clone() 


//Creating class Test
class TestCase1{
	int x,y;
}

//Creating the P_Shallow_Copy_By_Clone_Method class implementing cloneable interface
class P_Shallow_Copy_By_Clone_Method implements Cloneable{
	int a;
	int b;
	TestCase1 tc=new TestCase1();
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

//Driver class
public class Shallow_Copy_By_Clone_Method {
//	Creating the main method
	
	public static void main(String[] args) throws CloneNotSupportedException {
//		Creating the object of P_Shallow_Copy_By_Clone_Method
		P_Shallow_Copy_By_Clone_Method ref = new P_Shallow_Copy_By_Clone_Method();
		
		ref.a=10;
		ref.b=20;
		ref.tc.x=100;
		ref.tc.y=200;
		
		P_Shallow_Copy_By_Clone_Method clone = (P_Shallow_Copy_By_Clone_Method)ref.clone();
		
		// Creating a copy of object ref 
        // and passing it to clone
		clone.a=50;
		// Change in primitive type of clone will 
        // not be reflected in ref field 
		clone.tc.y=900;
		
		 // Change in object type field will be 
        // reflected in both ref and clone(shallow copy) 
		System.out.println(ref.a+" "+ref.b+" "+ref.tc.x+" "+ref.tc.y);
		System.out.println(clone.a+" "+clone.b+" "+clone.tc.x+" "+clone.tc.y);
		
	}
	

}
