package com.javarush.test.level07.lesson04.task05;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        int arr[] = new int[20];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int arr1[] = new int[10];
        int arr2[] = new int[10];

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = arr[i + 10];
        }

        for (int k : arr2) {
            System.out.println(k);
        }
    }
}
