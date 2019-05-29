package controladores;

import entidades.Filme;
import entidades.Sessao;
import entidades.Sala;
import enums.Exibicao;
import enums.Linguagem;
import java.util.ArrayList;
import exceptions.*;
import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.stream.Collectors;

public class ControladorSessao extends Controlador {

    public final ArrayList<Sessao> sessoes = new ArrayList<>();
    private static ControladorSessao instance;

    public static ControladorSessao getInstance() {
        if (instance == null) {
            instance = new ControladorSessao();
        }
        return instance;
    }

    public Sessao cadastra(Sala sala, String horario, Filme filme, Exibicao exibicao, Linguagem linguagem) throws CampoVazioException, EntidadeNotFoundException, CadastroRepetidoException, DateTimeParseException, Exception {
        LocalTime horarioTime = LocalTime.parse(horario);

        Sessao sessao = new Sessao(sala, horarioTime, filme, exibicao, linguagem );

        if (!podeCadastrarSessao(sessao)) {
            throw new Exception("Erro ao cadastrar sessão, já possui uma em andamento no mesmo horário.");
        }

        sessoes.add(sessao);
        return sessao;
    }
    
    public void editar(Sala sala, Exibicao exibicao, Linguagem linguagem, Sessao sessaoAntiga) throws Exception {
        Sessao teste = new Sessao(sala, sessaoAntiga.getHorario(), sessaoAntiga.getFilme(), exibicao, linguagem);
        if (!podeCadastrarSessao(teste)) {
            throw new Exception("Erro ao alterar sessão, horário conflita com outra sessão na mesma sala.");
        }
        sessaoAntiga.setSala(sala);
        sessaoAntiga.setExibicao(exibicao);
        sessaoAntiga.setLinguagem(linguagem);
    }

    private boolean podeCadastrarSessao(Sessao newSessao) {
        for (Sessao sessao : sessoes) {
            if (sessao.getSala() == newSessao.getSala() && horariosColidem(sessao.getHorario(), sessao.getFilme().getDuracao().plusMinutes(15), newSessao.getHorario(), newSessao.getFilme().getDuracao().plusMinutes(15))) {
                return false;
            }
        }
        return true;
    }

    private boolean horariosColidem(LocalTime timeInicial, Duration duracao1, LocalTime timeFinal, Duration duracao2) {
        if (timeInicial.equals(timeFinal))
            return true;
        
        return (timeFinal.isBefore(timeInicial.plus(duracao1))
                && timeFinal.isAfter(timeInicial))
                || (timeFinal.plus(duracao2).isBefore(timeInicial.plus(duracao1))
                && timeFinal.plus(duracao2).isAfter(timeInicial));
    }

    public List<Sessao> getSessoesByFilme(Filme filme) {
        return sessoes.stream()
                .filter(sessao -> sessao.getFilme() == filme)
                .collect(Collectors.toList());
    }
    
   public String[] dadosSessao() {
        List<String> dados = sessoes.stream().map(x -> x.getFilme().getTitulo() + " - " + x.getHorario() + " - " + x.getSala()).collect(Collectors.toList());
        return dados.toArray(new String[0]);
    }
   
    public void remove(Sessao sessao) {
           sessoes.remove(sessao);
       }

    
       
    
}
