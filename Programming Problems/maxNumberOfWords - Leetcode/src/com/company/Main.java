package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences = {"please wait", "continue to fight", "continue to win"};
        int max = 0;
        for (int i = 0; i < sentences.length; i++){
            String[] tmp = sentences[i].split(" ");
            max = max > tmp.length ? max : tmp.length;
        }
        System.out.println(max);

    }
}
