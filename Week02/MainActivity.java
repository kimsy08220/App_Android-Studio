package com.example.helloandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {    // onCreate : 화면 생성, 초기화 작업
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);     // activity_main을 읽어와서 기본 레이아웃으로 잡음
    }
}