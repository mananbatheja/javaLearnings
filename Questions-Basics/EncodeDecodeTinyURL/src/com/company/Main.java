package com.company;

import java.util.*;

public  class Main {
    public static void printEntries (Map map1) {
//        Set<Map.Entry> entries = new HashSet<>(); //entries = set of map
        Iterator<Map> it = (Iterator<Map>) map1.entrySet().iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main(String[] args) {
	// write your code here

        Map<Integer, String> map = new LinkedHashMap<>();
        Map<String, Integer> mapURLKey = new LinkedHashMap<>();
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
        printEntries(map);

    }
    }

