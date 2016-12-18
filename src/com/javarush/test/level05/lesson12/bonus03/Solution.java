package com.javarush.test.level05.lesson12.bonus03;

import java.util.Scanner;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n > 0) {
            int first = scanner.nextInt();
            for (int i = 0; i < n - 1; i++) {
                int next = scanner.nextInt();
                if (next > first)
                    first = next;
            }

            System.out.println(first);
        }
    }
}