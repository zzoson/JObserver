package com.jason.zeng.testobserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //初始化目标
        TestSubject testSubject = new TestSubject();

        //初始化观察者
        ConCreateObserver testUser1 = new ConCreateObserver();
        testUser1.setRole("1");
        testUser1.setTodoThing("I got it");

        //添加观察者到目标中
        testSubject.attach(testUser1);

        //发送消息，观察者将会收到此消息
        testSubject.setContent("new message");
    }
}
