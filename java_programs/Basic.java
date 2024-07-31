package java_programs;

public class Basic {
	// A simple program to understand the components of class
	// which has some state(variables), behavior(methods),identity(unique
	// name),methods
	// here create two static variable
	static String Employee_name;
	static float Employee_salary;

	// here create a method to initializing the variables
	static void set(String n, float p) {
		Employee_name = n;
		Employee_salary = p;
	}

	// here create a method to get the value of the variables
	static void get() {
		System.out.println("Employee name is: " + Employee_name);
		System.out.println("Employee CTC is: " + Employee_salary);
	}

	public static void main(String args[]) {
		// call the two methods
		Basic.set("Rathod Avinash", 10000.0f);
		Basic.get();
	}

}
