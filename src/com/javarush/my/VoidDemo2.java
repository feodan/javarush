package com.javarush.my;

public class VoidDemo2 {
    /**
     * Это конструктор
     */
    public VoidDemo2() {
        System.out.println("Constructor");
    }

    /**
     * А это уже обычный метод, даже не смотря на сходство с
     * именем класса, поскольку имеется возвращаемый тип void
     */
    private void VoidDemo2() {
        System.out.println("Method");
    }

    public static void main(String s[]) {
        VoidDemo2 m = new VoidDemo2();
    }
}
