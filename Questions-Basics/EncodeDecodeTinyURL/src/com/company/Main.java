package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> mapURLKey = new HashMap<>();
        String baseURL = "http://tinyurl.com/";

        Scanner input = new Scanner(System.in);
        String url = input.nextLine();

        while(!url.equals("END")) {

            if (!map.containsValue(url)) {
                map.put(map.size(), url);
                mapURLKey.put(url, map.size()-1);

                System.out.println("TinyURL: " + baseURL + mapURLKey.get(url));

            } else {
                System.out.println("URL exists: " + baseURL + mapURLKey.get(url));
            }

            url = input.next();
        }
    }
}
