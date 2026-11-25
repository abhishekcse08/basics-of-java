package com.magnus.basics.collections;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {

    int id;
    String name;
    double salary;
    String address;
    String contactNo;

    public Employee(int id, String name, double salary, String address, String contactNo) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.contactNo = contactNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                ", contactNo='" + contactNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(address, employee.address) && Objects.equals(contactNo, employee.contactNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, address, contactNo);
    }
}
