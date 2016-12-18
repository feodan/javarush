package com.javarush.my;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N: ");
        int n = scanner.nextInt();
        if (n > 0) {
            int first = scanner.nextInt();
            for (int i = 0; i < n - 1; i++) {
                int next = scanner.nextInt();
                if (next > first)
                    first = next;
            }

            System.out.println(first);
        }
    }
}
