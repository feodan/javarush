package com.javarush.my;

public class StaticClassExample {
    private static int catCount = 0;

    public static void main(String[] args) throws Throwable{
        Cat vaska = new Cat("Bell");
        Cat murka = new Cat("Tiger");

        System.out.println("Cat count " + catCount);
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
            StaticClassExample.catCount++;
        }
    }
}
