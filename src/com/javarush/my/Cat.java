package com.javarush.my;

public class Cat {
    String name;

    public Cat(String name) {
        this.name = name;
    }

    protected void finalize() throws Throwable {
        System.out.println(name + " destroyed");
    }
}
