package com.javarush.test.level06.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: У каждой кошки есть имя и кошка-мама. Создать класс, который бы описывал данную ситуацию. Создать два объекта: кошку-дочь и кошку-маму. Вывести их на экран.
Новая задача: У каждой кошки есть имя, кошка-папа и кошка-мама. Изменить класс Cat так, чтобы он мог описать данную ситуацию.
Создать 6 объектов: дедушку(папин папа), бабушку(мамина мама), папу, маму, сына, дочь.
Вывести их всех на экран в порядке: дедушка, бабушка, папа, мама, сын, дочь.

Пример ввода:
дедушка Вася
бабушка Мурка
папа Котофей
мама Василиса
сын Мурчик
дочь Пушинка

Пример вывода:
Cat name is дедушка Вася, no mother, no father
Cat name is бабушка Мурка, no mother, no father
Cat name is папа Котофей, no mother, father is дедушка Вася
Cat name is мама Василиса, mother is бабушка Мурка, no father
Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей
Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
*/

public class Solution {
    public static void main(String[] args) throws IOException {
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
//        String grandFatherName = "дедушка Вася";
        Cat grandFather = new Cat(grandFatherName);

        String grandMatherName = reader.readLine();
//        String grandMatherName = "бабушка Мурка";
        Cat grandMather = new Cat(grandMatherName);

        String fatherName = reader.readLine();
//        String fatherName = "папа Котофей";
        Cat catFather = new Cat(fatherName, grandFather, null);

        String motherName = reader.readLine();
//        String motherName = "мама Василиса";
        Cat catMother = new Cat(motherName, null, grandMather);

        String daughterName = reader.readLine();
//        String daughterName = "сын Мурчик";
        Cat catSon = new Cat(daughterName, catFather, catMother);

        String sonName = reader.readLine();
//        String sonName = "дочь Пушинка";
        Cat catDaughter = new Cat(sonName, catFather, catMother);

        System.out.println(grandFather);
        System.out.println(grandMather);
        System.out.println(catFather);
        System.out.println(catMother);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String res = "";
            if (mother == null && father == null)
                res =  "Cat name is " + name + ", no mother, no father";

            else if (mother == null && father != null)
                res =  "Cat name is " + name + ", no mother" + ", father is " + father.name;

            else if (mother != null && father == null)
                res =  "Cat name is " + name + ", mother is " + mother.name + ", no father";

            else if (mother != null && father != null)
                res =  "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            return res;
        }
    }
}