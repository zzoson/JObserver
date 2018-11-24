package com.jason.zeng.testobserver;

import java.util.ArrayList;
import java.util.List;

/**
 * .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .   .
 * .        __________________                                                                      .
 * .       |                  )                                                 Created
 * .       |__________       /                                                                      .
 * .                  ）    /                                                         on 2018/11/24
 * .                 /    /                                                                         .
 * .                /    /
 * .               /    /                                                                           .
 * .              /    /       ______  .             _______       _______        .___   _____
 * .             /    /       /      \/|            /  __   )     /       \       (   |_/     )     .
 * .            /    /       /   ___   |           |  /  \_/     /   ___   \      |           |
 * .   |\      /    /       |   /   \  |        .   \  \        |   /   \   |     |    ___    |     .
 * .   | \____/    /        |   \___/  |       / \   \  \       |   \___/   |     |   |   |   |
 * .    \         /          \          \/\    |  \___)  \       \         /      |   |   |   |     .
 * .     \_______/            \______/\___/     \________)        \_______/       |___)   |___)
 * .                                                                                                .
 * .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .  .   .
 */
class JSubject {
    //  1、定义集合保存需要通知的观察者
    private final List<IJObserver> observerList = new ArrayList<>();

    //  2、添加观察者
    public void attach(IJObserver observer) {
        if(!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    //  3、移除观察者
    public void detach(IJObserver observer) {
        if (observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    //  4、遍历集合通知观察者更新
    public void notifyObserver() {
        for (IJObserver jObserver : observerList) {
            jObserver.update(this);
        }
    }
}
