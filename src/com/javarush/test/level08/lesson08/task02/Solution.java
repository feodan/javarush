package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        return (HashSet<Integer>) set;

    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next()>10) {
                it.remove();
            }
        }
//        for (Integer i : set)
//                System.out.println(i);
        return (HashSet<Integer>) set;
    }

//    public static void main(String[] args) {
//        createSet();
//        removeAllNumbersMoreThan10(createSet());
//    }
}
