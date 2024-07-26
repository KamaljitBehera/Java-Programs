package java_programs;

interface Super_Parent{
	public void superMethod();
}
interface Grand_Parent extends Super_Parent{
	public void grandMethod();
}
interface Most_Parent extends Grand_Parent{
	public void mostMethod();
}
interface One_1 extends Most_Parent {
	 public void greeting();
	}

	interface Two_2 extends Most_Parent {
	 public void welcome();
	}
	interface Three_3 extends One, Two {
	    public void details();
	}
	class Child_4 implements Three {
	    @Override public void greeting()
	    {
	        System.out.println("Hello There");
	    }

	    public void welcome() 
	    { 
	    	System.out.println("welcome everyone");
	    }
	    public void details() {
	    	System.out.println("Multiple inheritance by interface program executed successfully");
	    }
	    public void superMethod() {
	    	System.out.println("I am Super_Parent interface");
	    }
	    public void grandMethod() {
	    	System.out.println("I am Grand_Parent interface");
	    }
	    public void mostMethod() {
	    	System.out.println("I am Most_Parent interface");
	    }
	}
public class Hybrid_Inheritance_By_Interface {
	public static void main(String[] args) {
		//Creating object of Child_4 class
		Child_4 ref=new Child_4();
		ref.superMethod();
		ref.grandMethod();
		ref.mostMethod();
		ref.greeting();
		ref.welcome();
		ref.details();
	}

}
