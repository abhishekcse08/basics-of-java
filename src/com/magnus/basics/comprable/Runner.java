package com.magnus.basics.comprable;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Student st1 = new Student(10,"Student-1","Student-1-A");
        Student st2 = new Student(4,"Student-2","Student-2-A");
        Student st3 = new Student(12,"Student-3","Student-3-A");

        List<Student> studentList = Arrays.asList(st1,st2,st3);
        System.out.println("Before Sorting the data");
        for(Student s : studentList){
            System.out.println(s.id+"::"+s.name+"::"+s.address);
        }
        System.out.println("After Sorting the data");
        Collections.sort(studentList);
        for(Student s : studentList){
            System.out.println(s.id+"::"+s.name+"::"+s.address);
        }

      /*  List<Integer> list = Arrays.asList(1,34,5656,89,35,0);
        Collections.sort(list);
        System.out.println(list);*/
    }
}
