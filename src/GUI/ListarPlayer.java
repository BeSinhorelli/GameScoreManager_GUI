/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Player;
import DAO.ErpDAOException;
import DAO.playerDAO;
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

public class ListarPlayer extends javax.swing.JFrame {

    private Player P = new Player();
    int id, posicao;
    private static ArrayList<Player> players = new ArrayList<Player>();

    public ListarPlayer() {
        initComponents();
        setResizable(false);
        setTitle("Listar Players - Sistema de Scores");
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
        
        jLabel4.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jLabel4.setForeground(new Color(40, 40, 40));
        jLabel4.setPreferredSize(new Dimension(80, 25));
        
        jLabel3.setFont(new Font("Segoe UI", Font.BOLD, 14));
        jLabel3.setForeground(new Color(40, 40, 40));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        
        // Estilo dos campos de texto
        javax.swing.JTextField[] campos = {jTextField1, jTextField2, jTextField4};
        for (javax.swing.JTextField campo : campos) {
            campo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
            campo.setBackground(Color.WHITE);
            campo.setForeground(Color.BLACK);
            campo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
                BorderFactory.createEmptyBorder(8, 10, 8, 10)
            ));
            campo.setEditable(false);
            campo.setPreferredSize(new Dimension(250, 35));
        }
        
        // Estilo do ComboBox
        COMBO.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        COMBO.setBackground(Color.WHITE);
        COMBO.setForeground(new Color(40, 40, 40));
        COMBO.setPreferredSize(new Dimension(150, 35));
        
        // Estilo do botão - TEXTO ESCURO
        Confirmar.setBackground(new Color(41, 128, 185));
        Confirmar.setForeground(new Color(40, 40, 40)); // Texto escuro
        Confirmar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        Confirmar.setFocusPainted(false);
        Confirmar.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        Confirmar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Confirmar.setPreferredSize(new Dimension(120, 40));
        
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Confirmar.setBackground(new Color(52, 152, 219));
                Confirmar.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Confirmar.setBackground(new Color(41, 128, 185));
                Confirmar.setForeground(new Color(40, 40, 40));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        Confirmar = new javax.swing.JButton();
        COMBO = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Listagem dos players");
        setBackground(new java.awt.Color(245, 245, 245));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jLabel1.setText("Nickname");

        jLabel2.setText("Plataforma");

        jLabel4.setText("Email");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        Confirmar.setText("OK");
        Confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConfirmarMouseClicked(evt);
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

        jLabel3.setText("ID dos players");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(COMBO, 0, 200, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
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
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(Confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setSize(500, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ConfirmarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConfirmarMouseClicked
        dispose();
    }//GEN-LAST:event_ConfirmarMouseClicked

    private void COMBOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_COMBOItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            posicao = COMBO.getSelectedIndex(); 
            if (posicao >= 0 && posicao < players.size()) { 
                id = players.get(posicao).getId_player(); 
                carrega(); 
            } else {
                JOptionPane.showMessageDialog(this, "Player inválido selecionado!");
            }
        }
    }//GEN-LAST:event_COMBOItemStateChanged

    private void COMBOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_COMBOActionPerformed
    }//GEN-LAST:event_COMBOActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        carregaCombo();
        carrega();
    }//GEN-LAST:event_formComponentShown

    public static void carregaCombo() {
        COMBO.removeAllItems();
        playerDAO cDAO = new playerDAO();
        players = cDAO.listar(); 

        if (players != null && !players.isEmpty()) {
            for (Player c : players) {  
                COMBO.addItem(String.valueOf(c.getId_player()));  
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum player encontrado!");
        }
    }

    public void carrega() {
        try {
            playerDAO cDAO = new playerDAO();
            P = cDAO.procurar(id);
            if (P != null) {
                jTextField1.setText(P.getNickname());
                jTextField2.setText(P.getPlataforma());
                jTextField4.setText(P.getEmail());
            } else {
              JOptionPane.showMessageDialog(this, "Player não encontrado!");
            }
        } catch (ErpDAOException ex) {
            Logger.getLogger(ListarPlayer.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Erro ao carregar os dados do player.");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> COMBO;
    private javax.swing.JButton Confirmar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}