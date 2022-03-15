package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        String B = reader.readLine();

        if (A.length() != B.length()){
            System.out.println("Not Anagrams");
            return;
        }


        Map<Character, Integer> word1 = new HashMap();
        Map<Character, Integer> word2 = new HashMap();

        for (int i = 0; i < A.length(); i++){ // populate map
            int count = 0;

            if (word1.containsKey(A.charAt(i)))
                continue;

            for (int j = i; j < A.length(); j++)
                if(A.charAt(j) == A.charAt(i))
                    count++;

            word1.put(A.charAt(i), count);
        }

        for (int i = 0; i < B.length(); i++){ // populate map
            int count = 0;

            if (word2.containsKey(B.charAt(i)))
                continue;

            for (int j = i; j < B.length(); j++)
                if(B.charAt(j) == B.charAt(i))
                    count++;

            word2.put(B.charAt(i), count);
        }
        System.out.println(word1.equals(word2)?"Anagrams":"Not Anagrams");

    }
}
