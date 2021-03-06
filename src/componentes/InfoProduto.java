/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package componentes;

import entidades.Informacoes;
import entidades.Produto;
import entidades.Sessao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import telas.MainFrame;

/**
 *
 * @author User
 */
public class InfoProduto extends javax.swing.JPanel {

    /**
     * Creates new form InfoProduto
     */
    private final Produto produto;
    private final Informacoes informacoes;
    
    public InfoProduto(Produto produto, Informacoes informacoes) {
        initComponents();
        this.informacoes = informacoes;
        this.produto = produto;
        this.lbl_preco.setText("R$: " + produto.getPrecoString());
        this.lbl_nomeProduto.setText(produto.getNome());
        this.btn_produto.setIcon(new ImageIcon(produto.getImage()));
        this.btn_produto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "O "+ produto.getNome() + " é composto por: " + produto.getDetalhes());
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_produto = new javax.swing.JButton();
        lbl_nomeProduto = new javax.swing.JLabel();
        lbl_preco = new javax.swing.JLabel();
        btn_mais = new javax.swing.JButton();

        setBackground(new java.awt.Color(250, 250, 250));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(215, 215, 215)));

        btn_produto.setActionCommand("abacaxi");
        btn_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_produtoActionPerformed(evt);
            }
        });

        lbl_nomeProduto.setBackground(new java.awt.Color(79, 79, 79));
        lbl_nomeProduto.setForeground(new java.awt.Color(79, 79, 79));
        lbl_nomeProduto.setText("Abacaxi Pérola AV 1un");

        lbl_preco.setForeground(new java.awt.Color(52, 163, 55));
        lbl_preco.setText("R$ 5,99");

        btn_mais.setBackground(new java.awt.Color(52, 163, 55));
        btn_mais.setForeground(new java.awt.Color(250, 250, 250));
        btn_mais.setText("Comprar");
        btn_mais.setActionCommand("");
        btn_mais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_maisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbl_preco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_mais, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbl_nomeProduto)
                    .addComponent(btn_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_nomeProduto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_preco)
                    .addComponent(btn_mais))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_produtoActionPerformed
   

    }//GEN-LAST:event_btn_produtoActionPerformed

    private void btn_maisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_maisActionPerformed
        informacoes.produto = produto; 
        ((MainFrame) SwingUtilities.getWindowAncestor(this)).exibeTelaPagamento(informacoes);
    }//GEN-LAST:event_btn_maisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_mais;
    private javax.swing.JButton btn_produto;
    private javax.swing.JLabel lbl_nomeProduto;
    private javax.swing.JLabel lbl_preco;
    // End of variables declaration//GEN-END:variables
}
