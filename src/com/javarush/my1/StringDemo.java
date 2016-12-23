package com.javarush.my1;

public class StringDemo {
    public static void main(String[] args) {
        String palindrome = "Dot saw I was Tod";
        int length = palindrome.length();
        char[] temp = new char[length];
        char[] arr = new char[length];

        for (int i = 0; i < length; i++) {
            temp[i] = palindrome.charAt(i);
        }

        for (int i = 0; i < length; i++) {
            arr[i] = temp[length - 1 - i];
        }
        String revert = new String(arr);
        System.out.println(revert);
    }
}
