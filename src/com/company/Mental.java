package com.company;

public class Mental extends Player implements SuperAbility{

    @Override
    public void setSuperAbility(String name) {
        System.out.println(name);
    }
}
