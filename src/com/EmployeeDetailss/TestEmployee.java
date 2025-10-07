package com.EmployeeDetailss;

public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Deepanshu",24,1000000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Deepu");
        System.out.println(emp.getEmployeeDetails());
    }
}
