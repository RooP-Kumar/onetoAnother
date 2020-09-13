package com.example.newapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class AnotherActivity extends AppCompatActivity {
    private TextView tv;
    private Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        btn2 = findViewById(R.id.button2);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Name");
        tv = findViewById(R.id.textView2);
        tv.setText("Hello " +  name + " How are you?");

    }

    void returnToTheMain(View view) {
        Intent intent = new Intent(AnotherActivity.this, MainActivity.class);
        startActivity(intent);
    }
}