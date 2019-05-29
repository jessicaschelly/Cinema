package controladores;

import entidades.Filme;
import java.util.ArrayList;
import enums.*;
import exceptions.*;
import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.stream.Collectors;

public class ControladorFilme extends Controlador {

    public final ArrayList<Filme> filmes = new ArrayList<>();
    private static ControladorFilme instance;

    public static ControladorFilme getInstance() {
        if (instance == null) {
            instance = new ControladorFilme();
        }
        return instance;
    }

    public Filme cadastra(String titulo, String duracao, String genero, String sinopse, Linguagem linguagem, Exibicao exibicao, String classificacao, String image) throws CampoVazioException, EntidadeNotFoundException, CadastroRepetidoException {
        verificaCampoVazio(titulo, "Titulo");
        verificaCampoVazio(duracao, "Duração");
        verificaCampoVazio(genero, "Gênero");
        verificaCampoVazio(sinopse, "Sinopse");
        verificaCampoVazio(image, "Imagem");

        int classificacaoInt = Integer.parseInt(classificacao);

        Duration duracaoTime = Duration.between(LocalTime.MIN, LocalTime.parse(duracao));

        if (getFilmeByTitulo(titulo) != null) {
            throw new CadastroRepetidoException("Erro: Filme com titulo '" + titulo + "' já cadastrado.");
        }
         
        Filme filme = new Filme(titulo, duracaoTime, genero, sinopse, linguagem, exibicao, classificacaoInt, image);
        
        filmes.add(filme);
        return filme;
    }

    public Filme getFilmeByTitulo(String titulo) {
        return filmes.stream()
                .filter(filme -> filme.getTitulo().equals(titulo))
                .findFirst().orElse(null);
    }

    public String[] nomesFilmes() {
        List<String> names = filmes.stream().map(x -> x.getTitulo()).collect(Collectors.toList());
        return names.toArray(new String[0]);
    }
    
       public String[] nomesFilmesEDescricao() {
        List<String> names = filmes.stream().map(x -> x.getTitulo() + " - " +x.getLinguagem() + " - " + x.getExibicao().getName()).collect(Collectors.toList());
        return names.toArray(new String[0]);
    }
     
       
       public void remove(Filme filme) {
           filmes.remove(filme);
       }

}
