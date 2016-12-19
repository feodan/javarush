package com.javarush.test.level07.lesson04.task04;

import java.util.Scanner;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int numArr[] = new int[10];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = scanner.nextInt();
        }

        int arr2[] = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = numArr[numArr.length - i - 1];
        }
        for (int k : arr2) {
            System.out.println(k);
        }
    }
}
