package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        int age;
        String sex;
        String single;
        int height;
        String upDegree;
        String military;

        public Human(int age) {
            this.age = age;
        }

        public Human(int age, String sex) {
            this.age = age;
            this.sex = sex;
        }

        public Human(int age, String sex, String single) {
            this.age = age;
            this.sex = sex;
            this.single = single;
        }

        public Human(int age, String sex, String single, int height) {
            this.age = age;
            this.sex = sex;
            this.single = single;
            this.height = height;
        }

        public Human(int age, String sex, String single, int height, String upDegree) {
            this.age = age;
            this.sex = sex;
            this.single = single;
            this.height = height;
            this.upDegree = upDegree;
        }

        public Human(int age, String sex, String single, int height, String upDegree, String military) {
            this.age = age;
            this.sex = sex;
            this.single = single;
            this.height = height;
            this.upDegree = upDegree;
            this.military = military;
        }

        public Human(int age, int height) {
            this.age = age;
            this.height = height;
        }

        public Human(String sex, String single, int height) {
            this.sex = sex;
            this.single = single;
            this.height = height;
        }

        public String getMilitary() {
            return military;
        }

        public Human(String upDegree) {
            this.upDegree = upDegree;
        }

        public Human(String upDegree, String military) {
            this.upDegree = upDegree;
            this.military = military;
        }
    }
}
