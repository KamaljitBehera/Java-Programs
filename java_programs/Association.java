package java_programs;

import java.util.HashSet;
import java.util.Set;

// Creating the Bank Class
class Bank {
    // Creating variable to store the name and data of bank
    private String name;
    private Set<EmployeeName> employees;

    public Bank(String name, Set<EmployeeName> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    // creating the getter and setter method
    public void setName(String name) {
        this.name = name;
    }

    public Set<EmployeeName> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<EmployeeName> employees) {
        this.employees = employees;
    }
}

// Creating the Employee Class
class EmployeeName {
    // Creating the variable to store the name of Employee
    private String name;

    public EmployeeName(String name) {
        this.name = name;
    }

    // creating the getter and setter method
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// Driver class
public class Association {
    public static void main(String[] args) {
        // Creating the employee object and passing the name of employee
        EmployeeName obj1 = new EmployeeName("Kamaljit");
        EmployeeName obj2 = new EmployeeName("Ajaya");

        Set<EmployeeName> employees = new HashSet<>();
        employees.add(obj1);
        employees.add(obj2);

        // creating the bank class object
        Bank bank = new Bank("SBI", employees);

     // setting the employees for the Bank object
        bank.setEmployees(employees);
        
          // traversing and displaying the bank employees 
          for (EmployeeName emp : bank.getEmployees()) {
              System.out.println(emp. getName()
                                 + " belongs to bank "
                                 + bank.getName());
        }
    }
}