package com.javarush.my;

import java.util.ArrayList;

public class ArrayListOpositeOrder {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qwerty");

        System.out.println(list.get(0));

        ArrayList<String> list_ = new ArrayList<>();
        for (int i = 0; i < list.get(0).length(); i++) {
            list_.add(String.valueOf(list.get(0).charAt(i)));
        }

        for (int i = 0; i < list_.size(); i++) {
            System.out.print(list_.get(list_.size() - 1 - i));
        }
    }
}
