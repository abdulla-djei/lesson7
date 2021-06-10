package com.company;

import java.util.Arrays;

public class MagicDoor {

    public static Hero[] addHero(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(Arrays.asList(heroes[i]));
        }
        return heroes;
    }
}
