package com.javarush.my;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                System.out.println(i);
            }
        }
    }
}
