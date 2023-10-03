package org.task.Entities;

import java.util.List;

public class Department {
    private String Name;
    private List<Employee> employees;

    public Department(String name,List<Employee> employees) {
        Name = name;
        this.employees = employees;
    }

    public String getName() {
        return Name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
