package com.example.mesima3_3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int count;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.btn);
        count = 0;
    }

    public void Clicker(View view) {
        count += 1;
        btn.setText("This is a click number: "+ count);
        if(count == 6){
            btn.setText("Enough to click. Go to new start!");
            count =0;
        }
    }
}