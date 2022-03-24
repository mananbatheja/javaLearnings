package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Collection<Integer> values = new ArrayList<>(); // Collection interface does not have methods like index or sort, for that we use List
        List<Integer> values = new ArrayList<>();

        values.add(7);
        values.add(4);
        values.add(11);
        values.add(6);

        values.add(2, 33);
        Collections.sort(values); // Method sort is in CLASS Collections and not in interface - List or Collection

//        Iterator it = values.iterator();

//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());
//        System.out.println(it.next());

//        while(it.hasNext()){
//            System.out.println(it.next());
//        }

//        for (Integer i : values){ // int i - also works
//            System.out.println(i);
//        }

        //Another way to print
        values.forEach(System.out::println); // Stream API - uses Lambda Expression
    }
}
