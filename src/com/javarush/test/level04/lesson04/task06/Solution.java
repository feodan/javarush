package com.javarush.test.level04.lesson04.task06;

/* День недели
Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название «понедельник», «вторник», «среда», «четверг», «пятница», «суббота», «воскресенье»,
если введен номер больше или меньше 7 – вывести «такого дня недели не существует».
Пример для номера 5:
пятница
Пример для номера 10:
такого дня недели не существует
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String s = reader.readLine();
//        int i = Integer.parseInt(s);
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        if (scanner.hasNextInt()) {
            i = scanner.nextInt();
        } else {
            System.out.println("not number");
        }
        checkDay(i);
    }

    public static void checkDay(int i) {
        if (i == 1) {
            System.out.println("понедельник");
        } else if (i == 2) {
            System.out.println("вторник");
        } else if (i == 3) {
            System.out.println("среда");
        } else if (i == 4) {
            System.out.println("четверг");
        } else if (i == 5) {
            System.out.println("пятница");
        } else if (i == 6) {
            System.out.println("суббота");
        } else if (i == 7) {
            System.out.println("воскресенье");
        } else {
            System.out.println("такого дня недели не существует");
        }
    }
}