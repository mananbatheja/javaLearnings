package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<Integer> values = new ArrayList<>();

        values.add(999);
        values.add(673);
        values.add(166);
        values.add(331);
        values.add(524);
//        Method1: Make a class that implements Comparator
//        Comparator<Integer> comp = new CompImp(); //As Comparator is not a class we cannot make objects directly

//        Method2: Anonymous Class
        Comparator<Integer> comp = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1%10 > o2%10) {
                    return 1;
                }
                return 0;

                // OR
//        return o1%10 > o2%10 ? 1 : 0; // Ternary Operator
            }
        };

        //        Method3: Incorporate Lambda operator
//        Comparator<Integer> comp = ( o1,  o2) -> {
//                if (o1%10 > o2%10) {
//                    return 1;
//                }
//                return 0;
//
//                // OR
////        return o1%10 > o2%10 ? 1 : 0; // Ternary Operator
//            }
//        ;
        Collections.sort(values, comp);

//      Note: can use below code instead of comp, and then no need to define comparator above
//        Comparator<Integer> comp = ( o1,  o2) -> {
//                if (o1%10 > o2%10) {
//                    return 1;
//                }
//                return 0;
    }
}
