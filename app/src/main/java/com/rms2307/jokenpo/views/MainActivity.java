package com.rms2307.jokenpo.views;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.rms2307.jokenpo.R;
import com.rms2307.jokenpo.models.Utils;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Utils utils = new Utils();
    Integer j = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra(View v) {
        this.jogada("pedra");
    }

    public void selecionadoPapel(View v) {
        this.jogada("papel");
    }

    public void selecionadoTesoura(View v) {
        this.jogada("tesoura");
    }

    public void jogada(String opcaoUsuario) {
        TextView txtResultado = findViewById(R.id.txtResultado);
        ImageView imagemResultado = findViewById(R.id.imgResultado);
        ProgressBar jogadas = findViewById(R.id.progressBarJogadas);

        switch (utils.opcaoApp()) {
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

        this.j = this.j + 1;
        jogadas.setProgress(this.j);
        Toast.makeText(this, "Jogada: " + this.j, Toast.LENGTH_SHORT).show();

        if(this.j == 5){
            txtResultado.setText("FIM DA RODADA");
            this.j = 0;
        }else{
            txtResultado.setText(utils.jogada(opcaoUsuario));
        }
    }

}