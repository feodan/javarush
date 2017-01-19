package com.javarush.test.level09.lesson11.home05;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        char[] chars = line.toCharArray();

        ArrayList<Character> vowelsList = new ArrayList<>();
        ArrayList<Character> notVowelsList = new ArrayList<>();

        for (int i = 0; i < chars.length; i++) {
                if (isVowel(chars[i]))
                    vowelsList.add(chars[i]);
                else notVowelsList.add(chars[i]);
        }

        for (Character c : vowelsList)
            System.out.print(c + " ");

        System.out.println();

        for (Character c : notVowelsList)
            System.out.print(c + " ");
    }

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
