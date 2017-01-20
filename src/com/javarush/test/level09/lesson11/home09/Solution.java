package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        HashMap<String, Cat> cats = new HashMap<>();
        cats.put("name1", new Cat("cat0"));
        cats.put("name2", new Cat("cat1"));
        cats.put("name3", new Cat("cat2"));
        cats.put("name4", new Cat("cat3"));
        cats.put("name5", new Cat("cat4"));
        cats.put("name6", new Cat("cat5"));
        cats.put("name7", new Cat("cat6"));
        cats.put("name8", new Cat("cat7"));
        cats.put("name9", new Cat("cat8"));
        cats.put("name10", new Cat("cat9"));
        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> names = new HashSet<>();
        for (Map.Entry<String, Cat> s : map.entrySet())
            names.add(s.getValue());
        return names;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
