/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Pck_View;

import Pck_Control.PedidoControl;
import Pck_Model.PedidoModel;
import Pck_Percistencia.PedidoPersistencia;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mateus
 */
public class PedidosView extends javax.swing.JFrame {

    /**
     * Creates new form PedidosView
     */
    public PedidosView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSubTitulo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        labelCodigo = new javax.swing.JLabel();
        jTextFieldCodigo = new javax.swing.JTextField();
        jButtonDeletar = new javax.swing.JButton();
        jButtonAtualizar = new javax.swing.JButton();
        jButtonCriar = new javax.swing.JButton();
        jButtonApresentar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaPedidos = new javax.swing.JTextArea();
        jButtonSair = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabelTitulo.setBackground(new java.awt.Color(173, 212, 156));
        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(64, 83, 62));
        jLabelTitulo.setText(" -- Pedidos");
        jLabelTitulo.setToolTipText("");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jLabelTitulo.setOpaque(true);

        jLabelSubTitulo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabelSubTitulo.setForeground(new java.awt.Color(64, 83, 62));
        jLabelSubTitulo.setText("Gerenciar Pedidos");

        jSeparator1.setBackground(new java.awt.Color(53, 149, 9));
        jSeparator1.setForeground(new java.awt.Color(53, 149, 9));

        labelCodigo.setBackground(new java.awt.Color(204, 204, 204));
        labelCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        labelCodigo.setForeground(new java.awt.Color(64, 83, 62));
        labelCodigo.setText("Código:");

        jTextFieldCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 212, 156)));
        jTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodigoActionPerformed(evt);
            }
        });

        jButtonDeletar.setForeground(new java.awt.Color(64, 83, 62));
        jButtonDeletar.setText("DELETAR");
        jButtonDeletar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 212, 156)));
        jButtonDeletar.setContentAreaFilled(false);
        jButtonDeletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeletarActionPerformed(evt);
            }
        });

        jButtonAtualizar.setForeground(new java.awt.Color(64, 83, 62));
        jButtonAtualizar.setText("ATUALIZAR");
        jButtonAtualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 212, 156)));
        jButtonAtualizar.setContentAreaFilled(false);
        jButtonAtualizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAtualizarActionPerformed(evt);
            }
        });

        jButtonCriar.setForeground(new java.awt.Color(64, 83, 62));
        jButtonCriar.setText("CRIAR");
        jButtonCriar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 212, 156)));
        jButtonCriar.setContentAreaFilled(false);
        jButtonCriar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCriarActionPerformed(evt);
            }
        });

        jButtonApresentar.setForeground(new java.awt.Color(64, 83, 62));
        jButtonApresentar.setText("APRESENTAR");
        jButtonApresentar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 212, 156)));
        jButtonApresentar.setContentAreaFilled(false);
        jButtonApresentar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonApresentar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonApresentarActionPerformed(evt);
            }
        });

        jTextAreaPedidos.setColumns(20);
        jTextAreaPedidos.setRows(5);
        jTextAreaPedidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(173, 212, 156)));
        jScrollPane2.setViewportView(jTextAreaPedidos);

        jButtonSair.setBackground(new java.awt.Color(173, 212, 156));
        jButtonSair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(64, 83, 62));
        jButtonSair.setText("SAIR");
        jButtonSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        jButtonSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });

        jButtonVoltar.setBackground(new java.awt.Color(173, 212, 156));
        jButtonVoltar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(64, 83, 62));
        jButtonVoltar.setText("VOLTAR");
        jButtonVoltar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        jButtonVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelSubTitulo)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1226, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldCodigo)
                                .addComponent(jButtonDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButtonApresentar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonCriar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(24, 24, 24))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(498, 498, 498)
                .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabelSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAtualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButtonApresentar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSair, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodigoActionPerformed

    private void jButtonDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeletarActionPerformed

        String codigoStr = jTextFieldCodigo.getText();
        int codigo;
        
        try {
            codigo = Integer.parseInt(codigoStr);
        } catch (NumberFormatException e) {
            // Se a conversão falhar, exibe uma mensagem de erro
            JOptionPane.showMessageDialog(this, "Por favor, insira um valor numérico válido para o código.", "Erro", JOptionPane.ERROR_MESSAGE);
            return; // Retorna para não continuar com a execução
        }
        
        PedidoControl obj_Control = new PedidoControl();
        obj_Control.deletarPedido(codigo);
    }//GEN-LAST:event_jButtonDeletarActionPerformed

    private void jButtonAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAtualizarActionPerformed
        PedidosAtualizarView segundaTela = new PedidosAtualizarView(); // Substitua "SegundaTela" pelo nome da sua classe da segunda tela
        segundaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAtualizarActionPerformed

    private void jButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCriarActionPerformed
        PedidosInserirView segundaTela = new PedidosInserirView(); // Substitua "SegundaTela" pelo nome da sua classe da segunda tela
        segundaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCriarActionPerformed

    private void jButtonApresentarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonApresentarActionPerformed

        jTextAreaPedidos.setFont(new Font("Monospaced", Font.PLAIN, 12));

        jTextAreaPedidos.setText(""); 

        PedidoPersistencia obj_PedidoPersistencia = new PedidoPersistencia(); 

        List<PedidoModel> pedidos = obj_PedidoPersistencia.listarPedidos(); 

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); 

        jTextAreaPedidos.append(
            String.format("%-5s %-17s %-25s %-15s\n", "ID", "Data", "Código do Cliente", "Valor Total")
        );
        jTextAreaPedidos.append("-------------------------------------------------------------------------------\n");

        for (PedidoModel pedido : pedidos) {
            String dataFormatada = sdf.format(pedido.getA02_dataDate());

            jTextAreaPedidos.append(
                String.format("%-5s %-17s %-25s %-15.2f\n", 
                    pedido.getA02_id(), 
                    dataFormatada, 
                    pedido.getA01_id(), 
                    pedido.getA02_valor_total()
                )
            );
        }
    }//GEN-LAST:event_jButtonApresentarActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        System.exit(0); // Encerra o programa
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        IndexView segundaTela = new IndexView(); // Substitua "SegundaTela" pelo nome da sua classe da segunda tela
        segundaTela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PedidosView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PedidosView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonApresentar;
    private javax.swing.JButton jButtonAtualizar;
    private javax.swing.JButton jButtonCriar;
    private javax.swing.JButton jButtonDeletar;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelSubTitulo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextAreaPedidos;
    private javax.swing.JTextField jTextFieldCodigo;
    private javax.swing.JLabel labelCodigo;
    // End of variables declaration//GEN-END:variables
}
