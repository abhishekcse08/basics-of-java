package com.magnus.basics.serializationNdeserialization;

import java.io.Serializable;

public class Employee implements Serializable {
   private static final long serialVersionUID = 1L;
    int id;
    String name;
    double salary;
    String address;
    transient String contactNo;

    public Employee(int id, String name, double salary, String address, String contactNo) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
        this.contactNo = contactNo;
    }
}
