package com.javarush.my;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        if (sc.hasNextInt()) {
            int i = sc.nextInt();
            System.out.println(i * 2);
        } else {
            System.out.println("Вы ввели не целое число");
        }
    }
}
