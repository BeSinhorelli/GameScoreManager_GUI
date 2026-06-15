/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Jogo;
import DAO.ErpDAOException;
import DAO.JogoDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.BorderFactory;
import javax.swing.SwingConstants;

public class ListarJogo extends javax.swing.JFrame {

    private Jogo J = new Jogo();
    int id, posicao;
    private static ArrayList<Jogo> jogos = new ArrayList<Jogo>();

    public ListarJogo() {
        initComponents();
        setResizable(false);
        setTitle("Listar Jogos - Sistema de Scores");
        aplicarEstilos();
        setLocationRelativeTo(null);
    }
    
    private void aplicarEstilos() {
        // Fundo da janela
        getContentPane().setBackground(new Color(245, 245, 245));
        
        // Estilo dos labels
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jLabel1.setForeground(new Color(40, 40, 40));
        jLabel1.setPreferredSize(new Dimension(80, 25));
        
        jLabel2.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jLabel2.setForeground(new Color(40, 40, 40));
        jLabel2.setPreferredSize(new Dimension(80, 25));
        
        jLabel6.setFont(new Font("Segoe UI", Font.BOLD, 14));
        jLabel6.setForeground(new Color(40, 40, 40));
        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Estilo dos campos de texto
        jTextField1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        jTextField1.setBackground(Color.WHITE);
        jTextField1.setForeground(Color.BLACK);
        jTextField1.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        jTextField1.setEditable(false);
        jTextField1.setPreferredSize(new Dimension(250, 35));
        
        jTextField2.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        jTextField2.setBackground(Color.WHITE);
        jTextField2.setForeground(Color.BLACK);
        jTextField2.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        jTextField2.setEditable(false);
        jTextField2.setPreferredSize(new Dimension(250, 35));
        
        // Estilo do ComboBox
        COMBO.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        COMBO.setBackground(Color.WHITE);
        COMBO.setForeground(new Color(40, 40, 40));
        COMBO.setPreferredSize(new Dimension(150, 35));
        
        // Estilo do botão - TEXTO ESCURO
        Ok.setBackground(new Color(41, 128, 185));
        Ok.setForeground(new Color(40, 40, 40)); // Texto escuro
        Ok.setFont(new Font("Segoe UI", Font.BOLD, 13));
        Ok.setFocusPainted(false);
        Ok.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        Ok.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Ok.setPreferredSize(new Dimension(120, 40));
        
        Ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Ok.setBackground(new Color(52, 152, 219));
                Ok.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Ok.setBackground(new Color(41, 128, 185));
                Ok.setForeground(new Color(40, 40, 40));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        Ok = new javax.swing.JButton();
        COMBO = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem dos games");
        setBackground(new java.awt.Color(245, 245, 245));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Nome");

        jLabel2.setText("Tipo");

        Ok.setText("OK");
        Ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OkMouseClicked(evt);
            }
        });

        COMBO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                COMBOItemStateChanged(evt);
            }
        });
        COMBO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                COMBOActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ID dos Jogos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(COMBO, 0, 200, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6)
                .addGap(5, 5, 5)
                .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setSize(500, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void OkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OkMouseClicked
        dispose();
    }//GEN-LAST:event_OkMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        carregaCombo();
        carrega();
    }//GEN-LAST:event_formComponentShown
    
    public static void carregaCombo() {
        COMBO.removeAllItems();
        JogoDAO vDAO = new JogoDAO();
        jogos = vDAO.listar(); 

        if (jogos != null && !jogos.isEmpty()) {
            for (Jogo v : jogos) {
                COMBO.addItem(String.valueOf(v.getId_game()));
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum jogo encontrado!");
        }
    }

    public void carrega() {
        JogoDAO vDAO = new JogoDAO();
        J = vDAO.procurar(id);
        if (J != null) {
            jTextField1.setText(J.getNome());
            jTextField2.setText(J.getTipo());
        } else {
            JOptionPane.showMessageDialog(this, "Jogo não encontrado!");
        }
    }
    
    private void COMBOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_COMBOItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            posicao = COMBO.getSelectedIndex(); 
            if (posicao >= 0 && posicao < jogos.size()) { 
                id = jogos.get(posicao).getId_game(); 
                carrega(); 
            } else {
                JOptionPane.showMessageDialog(this, "Jogo inválido selecionado!");
            }
        }
    }//GEN-LAST:event_COMBOItemStateChanged

    private void COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOActionPerformed
    }//GEN-LAST:event_COMBOActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> COMBO;
    private javax.swing.JButton Ok;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}