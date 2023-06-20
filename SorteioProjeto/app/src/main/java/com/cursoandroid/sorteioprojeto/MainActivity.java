package com.cursoandroid.sorteioprojeto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortearNumero(View view){

        TextView selecionado = findViewById(R.id.exibeNumeroSelec);

        //codígo do sorteio
        int numero = new Random().nextInt(11);

        selecionado.setText("Número Selecionado: "+ numero);

    }
}