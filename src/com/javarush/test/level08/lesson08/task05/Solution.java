package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, String> outer : map.entrySet()) {
            int count = 0;
            for (Map.Entry<String, String> inner : map.entrySet()) {
                if (outer.getValue().equals(inner.getValue()))
                    count++;
            }
            if (count > 1)
                list.add(outer.getValue());
        }
        for (String s : list)
            removeItemFromMapByValue(map, s);
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
//        removeTheFirstNameDuplicates(map);
//        for (Map.Entry<String, String> element : map.entrySet()) {
//            System.out.println(element.getKey() + element.getValue());
//        }
//    }
}
