/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

import java.util.ArrayList;

/**
 *
 * @author jessicassouza
 */
public enum Classificacao {
    LIVRE("0"), DEZ("10"), DOZE("12"), QUATORZE("14"), DEZESSEIS("16"), DEZOITO("18");

    public static Classificacao getClassificacao(String classificacao) {
        if (classificacao.equalsIgnoreCase("0")) {
            return Classificacao.LIVRE;
        } else if (classificacao.equalsIgnoreCase("10")) {
            return Classificacao.DEZ;
        } else if (classificacao.equalsIgnoreCase("12")) {
            return Classificacao.DOZE;
        } else if (classificacao.equalsIgnoreCase("14")) {
            return Classificacao.QUATORZE;
        } else if (classificacao.equalsIgnoreCase("16")) {
            return Classificacao.DEZESSEIS;
        } else if (classificacao.equalsIgnoreCase("18")) {
            return Classificacao.DEZOITO;
        } else {
            return null;
        }
    }
    
       private final String fieldDescription;

    private Classificacao(String value) {
        fieldDescription = value;
    }

    public String getName() {
        return fieldDescription;
    }
    
        public static String[] valuesNormais() {
        ArrayList<String> classificacoes = new ArrayList<>();

        for (Classificacao classificacao : Classificacao.values()) {
            classificacoes.add(classificacao.getName());
        }

        return classificacoes.toArray(new String[classificacoes.size()]);
    }
        
        public int getIdade () {
           int idade =  Integer.parseInt(fieldDescription);
           return idade;
        }
}
