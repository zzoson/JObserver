package com.jason.zeng.testobserver;

import android.util.Log;

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
public class ConCreateObserver implements IJObserver {
    //  定义角色
    private String role;

    //  定义事件
    private String todoThing;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getTodoThing() {
        return todoThing;
    }

    public void setTodoThing(String todoThing) {
        this.todoThing = todoThing;
    }

    @Override
    public void update(JSubject jSubject) {
        String content = ((TestSubject)jSubject).getContent();
        Log.d("test",role + content + todoThing);
    }

}
