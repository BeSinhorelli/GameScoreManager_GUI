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

public class ExcluirPlayer extends javax.swing.JFrame {

    private int id = -1, posicao;
    private Player play = new Player();
    private static ArrayList<Player> players = new ArrayList<>();

    public ExcluirPlayer() {
        initComponents();
        setResizable(false);
        setTitle("Excluir Player - Sistema de Scores");
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
        
        jLabel5.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jLabel5.setForeground(new Color(40, 40, 40));
        jLabel5.setPreferredSize(new Dimension(80, 25));
        
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
        jComboBox1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        jComboBox1.setBackground(Color.WHITE);
        jComboBox1.setForeground(new Color(40, 40, 40));
        jComboBox1.setPreferredSize(new Dimension(200, 35));
        
        // Estilo dos botões - TEXTO ESCURO
        jButton3.setBackground(new Color(231, 76, 60)); // Vermelho para excluir
        jButton3.setForeground(new Color(40, 40, 40)); // Texto escuro
        jButton3.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jButton3.setFocusPainted(false);
        jButton3.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        jButton3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new Dimension(120, 40));
        
        jButton4.setBackground(new Color(149, 165, 166)); // Cinza para cancelar
        jButton4.setForeground(new Color(40, 40, 40)); // Texto escuro
        jButton4.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jButton4.setFocusPainted(false);
        jButton4.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        jButton4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        jButton4.setPreferredSize(new Dimension(120, 40));
        
        // Efeitos hover
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3.setBackground(new Color(210, 60, 45));
                jButton3.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3.setBackground(new Color(231, 76, 60));
                jButton3.setForeground(new Color(40, 40, 40));
            }
        });
        
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4.setBackground(new Color(127, 140, 141));
                jButton4.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4.setBackground(new Color(149, 165, 166));
                jButton4.setForeground(new Color(40, 40, 40));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Player");
        setBackground(new java.awt.Color(245, 245, 245));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jButton3.setText("Excluir");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Cancelar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jTextField1.setEditable(false);

        jLabel1.setText("Nickname");

        jTextField2.setEditable(false);
        jTextField2.setToolTipText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Email");

        jLabel5.setText("Plataforma");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, 200, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setSize(500, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        carregarCombo();
        atualizarSelecao();
    }//GEN-LAST:event_formComponentShown

    private void atualizarSelecao() {
        posicao = jComboBox1.getSelectedIndex();
        if (posicao >= 0 && posicao < players.size()) {
            id = players.get(posicao).getId_player();
            preencherCampos();
        }
    }

    private void carregarCombo() {
        jComboBox1.removeAllItems();
        playerDAO cDAO = new playerDAO();
        players = cDAO.listar();
        if (players != null && !players.isEmpty()) {
            for (Player p : players) {
                jComboBox1.addItem(p.getId_player() + "");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Nenhum jogador encontrado.");
        }
    }

    private void preencherCampos() {
        playerDAO cDAO = new playerDAO();
        try {
            play = cDAO.procurar(id);
            if (play != null) {
                jTextField1.setText(play.getNickname());
                jTextField4.setText(play.getPlataforma());
                jTextField2.setText(play.getEmail());
            } else {
                JOptionPane.showMessageDialog(this, "Jogador não encontrado.");
            }
        } catch (ErpDAOException ex) {
            Logger.getLogger(ExcluirPlayer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            posicao = jComboBox1.getSelectedIndex();
            if (posicao >= 0 && posicao < players.size()) {
                id = players.get(posicao).getId_player();
                preencherCampos();
            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        dispose();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        excluirPlayer();
    }//GEN-LAST:event_jButton3MouseClicked

    private void excluirPlayer() {
        if (id <= 0) {
            JOptionPane.showMessageDialog(this, "Nenhum jogador selecionado.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(this, "⚠️ Tem certeza que deseja excluir este player?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            try {
                playerDAO cDAO = new playerDAO();
                Player play = new Player();
                play.setId_player(id);
                cDAO.excluir(play);
                JOptionPane.showMessageDialog(this, "✅ Player excluído com sucesso!");
                carregarCombo();
                limparCampos();
            } catch (ErpDAOException ex) {
                Logger.getLogger(ExcluirPlayer.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "❌ Erro ao excluir player: " + ex.getMessage());
            }
        }
    }
    
    private void limparCampos() {
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField4.setText("");
        id = -1;
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private static javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}