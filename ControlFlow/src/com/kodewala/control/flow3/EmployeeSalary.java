
package com.kodewala.control.flow3;

public class EmployeeSalary {

    int id;
    int accNo;
    int amount;
    boolean isValid = true;

    public void empDetails(boolean isValid) {

        if (isValid) {
            System.out.println("Employee ID = " + id);
            System.out.println("Account Number = " + accNo);
            System.out.println("Employee Salary = " + amount);
        } 
        else {
            System.out.println("You are not permitted to access salary details");
        }
    }

    public static void main(String[] args) {

        EmployeeSalary emp = new EmployeeSalary();

        emp.id = 101;
        emp.accNo = 123456;
        emp.amount = 50000;

        emp.empDetails(emp.isValid);
    }
}
