package com.javarush.test.level10.lesson11.home08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        ArrayList<String>[] arrayOfStringList = createList();
//        printList(arrayOfStringList);
    }

//    public static ArrayList<String>[] createList() throws IOException {
////        ArrayList<String>[] listS = new ArrayList<String>[0];
//        ArrayList<String> list = new ArrayList<>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        while (true) {
//            String s = reader.readLine();
//            if (s.isEmpty()) break;
//            list.add(s);
//        }
//
//        String[] arr = list.toArray(new String[list.size()]);
////        return ;
//        return arr[arr];
//    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}