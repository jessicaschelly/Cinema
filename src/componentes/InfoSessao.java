/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import entidades.Filme;
import entidades.Sessao;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.time.LocalTime;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import telas.MainFrame;

/**
 *
 * @author jsouza
 */
public class InfoSessao extends javax.swing.JPanel {

    /**
     * Creates new form InfoSessao
     */
    private Filme filme;

    public InfoSessao(Filme filme) {
        this.filme = filme;
        initComponents();
        this.setOpaque(false);

        
         this.setBackground(new Color(0,0,0,0));

        List<Sessao> sessoes = controladores.ControladorSessao.getInstance().getSessoesByFilme(filme);
        
                
                
       JLabel l = new JLabel(filme.getExibicao().getName() + " - " + filme.getLinguagem().name() + ": ");
       l.setFont(new Font(Font.SERIF, Font.PLAIN, 16));
       l.setForeground(Color.white);
        this.add(l);
        
        if (sessoes.size() == 0){
            l = new JLabel("Este filme não tem sessões disponíveis!");
       l.setFont(new Font(Font.SERIF, Font.BOLD, 16));
       l.setForeground(Color.white);
        this.add(l);
        }
        
        for (Sessao sessao : sessoes) {
            MyButton jb = new MyButton(sessao.getHorario().toString());
            jb.addActionListener((ActionEvent e) -> {
                if (LocalTime.now().isAfter(sessao.getHorario().plusMinutes(10))) {
                    JOptionPane.showMessageDialog(SwingUtilities.getWindowAncestor(this), "Sessão começou há mais de 10 minutos atrás.");
                    return;
                }
                else if (sessao.temVaga()) {
                     ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPagamento(sessao);
                } else {
                    JOptionPane.showMessageDialog( null, "Sessão está lotada.");
                }
            });
            this.add(jb);
        }
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 10, 10));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
