package com.magnus.basics.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Alice");
        map.put(2,"Bob");
        map.put(null,"Charlie");
        map.put(3,"Dan");
        map.put(4,"Ron");

        System.out.println(map);

        map.remove(4);
        System.out.println("After delete 4:");
        System.out.println(map);

        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"::"+entry.getValue());
        }

        //----------------------
        System.out.println("Extracting using key");
        for(Integer key:map.keySet()){
            System.out.println(key+"::"+map.get(key));
        }

        //-------
        System.out.println("Get only Values");
        for(String v:map.values()){
            System.out.println(v);
        }
        System.out.println("Using Iterator");
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()){
            Map.Entry<Integer, String> next = itr.next();
            System.out.println(next.getKey()+"::"+next.getValue());
        }

    }
}










