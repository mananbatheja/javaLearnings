package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String it = reader.readLine();
        int start = Integer.parseInt(String.valueOf(it.charAt(0)));
        int end = Integer.parseInt(String.valueOf(it.charAt(2)));

        // System.out.println(s.substring(start, end));
        String ans = "";
        for (int i = start; i <end; i++){
            ans = ans + s.charAt(i);
        }
        System.out.println(ans);
    }
}
