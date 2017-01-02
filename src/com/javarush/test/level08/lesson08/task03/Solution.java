package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("S1", "N1");
        map.put("S2", "N7");
        map.put("S3", "N3");
        map.put("S4", "N4");
        map.put("S5", "N5");
        map.put("S6", "N6");
        map.put("S7", "N7");
        map.put("S8", "N8");
        map.put("S9", "N9");
        map.put("S10", "N10");
        return (HashMap<String, String>) map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int i = 0;
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().equals(name))
                i++;
        }
        return i;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int i = 0;
        Iterator<Map.Entry<String,String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equals(lastName))
                i++;
        }
        return i;
    }

//    public static void main(String[] args) {
//        System.out.println(getCountTheSameLastName(createMap(), "S7"));
//        System.out.println(getCountTheSameFirstName(createMap(), "N7"));
//    }
}
