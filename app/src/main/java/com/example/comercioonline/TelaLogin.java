package com.example.comercioonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telalogin_main);
    }

    public void teladois (View view) {

        Intent in = new Intent(TelaLogin.this, TelaCadastro.class);
        startActivity(in);

    }
}