package com.jason.zeng.testobserver;

import java.security.PublicKey;

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
public class TestSubject extends JSubject {
    //  通知内容
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        //  通知所有的目标对象
        notifyObserver();
    }
}
