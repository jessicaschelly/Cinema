package entidades;

public class Sala {

    private String nomeDaSala;

    public Sala(String nomeDaSala) {
        this.nomeDaSala = nomeDaSala;
    }

    public String getNomeDaSala() {
        return nomeDaSala;
    }

    public void setNomeDaSala(String nomeDaSala) {
        this.nomeDaSala = nomeDaSala;
    }

    public String toString() {
        return nomeDaSala;
    }

}
