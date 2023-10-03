package org.task.Entities;

import java.util.List;

public class Employee {
    private String firstName;
    private String lastName;
    private Department department;
    private List<SalaryList> salaryLists;

    public Employee(String firstName, String lastName, Department department, List<SalaryList> salaryLists) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.salaryLists = salaryLists;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Department getDepartment() {
        return department;
    }

    public List<SalaryList> getSalaryLists() {
        return salaryLists;
    }
}
