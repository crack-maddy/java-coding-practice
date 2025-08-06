package com.programming.streams.wed06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Amit", "Male", "IT"),
                new Employee("Priya", "Female", "HR"),
                new Employee("Raj", "Male", "Finance"),
                new Employee("Suman", "Female", "IT"),
                new Employee("Kiran", "Male", "HR")
        );

        //counting male and female employees
        employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()))
                .entrySet().stream().forEach(entry -> System.out.println(entry.getKey()+" - "+entry.getValue()));

    }
}

class Employee{
    private String name;
    private String gender;
    private String department;

    public Employee(String name, String gender, String department) {
        this.name = name;
        this.gender = gender;
        this.department = department;
    }
    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getDepartment() {
        return department;
    }
}
