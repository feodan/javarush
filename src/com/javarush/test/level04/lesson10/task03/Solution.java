package com.javarush.test.level04.lesson10.task03;

/* Хорошего не бывает много
Ввести с клавиатуры строку и число N.
Вывести на экран строку N раз используя цикл while.
Пример ввода:
абв
2
Пример вывода:
абв
абв
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int i = scanner.nextInt();
        int a = 0;
        while (a < i) {
            System.out.println(line);
            a++;
        }
    }
}
