package com.example.tugasmobile.features;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tugasmobile.R;
//import com.example.tugasmobile.features.auth.LoginActivity;
//import com.example.tugasmobile.features.auth.RegisterActivity;

public class RelativeLayoutScreen extends AppCompatActivity {

    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout_screen);

        // Inisialisasi komponen UI
        loginButton = findViewById(R.id.login_button);
        registerButton = findViewById(R.id.register_button);

        // Set event listener untuk tombol masuk
        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(RelativeLayoutScreen.this, LinearLayoutScreen.class);
                startActivity(intent);
            }
        });



    }
}