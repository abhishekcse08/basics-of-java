package com.magnus.basics.collections;

import java.io.Serializable;

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
}
