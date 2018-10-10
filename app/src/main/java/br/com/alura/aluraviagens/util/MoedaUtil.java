package br.com.alura.aluraviagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    public static final String PORTUGUES = "pt";
    public static final String BRASIL = "br";
    public static final String SIMBOLO_PADRAO = "R$";
    public static final String SIMBOLO_FORMATADO = "R$ ";

    public static String formataParaMoedaBrasil(BigDecimal valor) {
        NumberFormat formataValor = DecimalFormat.getCurrencyInstance(new Locale(PORTUGUES, BRASIL));
        return formataValor.format(valor).replace(SIMBOLO_PADRAO, SIMBOLO_FORMATADO);
    }
}
