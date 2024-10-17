package com.org.oops.constructor;
//This program is used to demonstrate how to use the this keyword as an argument to constructor call 
//create another class
class N_This_Keyword_5{
//	creating the constructor taking This_Keyword_5 as an argument
	N_This_Keyword_5(This_Keyword_5 pObj){
//		call the This_Keyword_5 details method
		pObj.details();
	}
}

public class This_Keyword_5 {
//Creating a constructor
	public This_Keyword_5() {
//		Creating the N_This_Keyword_5 class object and passing the this keyword as an argument
		N_This_Keyword_5 ref=new N_This_Keyword_5(this);
	}
//	Creating a method
	public void details() {
		System.out.println("I am called from N_This_Keyword_5 class");
	}
//	creating main method
	public static void main(String[] args) {
//		creating the object
		This_Keyword_5 obj=new This_Keyword_5();
	}
}
