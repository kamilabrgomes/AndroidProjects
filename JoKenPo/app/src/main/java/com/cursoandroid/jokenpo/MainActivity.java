package com.cursoandroid.jokenpo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecinadaImgOpcao(View view) {
        int id = view.getId();
        ImageView imgOpcao = findViewById(id);
        String opcao = imgOpcao.getTag().toString();

        this.opcaoSelecionada(opcao);

    }

    public void opcaoSelecionada(String escolhaUsuario) {

        ImageView imgResultado = findViewById(R.id.imgResultado);
        TextView textResultado = findViewById(R.id.textResultado);

        String[] opcoes = {"pedra", "papel", "tesoura"};
        int numero = new Random().nextInt(3);

        String escolhaApp = opcoes[numero];

        switch (escolhaApp) {
            case "pedra":
                imgResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imgResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imgResultado.setImageResource(R.drawable.tesoura);
                break;
        }

        /*Regras do jogo:
         * tesoura ganha do papel,
         * papel ganha da pedra e
         * pedra ganha da tesoura
         * */
        if(
                (escolhaApp.equals("tesoura") && escolhaUsuario.equals("papel")) ||
                (escolhaApp.equals("papel") && escolhaUsuario.equals("pedra")) ||
                (escolhaApp.equals("pedra") && escolhaUsuario.equals("tesoura"))
        ){//App ganhador
            textResultado.setText("Você perdeu!");

        }else if(
                (escolhaUsuario.equals("tesoura") && escolhaApp.equals("papel")) ||
                (escolhaUsuario.equals("papel") && escolhaApp.equals("pedra")) ||
                (escolhaUsuario.equals("pedra") && escolhaApp.equals("tesoura"))
        ){//Usuário ganhador
            textResultado.setText("Você ganhou!");

        }else{
            //Empate
            textResultado.setText("Empate!");
        }
    }
}