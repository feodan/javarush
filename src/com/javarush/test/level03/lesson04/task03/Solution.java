package com.javarush.test.level03.lesson04.task03;

/* StarCraft
Создать 10 зергов, 5 протосов и 12 терран.
Дать им всем уникальные имена.
*/

public class Solution
{
    public static void main(String[] args)
    {
        new Zerg().name = "zerg1";
        new Zerg().name = "zerg2";
        new Zerg().name = "zerg3";
        new Zerg().name = "zerg4";
        new Zerg().name = "zerg5";
        new Zerg().name = "zerg6";
        new Zerg().name = "zerg7";
        new Zerg().name = "zerg8";
        new Zerg().name = "zerg9";
        new Zerg().name = "zerg0";

        new Protos().name = "protos1";
        new Protos().name = "protos2";
        new Protos().name = "protos3";
        new Protos().name = "protos4";
        new Protos().name = "protos5";

        new Terran().name = "terran1";
        new Terran().name = "terran2";
        new Terran().name = "terran3";
        new Terran().name = "terran4";
        new Terran().name = "terran5";
        new Terran().name = "terran6";
        new Terran().name = "terran7";
        new Terran().name = "terran8";
        new Terran().name = "terran9";
        new Terran().name = "terran10";
        new Terran().name = "terran11";
        new Terran().name = "terran12";

    }

    public static class Zerg
    {
        public String name;
    }

    public static class Protos
    {
        public String name;
    }

    public static class Terran
    {
        public String name;
    }
}