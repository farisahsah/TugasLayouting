package com.example.tugasmobile.features;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tugasmobile.R;

public class LinearLayoutScreen extends AppCompatActivity {
    private Button signUpButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear_layout_screen);

        signUpButton = findViewById(R.id.signUpButton);


    }
}
