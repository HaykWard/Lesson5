package lesson5.items;

import lesson5.heroes.Heroes;

public interface Unit {

      void startGame();

      void endGame();

      void attack(Heroes target);

      void loot(Heroes target);

      void info();

}
