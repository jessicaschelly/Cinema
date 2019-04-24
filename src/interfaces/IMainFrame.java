package interfaces;

import entidades.Filme;
import entidades.Funcionario;
import entidades.Sessao;

public interface IMainFrame {

    void exibeTelaPrincipal();

    void exibeTelaFuncionario(Funcionario funcionario);

    void exibeTelaFuncionario();

    void exibeTelaCadastroFilmes();

    void exibeTelaListaFilmes();

    void exibeTelaCadastroSessoes();

    void exibeTelaConfirmacaoIngresso(Filme filme);
    
    void exibeTelaSelecaoFilme();
    
    void exibeTelaPagamento(Sessao sessao);

}
