package GUI;

import Classes.Jogo;
import DAO.ErpDAOException;
import DAO.JogoDAO;
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

public class ExcluirJogo extends javax.swing.JFrame {

    private Jogo J = new Jogo();
    int id, posi;
    private static ArrayList<Jogo> jogos = new ArrayList<Jogo>();

    public ExcluirJogo() {
        initComponents();
        setResizable(false);
        setTitle("Excluir Jogo - Sistema de Scores");
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
        nome.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        nome.setBackground(Color.WHITE);
        nome.setForeground(Color.BLACK);
        nome.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        nome.setEditable(false);
        nome.setPreferredSize(new Dimension(250, 35));
        
        especialidade.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        especialidade.setBackground(Color.WHITE);
        especialidade.setForeground(Color.BLACK);
        especialidade.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(180, 180, 180), 1),
            BorderFactory.createEmptyBorder(8, 10, 8, 10)
        ));
        especialidade.setEditable(false);
        especialidade.setPreferredSize(new Dimension(250, 35));
        
        // Estilo do ComboBox
        CB_nome.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        CB_nome.setBackground(Color.WHITE);
        CB_nome.setForeground(new Color(40, 40, 40));
        CB_nome.setPreferredSize(new Dimension(200, 35));
        
        // Estilo dos botões - TEXTO ESCURO
        ok.setBackground(new Color(231, 76, 60)); // Vermelho para excluir
        ok.setForeground(new Color(40, 40, 40)); // Texto escuro
        ok.setFont(new Font("Segoe UI", Font.BOLD, 13));
        ok.setFocusPainted(false);
        ok.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        ok.setCursor(new Cursor(Cursor.HAND_CURSOR));
        ok.setPreferredSize(new Dimension(120, 40));
        
        cancelar.setBackground(new Color(149, 165, 166)); // Cinza para cancelar
        cancelar.setForeground(new Color(40, 40, 40)); // Texto escuro
        cancelar.setFont(new Font("Segoe UI", Font.BOLD, 13));
        cancelar.setFocusPainted(false);
        cancelar.setBorder(BorderFactory.createEmptyBorder(8, 25, 8, 25));
        cancelar.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancelar.setPreferredSize(new Dimension(120, 40));
        
        // Efeitos hover
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ok.setBackground(new Color(210, 60, 45));
                ok.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ok.setBackground(new Color(231, 76, 60));
                ok.setForeground(new Color(40, 40, 40));
            }
        });
        
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelar.setBackground(new Color(127, 140, 141));
                cancelar.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelar.setBackground(new Color(149, 165, 166));
                cancelar.setForeground(new Color(40, 40, 40));
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ok = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        CB_nome = new javax.swing.JComboBox<>();
        nome = new javax.swing.JTextField();
        especialidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Excluir Jogo");
        setBackground(new java.awt.Color(245, 245, 245));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ok.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        ok.setText("EXCLUIR");
        ok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                okMouseClicked(evt);
            }
        });

        cancelar.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Nome");

        CB_nome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        CB_nome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_nomeItemStateChanged(evt);
            }
        });

        nome.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        especialidade.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel2.setText("Tipo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CB_nome, 0, 200, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(CB_nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(especialidade, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
        setSize(500, 380);
    }// </editor-fold>//GEN-END:initComponents

    private void okMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_okMouseClicked
        Jogo M = new Jogo();
        M.setId_game(id);
        if (nome.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "⚠️ O Campo nome não pode estar vazio!");
        } else if (especialidade.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "⚠️ O Campo tipo não pode estar vazio!");
        } else {
            M.setNome(nome.getText());
            M.setTipo(especialidade.getText());
            JogoDAO MDAO = new JogoDAO();
            int confirmar = JOptionPane.showConfirmDialog(null, "⚠️ Tem certeza que deseja excluir este jogo?", "Confirmar exclusão", JOptionPane.YES_NO_OPTION);
            if (confirmar == JOptionPane.YES_OPTION) {
                try {
                    MDAO.excluir(M);
                    JOptionPane.showMessageDialog(rootPane, "✅ Jogo excluído com sucesso!");
                    dispose();
                } catch (ErpDAOException ex) {
                    Logger.getLogger(ExcluirJogo.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(rootPane, "❌ Erro ao excluir jogo: " + ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_okMouseClicked

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        dispose();
    }//GEN-LAST:event_cancelarMouseClicked

    private void CB_nomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_nomeItemStateChanged
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            posi = CB_nome.getSelectedIndex();
            if (posi >= 0 && posi < jogos.size()) {
                id = jogos.get(posi).getId_game();
                carregar();
            }
        }
    }//GEN-LAST:event_CB_nomeItemStateChanged

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentShown

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        carregaCombo();
        carregar();
    }//GEN-LAST:event_formWindowOpened

    public static void carregaCombo() {
        CB_nome.removeAllItems();
        JogoDAO MDAO = new JogoDAO();
        jogos = MDAO.listar();
        if (jogos != null && !jogos.isEmpty()) {
            for (int i = 0; i < jogos.size(); i++) {
                CB_nome.addItem(jogos.get(i).getId_game() + "");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum jogo encontrado!");
        }
    }

    public void carregar() {
        JogoDAO PDAO = new JogoDAO();
        J = PDAO.procurar(id);
        if (J != null) {
            nome.setText(J.getNome());
            especialidade.setText(J.getTipo());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JComboBox<String> CB_nome;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField especialidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField nome;
    private javax.swing.JButton ok;
    // End of variables declaration//GEN-END:variables
}