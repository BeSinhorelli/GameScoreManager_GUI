/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Classes.Score;
import Classes.Player;
import Classes.Jogo;
import DAO.ErpDAOException;
import DAO.JogoDAO;
import DAO.ScoreDAO;
import DAO.playerDAO;
import static java.lang.String.format;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.*;
import javax.swing.BorderFactory;

public class InserirScore extends javax.swing.JFrame {

    private static ArrayList<Player> players = new ArrayList<Player>();
    private static ArrayList<Jogo> jogos = new ArrayList<Jogo>();
    private static ArrayList<Score> scores = new ArrayList<Score>();
    private static int posi, posi2;
    private static int id, id2;

    public InserirScore() {
        initComponents();
        setResizable(false);
        setTitle("Inserir Score - Sistema de Scores");
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
        
        jLabel3.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jLabel3.setForeground(new Color(40, 40, 40));
        jLabel3.setPreferredSize(new Dimension(80, 25));
        
        jLabel5.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jLabel5.setForeground(new Color(40, 40, 40));
        jLabel5.setPreferredSize(new Dimension(80, 25));
        
        // Estilo do campo de texto
        jTextField1.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        jTextField1.setBackground(Color.WHITE);
        jTextField1.setForeground(Color.BLACK);
        jTextField1.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        jTextField1.setPreferredSize(new Dimension(200, 35));
        
        // Estilo dos ComboBoxes
        CB_cliente.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        CB_cliente.setBackground(Color.WHITE);
        CB_cliente.setForeground(new Color(40, 40, 40));
        CB_cliente.setPreferredSize(new Dimension(250, 35));
        
        CB_veiculo.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        CB_veiculo.setBackground(Color.WHITE);
        CB_veiculo.setForeground(new Color(40, 40, 40));
        CB_veiculo.setPreferredSize(new Dimension(250, 35));
        
        // Estilo do DateChooser
        DC.setBackground(Color.WHITE);
        DC.setBorder(BorderFactory.createLineBorder(new Color(180, 180, 180), 1));
        DC.setPreferredSize(new Dimension(250, 200));
        
        // Estilo dos botões - TEXTO ESCURO
        BT_confirmar.setBackground(new Color(46, 204, 113)); // Verde para salvar
        BT_confirmar.setForeground(new Color(40, 40, 40)); // Texto escuro
        BT_confirmar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        BT_confirmar.setFocusPainted(false);
        BT_confirmar.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        BT_confirmar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BT_confirmar.setPreferredSize(new Dimension(120, 40));
        
        BT_cancelar.setBackground(new Color(149, 165, 166)); // Cinza para cancelar
        BT_cancelar.setForeground(new Color(40, 40, 40)); // Texto escuro
        BT_cancelar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        BT_cancelar.setFocusPainted(false);
        BT_cancelar.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        BT_cancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        BT_cancelar.setPreferredSize(new Dimension(120, 40));
        
        // Efeitos hover
        BT_confirmar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_confirmar.setBackground(new Color(40, 180, 100));
                BT_confirmar.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_confirmar.setBackground(new Color(46, 204, 113));
                BT_confirmar.setForeground(new Color(40, 40, 40));
            }
        });
        
        BT_cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BT_cancelar.setBackground(new Color(127, 140, 141));
                BT_cancelar.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BT_cancelar.setBackground(new Color(149, 165, 166));
                BT_cancelar.setForeground(new Color(40, 40, 40));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        choice1 = new java.awt.Choice();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BT_cancelar = new javax.swing.JButton();
        CB_cliente = new javax.swing.JComboBox<>();
        CB_veiculo = new javax.swing.JComboBox<>();
        DC = new datechooser.beans.DateChooserPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        BT_confirmar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Inserir Score");
        setBackground(new java.awt.Color(245, 245, 245));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("PLAYER");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("JOGO");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel3.setText("DATA");

        BT_cancelar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        BT_cancelar.setText("Cancelar");
        BT_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_cancelarActionPerformed(evt);
            }
        });

        CB_cliente.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        CB_cliente.setToolTipText("");
        CB_cliente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_clienteItemStateChanged(evt);
            }
        });

        CB_veiculo.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        CB_veiculo.setToolTipText("");
        CB_veiculo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_veiculoItemStateChanged(evt);
            }
        });

        DC.addSelectionChangedListener(new datechooser.events.SelectionChangedListener() {
            public void onSelectionChange(datechooser.events.SelectionChangedEvent evt) {
                DCOnSelectionChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("SCORE");

        BT_confirmar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        BT_confirmar.setText("Salvar");
        BT_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_confirmarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CB_cliente, 0, 250, Short.MAX_VALUE)
                    .addComponent(CB_veiculo, 0, 250, Short.MAX_VALUE)
                    .addComponent(DC, 0, 250, Short.MAX_VALUE)
                    .addComponent(jTextField1, 0, 200, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(BT_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BT_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(CB_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CB_veiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(DC, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BT_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setSize(550, 520);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_BT_cancelarActionPerformed

    private void CB_clienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_clienteItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            posi = CB_cliente.getSelectedIndex(); 
            if (posi >= 0 && posi < players.size()) { 
                id = players.get(posi).getId_player(); 
            }
        }
    }//GEN-LAST:event_CB_clienteItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregaComboJogos();
        carregaComboPlayers();
    }//GEN-LAST:event_formWindowOpened

    private void CB_veiculoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_veiculoItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            posi2 = CB_veiculo.getSelectedIndex();
            if (posi2 >= 0 && posi2 < jogos.size()) {
                id2 = jogos.get(posi2).getId_game();
            }
        }
    }//GEN-LAST:event_CB_veiculoItemStateChanged

    private void DCOnSelectionChange(datechooser.events.SelectionChangedEvent evt) {//GEN-FIRST:event_DCOnSelectionChange
        // TODO add your handling code here:
    }//GEN-LAST:event_DCOnSelectionChange

    private void BT_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_confirmarActionPerformed
        ScoreDAO pdao = new ScoreDAO();
        Score A = new Score();
        A.setId_game(id2);
        A.setId_player(id);
        Calendar dateStart = DC.getSelectedDate();
        if (dateStart == null) {
            JOptionPane.showMessageDialog(this, "⚠️ Por favor selecione a data!");
            return;
        }
        Date data = dateStart.getTime();
        A.setData(data);
        try {
            int valorTotal = Integer.parseInt(jTextField1.getText());
            A.setScore(valorTotal);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "⚠️ Insira um valor válido para o score!");
            return;
        }
        try {
            pdao.inserir(A);
            JOptionPane.showMessageDialog(this, "✅ Score registrado com sucesso!");
            dispose();
        } catch (ErpDAOException ex) {
            Logger.getLogger(InserirScore.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "❌ Erro ao registrar Score: " + ex.getMessage());
        }
    }//GEN-LAST:event_BT_confirmarActionPerformed

    public static void carregaComboJogos() {
        CB_veiculo.removeAllItems();
        JogoDAO vDAO = new JogoDAO();
        jogos = vDAO.listar();
        if (jogos != null && !jogos.isEmpty()) {
            for (int i = 0; i < jogos.size(); i++) {
                CB_veiculo.addItem(jogos.get(i).getNome());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum jogo encontrado!");
        }
    }

    public static void carregaComboPlayers() {
        CB_cliente.removeAllItems();
        playerDAO cDAO = new playerDAO();
        players = cDAO.listar();
        if (players != null && !players.isEmpty()) {
            for (int i = 0; i < players.size(); i++) {
                CB_cliente.addItem(players.get(i).getNickname());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum player encontrado!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_cancelar;
    private javax.swing.JButton BT_confirmar;
    private static javax.swing.JComboBox<String> CB_cliente;
    private static javax.swing.JComboBox<String> CB_veiculo;
    private datechooser.beans.DateChooserPanel DC;
    private java.awt.Choice choice1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
    
    private JTextArea setString(String date) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}