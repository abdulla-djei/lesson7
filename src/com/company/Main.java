package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Hero hero1 = new Hero(250, 20, "Mental");
        hero1.toString();
        Hero hero2 = new Hero(250, 20, "Mental");
        Hero hero3 = new Hero(250, 20, "Mental");
        Hero hero4 = new Hero(250, 20, "Mental");
        Hero[] heroes = {hero1, hero2, hero3, hero4};
        MagicDoor allHero = new MagicDoor();
//        allHero.addHero(heroes);

    }
}
