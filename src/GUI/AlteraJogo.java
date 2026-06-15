package GUI;

import Classes.Jogo;
import DAO.ErpDAOException;
import DAO.JogoDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.BorderFactory;

public class AlteraJogo extends javax.swing.JFrame {

    private Jogo J = new Jogo();
    int id, posicao;
    private static ArrayList<Jogo> jogos = new ArrayList<Jogo>();

    public AlteraJogo() {
        initComponents();
        setResizable(false);
        setTitle("Alterar Jogo - Sistema de Scores");
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
        
        // Estilo dos campos de texto
        N.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        N.setBackground(Color.WHITE);
        N.setForeground(Color.BLACK);
        N.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        N.setPreferredSize(new Dimension(250, 35));
        
        ESP.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        ESP.setBackground(Color.WHITE);
        ESP.setForeground(Color.BLACK);
        ESP.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        ESP.setPreferredSize(new Dimension(250, 35));
        
        // Estilo do ComboBox
        COMBO.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        COMBO.setBackground(Color.WHITE);
        COMBO.setForeground(new Color(40, 40, 40));
        COMBO.setPreferredSize(new Dimension(200, 35));
        
        // Estilo dos botões - TEXTO ESCURO
        OK.setBackground(new Color(46, 204, 113)); // Verde para salvar
        OK.setForeground(new Color(40, 40, 40)); // Texto escuro
        OK.setFont(new Font("Segoe UI", Font.BOLD, 13));
        OK.setFocusPainted(false);
        OK.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        OK.setCursor(new Cursor(Cursor.HAND_CURSOR));
        OK.setPreferredSize(new Dimension(120, 40));
        
        CAN.setBackground(new Color(149, 165, 166)); // Cinza para cancelar
        CAN.setForeground(new Color(40, 40, 40)); // Texto escuro
        CAN.setFont(new Font("Segoe UI", Font.BOLD, 13));
        CAN.setFocusPainted(false);
        CAN.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        CAN.setCursor(new Cursor(Cursor.HAND_CURSOR));
        CAN.setPreferredSize(new Dimension(120, 40));
        
        // Efeitos hover
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                OK.setBackground(new Color(40, 180, 100));
                OK.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                OK.setBackground(new Color(46, 204, 113));
                OK.setForeground(new Color(40, 40, 40));
            }
        });
        
        CAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CAN.setBackground(new Color(127, 140, 141));
                CAN.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CAN.setBackground(new Color(149, 165, 166));
                CAN.setForeground(new Color(40, 40, 40));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ESP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        OK = new javax.swing.JButton();
        CAN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        N = new javax.swing.JTextField();
        COMBO = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar Jogo");
        setBackground(new java.awt.Color(245, 245, 245));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        ESP.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        ESP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ESPActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Tipo:");

        OK.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        OK.setText("Salvar");
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });

        CAN.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        CAN.setText("Cancelar");
        CAN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CANMouseClicked(evt);
            }
        });
        CAN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CANActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Nome:");

        N.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        N.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NActionPerformed(evt);
            }
        });

        COMBO.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                COMBOItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(COMBO, 0, 200, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(ESP, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CAN, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(COMBO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(N, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ESP, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CAN, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setSize(500, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OKMouseClicked
        Jogo J = new Jogo();
        String nome = "", tipo = "";
        J.setId_game(id);
        if (N.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "⚠️ O Campo nome não pode estar vazio!");
        } else if (ESP.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "⚠️ O Campo tipo não pode estar vazio!");
        } else {
            J.setNome(N.getText());
            J.setTipo(ESP.getText());
            JogoDAO JDAO = new JogoDAO();
            JDAO.atualizar(J);
            JOptionPane.showMessageDialog(rootPane, "✅ Atualização efetuada com sucesso!");
            dispose();
        }
    }//GEN-LAST:event_OKMouseClicked

    private void CANMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CANMouseClicked
        dispose();
    }//GEN-LAST:event_CANMouseClicked

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        carregaCombo();
        carrega();
    }//GEN-LAST:event_formComponentShown

    private void ESPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ESPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ESPActionPerformed

    private void CANActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CANActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CANActionPerformed

    private void NActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NActionPerformed

    private void COMBOItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_COMBOItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            posicao = COMBO.getSelectedIndex();
            if (posicao >= 0 && posicao < jogos.size()) {
                id = jogos.get(posicao).getId_game();
                carrega();
            }
        }
    }//GEN-LAST:event_COMBOItemStateChanged
    
    public static void carregaCombo() {
        COMBO.removeAllItems();
        JogoDAO JDAO = new JogoDAO();
        jogos = JDAO.listar();
        if (jogos != null && !jogos.isEmpty()) {
            for (int i = 0; i < jogos.size(); i++) {
                COMBO.addItem(jogos.get(i).getId_game() + "");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum jogo encontrado!");
        }
    }

    public void carrega() {
        JogoDAO JDAO = new JogoDAO();
        J = JDAO.procurar(id);
        if (J != null) {
            N.setText(J.getNome());
            ESP.setText(J.getTipo());
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CAN;
    private static javax.swing.JComboBox<String> COMBO;
    private javax.swing.JTextField ESP;
    private javax.swing.JTextField N;
    private javax.swing.JButton OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}