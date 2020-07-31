package com.rms2307.jokenpo.models;


import android.view.View;
import android.widget.ImageView;

import java.util.Random;

public class Utils {

    public String opcaoApp() {

        int n = new Random().nextInt(3);
        String[] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes[n];

        switch (opcaoApp) {
            case "pedra":
                return "pedra";
            case "papel":
                return "papel";
            case "tesoura":
                return "tesoura";
        }
        return null;
    }
}
