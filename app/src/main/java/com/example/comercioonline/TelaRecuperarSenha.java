package com.example.comercioonline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaRecuperarSenha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_recuperar_senha);
    }

    public void verificarsenha(View view) {

        Intent in = new Intent(TelaRecuperarSenha.this, VerificarEmail.class);
        startActivity(in);

    }
}