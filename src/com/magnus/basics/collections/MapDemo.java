package com.magnus.basics.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Alice");
        map.put(2,"Bob");
        map.put(null,"Charlie");
        map.put(3,"Dan");
        map.put(4,"Ron");

       // System.out.println(map);

        map.remove(4);
        //System.out.println("After delete 4:");
        //System.out.println(map);

    /*    for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"::"+entry.getValue());
        }*/

        //----------------------
  /*      System.out.println("Extracting using key");
        for(Integer key:map.keySet()){
            System.out.println(key+"::"+map.get(key));
        }*/

        //-------
//        System.out.println("Get only Values");
//        for(String v:map.values()){
//            System.out.println(v);
//        }
//        System.out.println("Using Iterator");
//        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();
//
//        while (itr.hasNext()){
//            Map.Entry<Integer, String> next = itr.next();
//            System.out.println(next.getKey()+"::"+next.getValue());
//        }
//
//        System.out.println("-------- Linked HashMap ---------");
//        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<>();
//        lhm.put(1,"ATS");
//        lhm.put(2,"AlS");
//        lhm.put(3,"AoS");
//        lhm.put(4,"AuS");
//        lhm.put(null,"rtjelt");
//        System.out.println(lhm);

        Employee e = new Employee(1,"A",20.9,"ADS1","123");
        Employee e1 = new Employee(2,"B",10.9,"ADS2","1234");
        Employee e2 = new Employee(3,"B",30.9,"ADS3","12345");
        Employee e3 = new Employee(3,"B",30.9,"ADS3","12345");

        HashMap<Employee,String> empMap = new HashMap<>();

        empMap.put(e,"A");
        empMap.put(e1,"B");
        empMap.put(e2,"C");
        empMap.put(e3,"D");

        System.out.println(e2.hashCode());
        System.out.println(e3.hashCode());

        System.out.println(empMap.size());
        System.out.println(empMap.get(e3));





    }
}










