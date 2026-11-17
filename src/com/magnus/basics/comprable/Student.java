package com.magnus.basics.comprable;

public class Student implements Comparable<Student>{

    int id;
    String name;
    String address;

    public Student(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare( o.id,this.id);
    }
}

