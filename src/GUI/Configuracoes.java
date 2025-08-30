package GUI;

import Classes.config;
import Conexao.arquivo;
import javax.swing.JOptionPane;

public class Configuracoes extends javax.swing.JFrame {

    public Configuracoes() {
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null); // Centralizar a janela
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        SRV = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        P = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        BD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        U = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        PW = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        BC = new javax.swing.JButton();
        BS = new javax.swing.JButton();
        jButtonTestar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configurações do Banco de Dados");
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(240, 240, 240));
        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));

        jLabelTitulo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelTitulo.setText("Configurações do Banco de Dados");
        jLabelTitulo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 10, 0));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Parâmetros de Conexão"));
        jPanel2.setLayout(new java.awt.GridLayout(5, 2, 10, 10));

        jLabel7.setText("Servidor/IP:");
        jLabel7.setToolTipText("Endereço do servidor de banco de dados");
        jPanel2.add(jLabel7);

        SRV.setToolTipText("Exemplo: localhost ou 192.168.1.100");
        jPanel2.add(SRV);

        jLabel2.setText("Porta:");
        jLabel2.setToolTipText("Porta de conexão do banco de dados");
        jPanel2.add(jLabel2);

        P.setToolTipText("Exemplo: 3306 para MySQL, 5432 para PostgreSQL");
        jPanel2.add(P);

        jLabel3.setText("Banco de Dados:");
        jLabel3.setToolTipText("Nome do banco de dados");
        jPanel2.add(jLabel3);

        BD.setToolTipText("Nome do banco de dados que será utilizado");
        jPanel2.add(BD);

        jLabel4.setText("Usuário:");
        jLabel4.setToolTipText("Nome de usuário para acesso ao banco");
        jPanel2.add(jLabel4);

        U.setToolTipText("Usuário com permissões no banco de dados");
        jPanel2.add(U);

        jLabel5.setText("Senha:");
        jLabel5.setToolTipText("Senha do usuário do banco de dados");
        jPanel2.add(jLabel5);

        PW.setToolTipText("Senha de acesso ao banco de dados");
        jPanel2.add(PW);

        jPanel3.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));

        jButtonTestar.setText("Testar Conexão");
        jButtonTestar.setToolTipText("Testar se as configurações estão corretas");
        jButtonTestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTestarActionPerformed(evt);
            }
        });
        jPanel3.add(jButtonTestar);

        BC.setText("Cancelar");
        BC.setToolTipText("Fechar sem salvar as alterações");
        BC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCActionPerformed(evt);
            }
        });
        jPanel3.add(BC);

        BS.setText("Salvar");
        BS.setToolTipText("Salvar as configurações");
        BS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSActionPerformed(evt);
            }
        });
        jPanel3.add(BS);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 450, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void BCActionPerformed(java.awt.event.ActionEvent evt) {                                   
        int resposta = JOptionPane.showConfirmDialog(this, 
            "Deseja realmente cancelar? Todas as alterações não salvas serão perdidas.", 
            "Confirmar Cancelamento", 
            JOptionPane.YES_NO_OPTION, 
            JOptionPane.QUESTION_MESSAGE);
        
        if (resposta == JOptionPane.YES_OPTION) {
            dispose();
        }
    }                                  

    private void formComponentShown(java.awt.event.ComponentEvent evt) {                                    
        try {
            config CF = arquivo.le();
            SRV.setText(CF.getServer());
            P.setText(CF.getPorta());
            BD.setText(CF.getBanco());
            U.setText(CF.getUser());
            PW.setText(CF.getPassword());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao carregar configurações: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }                                   

    private void BSActionPerformed(java.awt.event.ActionEvent evt) {                                   
        // Validar campos obrigatórios
        if (!validarCampos()) {
            return;
        }
        
        config CF = new config();
        CF.setServer(SRV.getText().trim());
        CF.setPorta(P.getText().trim());
        CF.setBanco(BD.getText().trim());
        CF.setUser(U.getText().trim());
        CF.setPassword(new String(PW.getPassword()));
        
        try {
            arquivo.grava(CF);
            JOptionPane.showMessageDialog(this, 
                "Configurações salvas com sucesso!\n", 
                "Sucesso", 
                JOptionPane.INFORMATION_MESSAGE);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Erro ao salvar configurações: " + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
        }
    }                                  

    private void jButtonTestarActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (!validarCampos()) {
            return;
        }
        
        // Aqui você implementaria a lógica de teste de conexão
        // Por enquanto, apenas uma simulação
        JOptionPane.showMessageDialog(this, 
            "Funcionalidade de teste de conexão será implementada aqui.\n\n" +
            "Configurações atuais:\n" +
            "Servidor: " + SRV.getText() + "\n" +
            "Porta: " + P.getText() + "\n" +
            "Banco: " + BD.getText() + "\n" +
            "Usuário: " + U.getText(), 
            "Teste de Conexão", 
            JOptionPane.INFORMATION_MESSAGE);
    }                                             
    
    private boolean validarCampos() {
        if (SRV.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Informe o servidor do banco de dados.", 
                "Campo Obrigatório", 
                JOptionPane.WARNING_MESSAGE);
            SRV.requestFocus();
            return false;
        }
        
        if (P.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Informe a porta do banco de dados.", 
                "Campo Obrigatório", 
                JOptionPane.WARNING_MESSAGE);
            P.requestFocus();
            return false;
        }
        
        if (BD.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Informe o nome do banco de dados.", 
                "Campo Obrigatório", 
                JOptionPane.WARNING_MESSAGE);
            BD.requestFocus();
            return false;
        }
        
        if (U.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Informe o usuário do banco de dados.", 
                "Campo Obrigatório", 
                JOptionPane.WARNING_MESSAGE);
            U.requestFocus();
            return false;
        }
        
        // Verificar se a porta é numérica
        try {
            Integer.parseInt(P.getText().trim());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, 
                "A porta deve ser um número válido.", 
                "Porta Inválida", 
                JOptionPane.WARNING_MESSAGE);
            P.requestFocus();
            P.selectAll();
            return false;
        }
        
        return true;
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton BC;
    private javax.swing.JTextField BD;
    private javax.swing.JButton BS;
    private javax.swing.JTextField P;
    private javax.swing.JPasswordField PW;
    private javax.swing.JTextField SRV;
    private javax.swing.JTextField U;
    private javax.swing.JButton jButtonTestar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration                   
}