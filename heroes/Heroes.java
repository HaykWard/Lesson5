package lesson5.heroes;

import lesson5.items.Unit;

public abstract class Heroes implements Unit {

    String name;
    int hp;
    int attack;
    int armor;
    int power;
    int weight;
    boolean flag;

    public Heroes(String name, int hp, int attack, int armor, int power, int weight, boolean flag) {

        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.armor = armor;
        this.power = power;
        this.weight = weight;
        this.flag = flag;
    }

}