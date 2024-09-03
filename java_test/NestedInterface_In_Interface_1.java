package java_test;
//Program to check the condition that be applied on the nested members along with the public outer members.
public interface NestedInterface_In_Interface_1  {
//	Creating an abstract method
	void game();
//	Creating the inner interface with public access modifier
	public interface InnerInterface_1{
		static void status() {
			System.out.println("Yes outer public and inner public modifier can acceptable");
		}
	}
//	Creating the inner interface with default access modifier

    interface InnerInterface_2{
		static void status() {
			System.out.println("Yes outer public and inner default modifier can acceptable");
		}
	}
    
/*//	Creating the inner interface with protected access modifier

   protected interface InnerInterface_3{//Here we get compile time error because inner protected is not acceptable
		static void status() {
			System.out.println("Yes outer public and inner protcted modifier can not acceptable");
		}
	}
*/
    
/*	//Creating the inner interface with private access modifier

    private interface InnerInterface_4{//Here we get compile time error because inner private is not acceptable.
		static void status() {
			System.out.println("Yes outer public and inner private modifier can not acceptable");
		}
	}
*/
}
