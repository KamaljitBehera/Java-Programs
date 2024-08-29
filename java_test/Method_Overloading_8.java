package java_test;

//Program to utilize the method overloading in different ways
public class Method_Overloading_8 {
//	1.By having different number  the parameter
//	Method 1 having 2 parameter
	public void multiply(int a, int b) {
		int prod = a * b;
		System.out.println(prod);
	}

	// Method 2
	// Multiplying three integer values
	public void multiply(int a, int b, int c) {
		int prod = a * b * c;
		System.out.println(prod);
	}

//	    2.By changing the data types 
	public void multiply(double a, double b, double c) {
		double prod = a * b * c;
		System.out.println(prod);
	}

//	    3.changing the order of parameters
	public void multiply(int a, String s, int c) {
		String prod = a + s + c;
		System.out.println(prod);
	}

//	    creating the main method
	public static void main(String[] args) {
//			creating the object and call the all method
		Method_Overloading_8 obj = new Method_Overloading_8();

		obj.multiply(10, 20);
		obj.multiply(20, 30, 40);
		obj.multiply(10, 20, 50);
		obj.multiply(10, "kamal", 20);
	}

}
