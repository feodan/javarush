package com.javarush.my1;

import java.util.ArrayList;

public class Concat {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qweqweqwe");

        String res = list.get(0).concat("wwwwwwww");

        System.out.println(res);
    }
}
