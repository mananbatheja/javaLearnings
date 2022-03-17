package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();

        String replacement = "[.]";
        String ans = "";

        for (int i = 0; i < address.length(); i++){
            if (address.charAt(i) != '.'){
//                System.out.println("Adding "+address.charAt(i));
                ans = ans + address.charAt(i);
//                System.out.println(address.charAt(i));
            }
            else{
                ans = ans + replacement;
//                System.out.println("Inside else");
            }
        }
        System.out.println(ans);

    }
}
