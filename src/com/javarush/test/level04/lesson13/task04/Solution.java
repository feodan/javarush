package com.javarush.test.level04.lesson13.task04;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int i;
        for (i = 0; i < 9; i++) {
            System.out.print('8');

            if (i == 8) {
                for (int j = 0; j < 11; j++) {
                    System.out.println('8');
                }
            }
        }

    }
}
