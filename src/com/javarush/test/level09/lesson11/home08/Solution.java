package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел.
Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно.
lЗаполнить массивы любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> ints = new ArrayList<>();
        ints.add(new int[]{1, 1, 1, 1, 1});
        ints.add(new int[]{2, 2});
        ints.add(new int[]{3, 3, 3, 3});
        ints.add(new int[]{4, 4, 4, 4, 4, 4, 4});
        ints.add(new int[]{});
        return ints;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
