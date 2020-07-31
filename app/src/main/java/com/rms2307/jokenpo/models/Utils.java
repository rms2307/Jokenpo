package com.rms2307.jokenpo.models;


import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Utils {

    String opcaoApp;

    public String opcaoApp() {

        int n = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        this.opcaoApp = opcoes[n];
        switch (this.opcaoApp) {
            case "pedra":
                return "pedra";
            case "papel":
                return "papel";
            case "tesoura":
                return "tesoura";
        }
        return null;
    }

    public String jogada(String opcaoUsuario) {

        if (
                (this.opcaoApp == "tesoura" && opcaoUsuario == "papel") ||
                (this.opcaoApp == "papel" && opcaoUsuario == "pedra") ||
                (this.opcaoApp == "pedra" && opcaoUsuario == "tesoura")
        ) { //App ganhador
            return "Você Perdeu =(";
        } else if (
                (opcaoUsuario == "tesoura" && this.opcaoApp == "papel") ||
                (opcaoUsuario == "papel" && this.opcaoApp == "pedra") ||
                (opcaoUsuario == "pedra" && this.opcaoApp == "tesoura")
        ) { //Usuario ganhador
            return "Você Ganhou =D";
        } else { //Empate
            return "Empate =/";
        }
    }

}
