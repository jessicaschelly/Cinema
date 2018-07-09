package entidades;

public class Ingresso {

    public int ID;

    public Sessao sessao;

    public int valor;

    public Ingresso(int ID, Sessao sessao, int valor) {
        this.ID = ID;
        this.sessao = sessao;
        this.valor = valor;
    }

}
