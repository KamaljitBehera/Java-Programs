package java_test;

import java.util.Scanner;

public class Duck_Number {
	public static void main(String args[])
    {
//		creating the Scanner class object.
        Scanner sc=new Scanner(System.in);
//        declaring the required variables
        String n;
        int n1,f,d;
//        Taking the input from user
        System.out.println("Enter a number= ");
        n=sc.next();
//        checking the conditions
        if(n.charAt(0)=='0')
        System.out.println("Not a Duck Number");
        else
        {
            n1=Integer.parseInt(n);
            f=0;
            while(n1>0)
            {
                d=n1%10;
                if(d==0)
                {
                    f=1;
                    break;
                }
                n1=n1/10;
            }
//            checking the condition
            if(f==1)
            System.out.println("It is a Duck Number");
            else
            System.out.println("It is "
            		+ "Not a Duck Number");
        }
//        closing the costly resources
        sc.close();
    }
}
