package com.org.oops.var_argument_method;
//This program is demonstrate about the var-argument method and how to use it
import java.util.Arrays;

public class VarArgumentMethod {
    // creating the var-argument method
    public void printNumber(int x, int... y) {
        // print the first number
        System.out.println("The first number is " + x);

        // print the remaining numbers
        System.out.print("The remaining numbers are: ");
        System.out.println(Arrays.toString(y));
    }

    // creating the main method
    public static void main(String[] args) {
        // creating the object of that class
        VarArgumentMethod obj = new VarArgumentMethod();

        // calling the var-argument method by passing different number of argument

        obj.printNumber(20, 10);

        obj.printNumber(20, 10, 30);

        obj.printNumber(20, 10, 34, 50);

        obj.printNumber(20, 10, 52, 59, 56, 25);
    }
}