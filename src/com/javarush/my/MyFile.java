package com.javarush.my;

public class MyFile {
    private String filename = null;

    public void initialize(String name) {
        this.filename = name;
    }

    public void initialize(String folter, String name) {
        this.filename = folter + name;
    }

    public void initialize(MyFile file, String name) {
//        this.filename = file.getFolder() + name;
    }

    public static void main(String[] args) {
        MyFile file = new MyFile();
        file.initialize("c:\\data\\a.txt");
        System.out.println(file.filename);

        file.initialize("c:\\data\\", "a.txt");
        System.out.println(file.filename);

//        String text = file.readText();


    }
}
