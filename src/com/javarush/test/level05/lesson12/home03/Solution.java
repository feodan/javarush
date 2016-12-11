package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор. Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution {
    public static void main(String[] args) {
        Mouse jerryMouse = new Mouse("Jerry", 12, 5);
        Cat tomCat = new Cat("Tom", "want Jerry", "hungry");
        Dog dogDog = new Dog("Dog", "sleep", "no agression");
        Bird bird = new Bird("healsy", "in cage");
    }

    public static class Mouse {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail) {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }

    public static class Cat {
        String name;
        String mood;
        String hungry;

        public Cat(String name, String mood, String hungry) {
            this.name = name;
            this.mood = mood;
            this.hungry = hungry;
        }
    }

    public static class Dog {
        String name;
        String state;
        String agression;

        public Dog(String name, String state, String agression) {
            this.name = name;
            this.state = state;
            this.agression = agression;
        }
    }

    public static class Bird {
        String helsy;
        String free;

        public Bird(String helsy, String free) {
            this.helsy = helsy;
            this.free = free;
        }
    }
}
