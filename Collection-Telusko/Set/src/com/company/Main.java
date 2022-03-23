package com.company;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Set<Integer> values = new HashSet<>();
//        Set<Integer> values = new TreeSet<>();

        System.out.println(values.add(5));; // return a bool, here true
        System.out.println(values.add(1)); // return a bool, here true
        System.out.println(values.add(9)); // return a bool, here true
        System.out.println(values.add(5)); // return a bool, here false

        for (int i : values){
            System.out.println(i); //will print only 3 values
                                   //Sequence will be random for HashSet
                                   //Ascending Order for TreeSet
        }
    }
}
