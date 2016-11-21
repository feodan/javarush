package com.javarush.my;

import java.util.Scanner;

public class task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        String color = "зеленый";
        if (m % 10 == 3 || m % 10 == 8) color = "желтый";
        if (m % 10 == 4 || m % 10 == 9) color = "красный";
        System.out.println(color);
    }
}
