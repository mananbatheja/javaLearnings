package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a word");
        String word = br.readLine();

        //Reversing
        String rev = "";
        for(int i = word.length()-1; i >= 0; i--){
            rev = rev + word.charAt(i);

        }

        //check palindrome
        if(word.equals(rev))
            System.out.println(word + " is a palindrome");
        else
            System.out.println(word + " is not a palindrome");

    }
}
