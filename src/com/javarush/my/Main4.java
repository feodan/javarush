package com.javarush.my;

public class Main4 {
    public static void main(String[] args) {
        String s1 = "firefox";
        System.out.println(s1.toUpperCase());
        System.out.println(s1.replace('f', 'w'));
        System.out.println(s1.charAt(2));
        System.out.println(s1.length());
        System.out.println(s1.indexOf('o'));
        System.out.println(s1.lastIndexOf('f'));
        System.out.println(s1.indexOf('t'));
        System.out.println(s1.indexOf('f', 3));

    }
}
