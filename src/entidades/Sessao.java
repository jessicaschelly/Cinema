package entidades;

import java.time.*;
import java.util.*;

public class Sessao {

    Sala sala;
    LocalTime horario;
    Filme filme;

    public final ArrayList<Poltrona> poltronas = new ArrayList<>();

    public Sessao(Sala sala, LocalTime horario, Filme filme) {
        poltronas.add(new Poltrona());
        poltronas.add(new Poltrona());
        poltronas.add(new Poltrona());
        poltronas.add(new Poltrona());

        this.sala = sala;
        this.horario = horario;
        this.filme = filme;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public boolean temVaga() {
        for (Poltrona poltrona : poltronas) {
            if (!poltrona.ocupada) {
                return true;
            }
        }
        return false;
    }

}
