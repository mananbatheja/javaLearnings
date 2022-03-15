package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        String B = reader.readLine();
        String C = "";

        System.out.println(A.length()+B.length());

        if (A.equals(B)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }


        if (A.length() != 0){
            String tmp = String.valueOf(A.charAt(0));
            C = C + tmp.toUpperCase();
            if (A.length() != 1)
                C = C + A.substring(1, A.length());
        }
        if (B.length() != 0){
            String tmp = String.valueOf(B.charAt(0));
            C = C + " ";
            C = C + tmp.toUpperCase();
            if (B.length() != 1)
                C = C + B.substring(1, B.length());

        }
        System.out.println(C);
    }
}
