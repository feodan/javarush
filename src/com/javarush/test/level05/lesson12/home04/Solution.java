package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

import java.util.Calendar;
import java.util.Date;

public class Solution {
    public static void main(String[] args) {
        System.out.println("11 12 2016");

        System.out.println(new Date(System.currentTimeMillis()));
//        System.out.println(new Date.toString());
    }
}
