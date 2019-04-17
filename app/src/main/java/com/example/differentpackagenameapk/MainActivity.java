package com.example.differentpackagenameapk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * 一键打包出多个不同包名，不同应用名称和图标的APK
 * https://blog.csdn.net/kingmax54212008/article/details/82842517
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
