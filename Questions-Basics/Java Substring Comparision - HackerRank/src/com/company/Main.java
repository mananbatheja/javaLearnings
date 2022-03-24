package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int len = scanner.nextInt();
        String min = line.substring(0,len);
        String max = line.substring(0,len);

        for (int i = 1; i < line.length()-len+1; i++) {
            String sub = line.substring(i,i+len);
            if (sub.compareTo(min) < 0) {
                min = sub;
            }
            if (sub.compareTo(max) > 0) {
                max = sub;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
