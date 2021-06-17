package com.company;

public class Hero{
    int health;//0
    int damage;
    String superAbility;

    public Hero() {
    }

    @Override
    public String toString() {
        System.out.println("Hero Health= "+getHealth()+"\nHero Damage "+getDamage()+" \nHero Aby "+getSuperAbility());
        return super.toString();
    }

    public Hero(int health, int damage, String superAbility) {
        this.health = health;
        this.damage = damage;
        this.superAbility = superAbility;
    }

    public int getHealth() {
        return health;//
    }

    public void setHealth(int health) {
        this.health = health;}

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}
