package com.javarush.test.level10.lesson11.home08;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() throws IOException {
        ArrayList<String>[] arrList = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList()};
        Collections.addAll(arrList[0], "aewqweqwe", "sdfsdfsfdsf", "ghjghjghjghjghj");
        Collections.addAll(arrList[1], "hjkhjkhjk");
        Collections.addAll(arrList[2], "ghjghjghfjgf", "rtuykghnbdsf");
        return arrList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}