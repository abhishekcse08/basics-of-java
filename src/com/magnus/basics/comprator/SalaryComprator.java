package com.magnus.basics.comprator;

import java.util.Comparator;

public class SalaryComprator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Double.compare(o1.getSalary(),o2.getSalary());
    }
}
