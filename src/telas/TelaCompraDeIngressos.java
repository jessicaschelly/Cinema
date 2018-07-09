package telas;

import entidades.Filme;
import entidades.Sessao;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.time.LocalTime;
import java.util.List;
import javax.swing.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;

public class TelaCompraDeIngressos extends javax.swing.JPanel {

    private JPanel mainList;

    public TelaCompraDeIngressos() {
        initComponents();

        setLayout(new BorderLayout());

        //Gera layout de lista
        mainList = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridwidth = GridBagConstraints.REMAINDER;
        gbc.weightx = 1;
        gbc.weighty = 1;
        mainList.add(new JPanel(), gbc);
        add(new JScrollPane(mainList));

        JButton voltar = new JButton("Voltar");
        voltar.addActionListener((ActionEvent e) -> {
            ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPrincipal();
        });

        add(voltar, BorderLayout.SOUTH);

        //Gera a lista de filmes
        for (Filme filme : controladores.ControladorFilme.getInstance().filmes) {
            List<Sessao> sessoes = controladores.ControladorSessao.getInstance().getSessoesByFilme(filme);

            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout((int) CENTER_ALIGNMENT));
            panel.add(new JLabel(filme.getTitulo() + " - " + filme.getExibicao().getName() + " - " + filme.getLinguagem()));

            for (Sessao sessao : sessoes) {
                JButton jb = new JButton(sessao.getHorario().toString());
                jb.addActionListener((ActionEvent e) -> {
                    if (LocalTime.now().isAfter(sessao.getHorario().plusMinutes(10))) {
                        JOptionPane.showMessageDialog(null, "Sessão começou há mais de 10 minutos atrás.");
                        return;
                    }

                    if (sessao.temVaga()) {
                        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaConfirmacaoIngresso(sessao);
                    } else {
                        JOptionPane.showMessageDialog(null, "Sessão está lotada.");
                    }
                });
                panel.add(jb);
            }

            panel.setBorder(new MatteBorder(0, 0, 1, 0, Color.GRAY));
            gbc = new GridBagConstraints();
            gbc.gridwidth = GridBagConstraints.REMAINDER;
            gbc.weightx = 1;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            mainList.add(panel, gbc, 0);

            validate();
            repaint();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup2 = new javax.swing.ButtonGroup();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    // End of variables declaration//GEN-END:variables
}
