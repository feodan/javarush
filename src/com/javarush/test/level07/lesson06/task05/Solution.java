package com.javarush.test.level07.lesson06.task05;

import java.util.ArrayList;
import java.util.Scanner;

/* Удали последнюю строку и вставь её в начало
1. Создай список строк.
2. Добавь в него 5 строчек с клавиатуры.
3. Удали последнюю строку и вставь её в начало. Повторить 13 раз.
4. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }

        for (int i = 0; i < 13; i++) {
            String last = list.get(4);
            list.remove(4);
            list.add(0, last);
        }

        for (String k : list)
            System.out.println(k);
    }
}
