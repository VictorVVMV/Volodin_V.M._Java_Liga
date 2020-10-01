package com.company.FIRST_HOMEWORK_FOURMILLIONSANDDEADLOCK.Deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {

  static class Friend {
    private final String name;

    public Friend(String name) {
      this.name = name;
    }

    public String getName() {
      return name;
    }

    public void bow(Friend bower) {
      /**
      Во избежание взаимной блокировки убираем избыточную синхронизацию со всего метода и
       добавляем код в блок synchronized, таким образом, избегаем deadlock-а
       */
      synchronized (bower) {
        System.out.format("%s: %s подстрелил меня!\n", this.name, bower.getName());
        System.out.format("%s: стреляю в ответ!\n", this.name);

      }
      bower.bowBack(this);
    }
    /**
      По аналогии с кодом выше, снимаем синхронизацию со всего метода и добавляем блок synchronized
     */
    public void bowBack(Friend bower) {
      synchronized (bower) {
        System.out.format("%s: %s подстрелил меня!\n", this.name, bower.getName());
      }
    }
  }

  /**
   * Точка входа в программу
   *
   * @param args аргументы командной строки
   */
  public static void main(String[] args) {
    Friend alphonse = new Friend("Alphonse");
    Friend gaston = new Friend("Gaston");

    new Thread(() -> alphonse.bow(gaston)).start();
    new Thread(() -> gaston.bow(alphonse)).start();
  }
}

