package java_programs;

//This program is used to demonstrate that the co_varient concept used in method overloading and how it works.
//Creating the class
class P_Co_Varient_Concept {
//	creating the method Object type return type
	public Object details() {
		System.out.println("I am the method having Object type as return type");
		return null;
	}

//	creating th emthod havig integer type return type
	public int ask() {
		System.out.println("I am the integer type return type method");
		return 0;
	}
}

//?Driver class extend the parent class
public class Co_Varient_Concept extends P_Co_Varient_Concept {
	// Overriding the ask() with float return type
	/*
	 * public float ask() {
	 * System.out.println("I am the float type return type method"); return 0;
	 * 
	 * }
	 */
	/*
	 * Explanation:- We can change the return type of any method at the time of
	 * overriding but both override and overridden method should be in non-primitive
	 * and follow some rules . We can't change the return type if it is primitive
	 * type return type
	 */
//	Create the override method with string type as return type
	public String details() {
		System.out.println("I am the method having String type as return type");
		return null;
	}

//	creating the main method
	public static void main(String[] args) {
//		creating the object
		Co_Varient_Concept obj = new Co_Varient_Concept();
		obj.details();
	}
	/*
	 * Explanation:- When we try to change the return type of both override and
	 * overridden method having non-primitive returntype then it should follow the
	 * co_varient concept
	 * 
	 * co-varient concept:- --------------------- If the method have non-primitive
	 * type return type then at the time of overriding the override method return
	 * type should be the child class of Overridden method return type
	 */
}
