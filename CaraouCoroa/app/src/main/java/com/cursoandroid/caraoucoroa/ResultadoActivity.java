package com.cursoandroid.caraoucoroa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class ResultadoActivity extends AppCompatActivity {

    private ImageView imgMoeda, botaoVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        imgMoeda = findViewById(R.id.imageViewMoeda);
        botaoVoltar = findViewById(R.id.imageViewVoltar);

        //Recuperar dados
        Bundle dados  = getIntent().getExtras();
        int numero = dados.getInt("numero");

        if(numero == 0){ //cara
            imgMoeda.setImageResource(R.drawable.moeda_cara);
        }else{ //coroa
            imgMoeda.setImageResource(R.drawable.moeda_coroa);
        }

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}