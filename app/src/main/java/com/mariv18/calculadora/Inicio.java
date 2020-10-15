package com.mariv18.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Inicio extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        //vista//
        findViewById(R.id.btn1).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
                                     //a donde quiero que me lleve//
        Intent ir = new Intent(this,MainActivity.class);
        startActivity(ir);//nombre del intent//

    }
}