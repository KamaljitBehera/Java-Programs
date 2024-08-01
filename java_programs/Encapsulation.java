package java_programs;
//This program is used to demonstrate how to use Encapsulation 

//creating a class Person having private data member as private
class Person{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
//Driver class
public class Encapsulation {
  public static void main(String[] args) {
	//creating the object of person class
	  Person obj=new Person();
//	  set the global variable value by using setter method
	  obj.setName("kamaljit");
	  obj.setAge(20);
//	  getting the value using getter method
	  System.out.println("The name of the person is "+obj.getName());
	  System.out.println("The age of the person is "+obj.getAge());
}
}
