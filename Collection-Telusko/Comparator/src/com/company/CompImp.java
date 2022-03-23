package com.company;

import java.util.Comparator;

public class CompImp implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if (o1%10 > o2%10) {
            return 1;
        }
        return 0;

        // OR
//        return o1%10 > o2%10 ? 1 : 0; // Ternary Operator
    }
}
