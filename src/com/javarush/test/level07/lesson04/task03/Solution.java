package com.javarush.test.level07.lesson04.task03;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк, индекс/номер ячейки которой совпадает с текущим индексом из массива чисел. Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        String strArr[] = new String[10];
        int numArr[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = scanner.nextLine();
        }

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = strArr[i].length();
        }

        for (int j : numArr)
            System.out.println(j);
    }
}
