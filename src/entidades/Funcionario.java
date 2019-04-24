package entidades;

public class Funcionario extends Empregado {

    String nome;
    String ID;

    public Funcionario(String nome, String ID) {
        super(nome);
        this.nome = nome;
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public String getID() {
        return ID;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
