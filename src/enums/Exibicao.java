package enums;

import java.util.ArrayList;

public enum Exibicao {
    DUASDIMENSOES("2D"), TRESDIMENSOES("3D");

    public static Exibicao getExibicao(String letra) {
        if (letra.equalsIgnoreCase("2D")) {
            return Exibicao.DUASDIMENSOES;
        } else if (letra.equalsIgnoreCase("3D")) {
            return Exibicao.TRESDIMENSOES;
        } else {
            return null;
        }
    }

    private final String fieldDescription;

    private Exibicao(String value) {
        fieldDescription = value;
    }

    public String getName() {
        return fieldDescription;
    }

    public static String[] valuesNormais() {
        ArrayList<String> exibicoes = new ArrayList<>();

        for (Exibicao exibicao : Exibicao.values()) {
            exibicoes.add(exibicao.getName());
        }

        return exibicoes.toArray(new String[exibicoes.size()]);
    }
}
