package com.org.oops.Abstraction._interface;
//Program to check the condition that be applied on the nested members along with the default outer class.
 class NestedInterface_In_Class_2 {
//	Creating the inner interface with public access modifier
	public interface InnerInterface_1{
		static void status() {
			System.out.println("Yes outer default and inner public modifier can acceptable");
		}
	}
//	Creating the inner interface with default access modifier

  interface InnerInterface_2{
		static void status() {
			System.out.println("Yes outer default and inner default modifier can acceptable");
		}
	}
  
//	Creating the inner interface with protected access modifier

 protected interface InnerInterface_3{
		static void status() {
			System.out.println("Yes outer default and inner protcted modifier can  acceptable");
		}
	}

	//Creating the inner interface with private access modifier

  private interface InnerInterface_4{
		static void status() {
			System.out.println("Yes outer default and inner private modifier can  acceptable");
		}
	}
    
}
