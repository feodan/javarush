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
        System.out.print("N: ");
        int n = scanner.nextInt();
//        if (n <= 0) {
//            System.exit(-1);
//        }
        int maximum = Integer.MIN_VALUE;

        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > maximum)
                maximum = arr[i];
        }

        System.out.println(maximum);
    }
}
