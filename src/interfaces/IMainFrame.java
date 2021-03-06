package interfaces;

import entidades.Filme;
import entidades.Funcionario;
import entidades.Informacoes;
import entidades.Produto;
import entidades.Sessao;

public interface IMainFrame {

    void exibeTelaPrincipal();

    void exibeTelaFuncionario(Funcionario funcionario);

    void exibeTelaFuncionario();

    void exibeTelaCadastroFilmes(Filme filme);

    void exibeTelaListaFilmes();

    void exibeTelaCadastroSessoes(Sessao sessao);

    void exibeTelaSelecaoSessao(Filme filme);
    
    void exibeTelaSelecaoFilme();
    
    void exibeTelaPagamento(Informacoes informacoes);
    
    void exibeTelaManterFilmes();
    
    void exibeTelaManterSessoes();
    
    void exibeTelaCadastrarFuncionario(Funcionario func);
    
    void exibeTelaListarFuncionarios();
}   
