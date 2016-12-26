package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
    public static void main(String[] args) {
        Human grandPa1 = new Human("Gp1", true, 78, null, null);
        Human grandPa2 = new Human("Gp2", true, 79, null, null);

        Human grandMa1 = new Human("Gm1", false, 70, null, null);
        Human grandMa2 = new Human("Gm2", false, 71, null, null);

        Human pa = new Human("pa", true, 35, grandPa1, grandMa1);
        Human ma = new Human("ma", false, 40, grandPa2, grandMa2);

        Human ch1 = new Human("ch1", true, 10, pa, ma);
        Human ch2 = new Human("ch2", false, 12, pa, ma);
        Human ch3 = new Human("ch3", true, 14, pa, ma);

        System.out.println(grandPa1.toString());
        System.out.println(grandPa2.toString());
        System.out.println(grandMa1.toString());
        System.out.println(grandMa2.toString());
        System.out.println(pa.toString());
        System.out.println(ma.toString());
        System.out.println(ch1.toString());
        System.out.println(ch2.toString());
        System.out.println(ch3.toString());
    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private Human father;
        private Human mother;

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
