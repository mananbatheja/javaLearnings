package com.company;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Map<String, String> map = new HashMap<>();

        map.put("myName", "Manan");
        map.put("city", "Jaipur");
        map.put("college", "BITS");

//        System.out.println(map); // to print while map

        System.out.println(map.get("myName")); // if key doesn't exist, will return null (no error)

    }
}
