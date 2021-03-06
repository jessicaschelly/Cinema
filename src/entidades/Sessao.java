package entidades;

import enums.Exibicao;
import enums.Linguagem;
import java.time.*;
import java.util.*;

public class Sessao {

    Sala sala;
    LocalTime horario;
    Filme filme;
    private Exibicao exibicao;
    private Linguagem linguagem;

    public final ArrayList<Poltrona> poltronas = new ArrayList<>();

    public Sessao(Sala sala, LocalTime horario, Filme filme, Exibicao exibicao, Linguagem linguagem) {
        poltronas.add(new Poltrona("A-1"));    
        poltronas.add(new Poltrona("A-2"));    
        poltronas.add(new Poltrona("A-3"));    
        poltronas.add(new Poltrona("A-4"));    
        poltronas.add(new Poltrona("B-1"));    
        poltronas.add(new Poltrona("B-2"));    
        poltronas.add(new Poltrona("B-3"));    
        poltronas.add(new Poltrona("B-4"));    
        poltronas.add(new Poltrona("C-1"));    
        poltronas.add(new Poltrona("C-2"));    
        poltronas.add(new Poltrona("C-3"));    
        poltronas.add(new Poltrona("C-4"));    
       
        this.sala = sala;
        this.horario = horario;
        this.filme = filme;
        this.exibicao = exibicao;
        this.linguagem = linguagem;
        
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

    public Exibicao getExibicao() {
        return exibicao;
    }

    public void setExibicao(Exibicao exibicao) {
        this.exibicao = exibicao;
    }

    public Linguagem getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(Linguagem linguagem) {
        this.linguagem = linguagem;
    }

}
