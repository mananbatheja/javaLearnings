package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String[] operation = {"X++","++X","--X","X--"};
        String[] operation = {"++X","++X","X++"};
        int X = 0;
        for (int i = 0; i < operation.length; i++){
            if(operation[i].equals("X++") || operation[i].equals("++X")){
                X++;
            } else{
                    X--;
            }
        }
        System.out.println(X);
    }
}
