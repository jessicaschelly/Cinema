package telas;

import telas.gerencia.TelaListarFuncionarios;
import telas.gerencia.TelaManterFilmes;
import telas.gerencia.TelaFuncionario;
import telas.gerencia.TelaCadastroFuncionario;
import telas.gerencia.TelaManterSessoes;
import telas.gerencia.TelaCadastroSessoes;
import telas.gerencia.TelaListarFilmes;
import telas.gerencia.TelaListarSessoes;
import telas.gerencia.TelaCadastroFilmes;
import telas.gerencia.TelaGerencia;
import entidades.Filme;
import entidades.Funcionario;
import entidades.Gerente;
import entidades.Produto;
import entidades.Sessao;
import interfaces.IMainFrame;
import java.awt.BorderLayout;

public class MainFrame extends javax.swing.JFrame implements IMainFrame {

    public int guiche;

    public MainFrame() {
        initComponents();

        setTitle("Compra de Ingressos Online");
        setSize(1020, 700);
        //setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setLayout(new BorderLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void exibeTelaPrincipal() {
        TelaPrincipal tp = new TelaPrincipal();
        setContentPane(tp);

        validate();
    }

    Funcionario funcionarioLogado;
    Gerente gerentelogado;

    public void exibeTelaFuncionario(Funcionario funcionario) {
        funcionarioLogado = funcionario;
        TelaFuncionario tf = new TelaFuncionario(funcionario);
        setContentPane(tf);

        validate();
    }

    public void exibeTelaFuncionario() {
        TelaFuncionario tf = new TelaFuncionario(funcionarioLogado);
        setContentPane(tf);

        validate();
    }

    public void exibeTelaGerencia(Gerente gerente) {
        gerentelogado = gerente;
        TelaGerencia tf = new TelaGerencia(gerente);
        setContentPane(tf);

        validate();
    }

    public void exibeTelaGerencia() {

        TelaGerencia tf = new TelaGerencia(gerentelogado);
        setContentPane(tf);

        validate();
    }

    public void exibeTelaCadastroFilmes(Filme filme) {
        TelaCadastroFilmes ci = new TelaCadastroFilmes(filme);
        setContentPane(ci);

        validate();
    }

    public void exibeTelaListaFilmes() {
        TelaListarFilmes tf = new TelaListarFilmes();
        setContentPane(tf);

        validate();
    }

    public void exibeTelaListaSessoes() {
        TelaListarSessoes tf = new TelaListarSessoes();
        setContentPane(tf);

        validate();
    }

    public void exibeTelaCadastroSessoes(Sessao sessao ) {
        TelaCadastroSessoes tf = new TelaCadastroSessoes(sessao );
        setContentPane(tf);

        validate();
    }

    public void exibeTelaSelecaoSessao(Filme filme) {
        TelaSelecaoSessao tf = new TelaSelecaoSessao(filme);
        setContentPane(tf);
        validate();
    }

    @Override
    public void exibeTelaSelecaoFilme() {
        TelaSelecaoFilme tf = new TelaSelecaoFilme();
        setContentPane(tf);
        validate();
    }

    public void exibeTelaPagamento(Sessao sessao, Produto produto) {
        TelaPagamento tf = new TelaPagamento(sessao, produto);
        setContentPane(tf);
        validate();
    }

    public void exibeTelaManterFilmes() {
        TelaManterFilmes tf = new TelaManterFilmes();
        setContentPane(tf);
        validate();
    }

    public void exibeTelaManterSessoes() {
        TelaManterSessoes tf = new TelaManterSessoes();
        setContentPane(tf);
        validate();
    }

    public void exibeTelaCadastrarFuncionario() {
        TelaCadastroFuncionario tf = new TelaCadastroFuncionario();
        setContentPane(tf);
        validate();
    }

    public void exibeTelaListarFuncionarios() {
        TelaListarFuncionarios tf = new TelaListarFuncionarios();
        setContentPane(tf);
        validate();
    }

    public void exibeTelaBombonier(Sessao sessao) {
        TelaBombonier tb = new TelaBombonier(sessao);
        setContentPane(tb);
        validate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
