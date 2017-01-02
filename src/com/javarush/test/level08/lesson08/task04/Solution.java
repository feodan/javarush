package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Ivanov", new Date("JUNE 1 1980"));
        map.put("Petrov", new Date("JUNE 2 1981"));
        map.put("Sidorov", new Date("JUNE 3 1982"));
        map.put("Voinov", new Date("JUNE 4 1983"));
        map.put("Abramov", new Date("JUNE 5 1984"));
        map.put("Rjstin", new Date("JUNE 6 1985"));
        map.put("Volodin", new Date("JUNE 7 1986"));
        map.put("Kozlov", new Date("JUNE 8 1987"));
        map.put("Baranov", new Date("SEPTEMBER 9 1988"));
        map.put("Konov", new Date("APRIL 10 1989"));

        return (HashMap) map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().getMonth() == 5 || it.next().getValue().getMonth() == 6 || it.next().getValue().getMonth() == 7)
                it.remove();
        }
    }

//    public static void main(String[] args) {
//        HashMap<String, Date> map = createMap();
//        removeAllSummerPeople(map);
//        Iterator<HashMap.Entry<String, Date>> it = map.entrySet().iterator();
//
//        while (it.hasNext()) {
//            System.out.println(it.next());
//        }
//    }
}
