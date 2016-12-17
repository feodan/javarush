package com.javarush.my;

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
//                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

//        String grandFatherName = reader.readLine();
        String grandFatherName = "дедушка Вася";
        Cat grandFather = new Cat(grandFatherName);

//        String grandMatherName = reader.readLine();
        String grandMatherName = "бабушка Мурка";
        Cat grandMather = new Cat(grandMatherName);

//        String fatherName = reader.readLine();
        String fatherName = "папа Котофей";
        Cat catFather = new Cat(fatherName, null, grandFather);

//        String motherName = reader.readLine();
        String motherName = "мама Василиса";
        Cat catMother = new Cat(motherName, grandMather, null);

//        String daughterName = reader.readLine();
        String daughterName = "сын Мурчик";
        Cat catSon = new Cat(daughterName, catMother, catFather);

//        String sonName = reader.readLine();
        String sonName = "дочь Пушинка";
        Cat catDaughter = new Cat(sonName, catMother, catFather);

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

        Cat(String name, Cat mother, Cat father) {
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            String res = "";
            if (mother == null && father == null)
                res = "Cat name is " + name + ", no mother, no father";

            else if (mother == null && father != null)
                res = "Cat name is " + name + ", no mother" + ", father is " + father.name;

            else if (mother != null && father == null)
                res = "Cat name is " + name + ", mother is " + mother.name + ", no father";

            else if (mother != null && father != null)
                res = "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
            return res;
        }
    }
}
