package interfaces;

import entidades.Funcionario;
import entidades.Sessao;

public interface IMainFrame {

    void exibeTelaPrincipal();

    void exibeTelaFuncionario(Funcionario funcionario);

    void exibeTelaFuncionario();

    void exibeTelaCompraDeIngressos();

    void exibeTelaCadastroFilmes();

    void exibeTelaListaFilmes();

    void exibeTelaCadastroSessoes();

    void exibeTelaConfirmacaoIngresso(Sessao sessao);
    
    void exibeTelaSelecaoFilme();
    
    void exibeTelaPagamento();

}
