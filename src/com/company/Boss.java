package com.company;

public class Boss {

    int health;
    int damage;
    int boss_protected;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getBoss_protected() {
        return boss_protected;
    }
    public  int SetProtected(int num){
        return num;
    }

    public void setBoss_protected(int boss_protected) {
        this.boss_protected = boss_protected;
    }

    @Override
    public String toString() {
        System.out.println(" Boss health = " + getHealth() + "");
        return super.toString();
    }
}

