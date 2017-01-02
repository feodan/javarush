package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        for (Map.Entry<String, String> outer : map.entrySet()) {
            for (Map.Entry<String, String> inner : map.entrySet()) {
                if (outer.getValue().equals(inner.getValue()))
                    map.remove(inner);
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

//    public static void main(String[] args) {
//        HashMap<String, String> map = createMap();
//        removeItemFromMapByValue(map, "N7");
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + pair.getValue());
//        }
//    }
}
