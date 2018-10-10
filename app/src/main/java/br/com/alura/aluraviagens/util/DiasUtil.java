package br.com.alura.aluraviagens.util;

import android.support.annotation.NonNull;

import br.com.alura.aluraviagens.model.Pacote;

public class DiasUtil {

    public static final String DIAS_PLURAL = " dias";
    public static final String DIA_SINGULAR = " dia";

    @NonNull
    public static String formataEmTexto(int quantidadeDias) {
        if(quantidadeDias > 1) {
            return quantidadeDias + DIAS_PLURAL;
        } else {
            return quantidadeDias + DIA_SINGULAR;
        }
    }
}
