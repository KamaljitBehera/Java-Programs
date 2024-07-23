package java_programs;
//This program is used to illustrate the concept of calling a method
public class Calling_Number {
	//non static method
		public void add(int x,int y)
		{
			System.out.println("sum is "+ (x+y));
		}
		//static method
		public static void substract(int x,int y) {
			System.out.println("Substraction is "+ (x-y));
		}
	  public static void main(String[] args) {
		//create an object
		  Calling_Number obj=new Calling_Number();
		  obj.add(10,20);
		  substract(20,10);
	  }
}
