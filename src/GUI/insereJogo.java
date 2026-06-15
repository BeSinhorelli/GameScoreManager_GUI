package GUI;

import Classes.Jogo;
import DAO.ErpDAOException;
import DAO.JogoDAO;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.BorderFactory;

public class insereJogo extends javax.swing.JFrame {

    public insereJogo() {
        initComponents();
        setResizable(false);
        setTitle("Inserir Jogo - Sistema de Scores");
        aplicarEstilos();
        setLocationRelativeTo(null);
    }

    insereJogo(int codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void aplicarEstilos() {
        // Fundo da janela
        getContentPane().setBackground(new Color(245, 245, 245));
        
        // Estilo dos labels (texto escuro)
        jLabel1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jLabel1.setForeground(new Color(40, 40, 40));
        
        jLabel5.setFont(new Font("Segoe UI", Font.BOLD, 13));
        jLabel5.setForeground(new Color(40, 40, 40));
        
        // Estilo dos campos de texto
        NO.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        NO.setBackground(Color.WHITE);
        NO.setForeground(Color.BLACK);
        NO.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
            BorderFactory.createEmptyBorder(5, 8, 5, 8)
        ));
        
        NA.setFont(new Font("Segoe UI", Font.PLAIN, 13));
        NA.setBackground(Color.WHITE);
        NA.setForeground(Color.BLACK);
        NA.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(new Color(200, 200, 200), 1),
            BorderFactory.createEmptyBorder(5, 8, 5, 8)
        ));
        
        // Estilo dos botões com texto escuro
        OK.setBackground(new Color(46, 204, 113)); // Verde
        OK.setForeground(new Color(40, 40, 40)); // Texto escuro
        OK.setFont(new Font("Segoe UI", Font.BOLD, 13));
        OK.setFocusPainted(false);
        OK.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));
        OK.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        B1.setBackground(new Color(231, 76, 60)); // Vermelho
        B1.setForeground(new Color(40, 40, 40)); // Texto escuro
        B1.setFont(new Font("Segoe UI", Font.BOLD, 13));
        B1.setFocusPainted(false);
        B1.setBorder(BorderFactory.createEmptyBorder(8, 20, 8, 20));
        B1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Efeito hover nos botões
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
        
        B1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                B1.setBackground(new Color(210, 60, 45));
                B1.setForeground(Color.BLACK);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                B1.setBackground(new Color(231, 76, 60));
                B1.setForeground(new Color(40, 40, 40));
            }
        });
        
        // Esconder labels não usados
        jLabel2.setVisible(false);
        jLabel4.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        NO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NA = new javax.swing.JTextField();
        B1 = new javax.swing.JButton();
        OK = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(245, 245, 245));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel1.setText("Nome:");

        NO.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        NO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOActionPerformed(evt);
            }
        });

        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        jLabel5.setText("Tipo:");

        NA.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        NA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NAActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        B1.setText("Cancelar");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        OK.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        OK.setText("Salvar");
        OK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OKMouseClicked(evt);
            }
        });
        OK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(NO, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(NA, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NO, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(NA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(OK, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
        setSize(480, 320);
    }// </editor-fold>                        

    private void NOActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void NAActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {                                   
        dispose();
    }                                  

    private void OKMouseClicked(java.awt.event.MouseEvent evt) {                                
        String nome = "", tipo = "";
        if (NO.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Você precisa digitar o nome do jogo!");
        } else if (NA.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Você precisa digitar o tipo do jogo!");
        } else {
            nome = NO.getText();
            tipo = NA.getText();
            J.setNome(nome);
            J.setTipo(tipo);
            JogoDAO JDAO = new JogoDAO();
            JDAO.inserir(J);
            JOptionPane.showMessageDialog(rootPane, "Jogo inserido com sucesso!");
            dispose();
        }
    }                               

    private void OKActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // TODO add your handling code here:
    }                                  


    // Variables declaration - do not modify                     
    private javax.swing.JButton B1;
    private javax.swing.JTextField NA;
    private javax.swing.JTextField NO;
    private javax.swing.JButton OK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration                   
    private Jogo J = new Jogo();
}