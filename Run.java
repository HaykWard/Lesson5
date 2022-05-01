package lesson5;

import lesson5.heroes.*;
import lesson5.items.Armor;
import lesson5.items.Unit;
import lesson5.items.Weapon;

public class Run {

    public static void main(String[]args){


        //Создание персонажей (Орк, человек, ельф)
        Human adam = new Human("Adam", 100, 0, 10, 10, 30, false, 12);
        Orc orc = new Orc("Varan", 100, 50, 30, 10, 40, false, 40);
        Elf elf = new Elf("Suru", 5, 50, 40, 5, 12, false, 33);

        //Создание персонажей (Ведьмы)
        Witch mona = new Witch("Mona", 120, 20, 50, 10, 50, false, 15);
        Witch samarika = new Witch("Samarika", 130, 25, 40, 20, 60, false, 33 );

        ////Создание персонажей (Драконы)
        Dragon vixr = new Dragon("Vixr", 300, 50, 60, 30, 120, false, 40);
        Dragon svot = new Dragon("Swot", 500, 100, 80, 60, 90, false, 11);


        //Создание инвентаря
        //Созжания оружия
        Weapon axe =  new Weapon("Axe", 3, 10, 1,12,10);
        Weapon sword =  new Weapon("Axe", 2, 11, 2,39,22);
        Weapon hammer =  new Weapon("Axe", 5, 44, 3,22,11);


        //Создание брони
        Armor helmet = new Armor("Helmet", 2, 30, 1, 12);
        Armor gloves = new Armor("Gloves", 4, 20, 3, 33);
        Armor body = new Armor("Body", 3, 10, 10, 40);

        //Вызовы методов
        orc.attack(adam);
        orc.attack(adam);
        elf.attack(adam);
        elf.loot(adam);


    }
}
