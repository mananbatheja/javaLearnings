package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        List<Integer> values = new ArrayList<>()
//        {{  //outer braces - anonymous class
//            add(88);
//            add(91);
//            add(32);
//        }};            //more generalised

        List<Integer> values = Arrays.asList(88,91,32); //if values are known

        for(int i : values){
            System.out.println(i);
        }

    }
}
