package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Human> ch = new ArrayList<>();
        ch.add(new Human("ch1", true, 10, new ArrayList<Human>()));
        ch.add(new Human("ch2", false, 11, new ArrayList<Human>()));
        ch.add(new Human("ch3", true, 12, new ArrayList<Human>()));

        List<Human> papa = new ArrayList<>();
        papa.add(new Human("papa", true, 33, (ArrayList<Human>) ch));

        List<Human> mama = new ArrayList<>();
        mama.add(new Human("mama", false, 30, (ArrayList<Human>) ch));

        List<Human> gper1 = new ArrayList<>();
        gper1.add(new Human("gp1", true, 70, (ArrayList<Human>) papa));
        gper1.add(new Human("gM1", false, 65, (ArrayList<Human>) papa));

        List<Human> gper2 = new ArrayList<>();
        gper2.add(new Human("gp1", true, 75, (ArrayList<Human>) mama));
        gper2.add(new Human("gM1", false, 70, (ArrayList<Human>) mama));

        System.out.println(ch.toString());
        System.out.println(papa.toString());
        System.out.println(mama.toString());
        System.out.println(gper1.toString());
        System.out.println(gper2.toString());

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }
}
