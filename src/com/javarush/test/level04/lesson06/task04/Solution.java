package com.javarush.test.level04.lesson06.task04;

/* Сравнить имена
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение «Имена идентичны». Если имена разные, но их длины равны – вывести сообщение – «Длины имен равны».
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        compareNames(a, b);
    }

    private static void compareNames(String a, String b) {
        if (a.equals(b))
            System.out.println("Имена идентичны");
        else if (a.length() == b.length())
            System.out.println("Длины имен равны");
//        else
//            System.out.println("Nichego");
    }
}
