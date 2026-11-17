package com.magnus.basics.serializationNdeserialization;

import java.io.Serializable;

public class Employee implements Serializable {

    int id;
    String name;
    double salary;
    String address;

    public Employee(int id, String name, double salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }
}
