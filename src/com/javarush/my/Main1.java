package com.javarush.my;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;

public class Main1 {
    public static void main(String[] args) throws IOException {
        Reader r = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String s = reader.readLine();
            list.add(s);
        }
        for (int i = 0; i < list.size(); i++) {
            int j = list.size()- i -1;
            System.out.println(list.get(j));
        }
    }
}
