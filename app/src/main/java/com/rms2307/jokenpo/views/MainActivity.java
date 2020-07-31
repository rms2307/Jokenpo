package com.rms2307.jokenpo.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.rms2307.jokenpo.R;
import com.rms2307.jokenpo.models.Utils;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Utils utils = new Utils();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View v){
        this.opcaoApp();
    }

    public void selecionadoPapel(View v){
        this.opcaoApp();
    }

    public void selecionadoTesoura(View v){
        this.opcaoApp();
    }

    public void opcaoApp(){
        ImageView imagemResultado = findViewById(R.id.imgResultado);

        switch (utils.opcaoApp()){
            case "pedra":
                imagemResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel":
                imagemResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura":
                imagemResultado.setImageResource(R.drawable.tesoura);
                break;
        }


    }

}