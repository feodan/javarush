package com.javarush.test.level07.lesson09.task02;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(scanner.nextLine());
        }

        list.remove(2);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(list.size() - i - 1));
        }

//        for (int i = 0; i < list.size(); i++) {
//            ArrayList<String> list_ = new ArrayList<>();
//            for (int j = 0; j < list.get(i).length(); j++) {
//                list_.add(String.valueOf(list.get(i).charAt(j)));
//            }
//
//            for (int k = 0; k < list_.size(); k++) {
//                System.out.print(list_.get(list_.size() - 1 - k));
//            }
//            System.out.println();
//        }
    }
}

