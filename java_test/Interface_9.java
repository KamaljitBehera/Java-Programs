package java_test;
//This program is used to demonstrate how we inherit the members another interface


//Creating interface A
interface A {
    void method1();
    void method2();
}
// B now includes method1 and method2
interface B extends A {
    void method3();
}
// the class must implement all method of A and B.
public class Interface_9  implements B {
    public void method1()
    {
        System.out.println("Method 1");
    }
    public void method2()
    {
        System.out.println("Method 2");
    }
    public void method3()
    {
        System.out.println("Method 3");
    }
}

