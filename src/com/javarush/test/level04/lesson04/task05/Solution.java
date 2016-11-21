package com.javarush.test.level04.lesson04.task05;

/* Положительное и отрицательное число
Ввести с клавиатуры число. Если число положительное, то увеличить его в два раза. Если число отрицательное, то прибавить единицу.
Вывести результат на экран.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println(checkPositiveNegative(a));
    }

    public static int checkPositiveNegative(int a) {
        if (a >= 0) {
            return a * 2;
        } else {
            return a + 1;
        }
    }
}