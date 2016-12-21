package com.javarush.test.level07.lesson09.task01;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 20; i++) {
            list.add(scanner.nextInt());
        }
        ArrayList<Integer> list_3 = new ArrayList<>();
        ArrayList<Integer> list_2 = new ArrayList<>();
        ArrayList<Integer> list_ = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) %3 == 0 && list.get(i) %2 == 0) {
                list_3.add(list.get(i));
                list_2.add(list.get(i));
            }
            else if (list.get(i) %3 == 0)
                list_3.add(list.get(i));
            else if (list.get(i) %2 == 0)
                list_2.add(list.get(i));
            else
                list_.add(list.get(i));
        }

        printList(list_3);
        printList(list_2);
        printList(list_);
    }

    public static void printList(List<Integer> list) {
        for (Integer i : list)
            System.out.println(i);
    }
}
