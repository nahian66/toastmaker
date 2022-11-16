package com.crisisstudio.trial1library;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.crisisstudio.trial1toastlibrary.toastmaker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toastmaker.newtoast(this, "Sample Toast");

    }
}