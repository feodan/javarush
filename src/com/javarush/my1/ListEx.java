package com.javarush.my1;

import java.util.*;

public class ListEx {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("first", "Stop");
        map.put("second", "Look");
        map.put("third", "Listen");

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }

        List<String> list = new ArrayList<String>();
        list.add("Stop");
        list.add("Look");
        list.add("Listen");

        for (String text : list) {
            System.out.println(text);
        }

        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
