package com.javarush.my;

public class Main6 {
    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == 0 || j == 0)
                    System.out.print("8");
            }
            System.out.println();
        }
    }
}
